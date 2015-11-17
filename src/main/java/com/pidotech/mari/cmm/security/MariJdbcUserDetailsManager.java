package com.pidotech.mari.cmm.security;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContextException;
import org.springframework.dao.DataAccessException;
import org.springframework.security.access.hierarchicalroles.RoleHierarchy;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.provisioning.JdbcUserDetailsManager;

/**
 * MariJdbcUserDetailsManager.java
 * 
 * JdbcUserDetailsManager�� ����� Spring security JDBC Manager
 *	
 * @author ethan
 * @since 2015. 11. 17.
 * @etc 
 *
 */
public class MariJdbcUserDetailsManager extends JdbcUserDetailsManager {
	private static final Logger LOGGER = LoggerFactory.getLogger(MariJdbcUserDetailsManager.class);
	
	private MariUserDetails userDetails = null;
	private MariUsersByUsernameMapping usersByUsernameMapping;
	private String mapperClass;
	private RoleHierarchy roleHierarchy = null;
	
	/**
     * ����� ���̺��� ���� ��ȸ �÷��� ���ǿ��� ����� ����� VO�� ���� �� Ŭ������ �����Ѵ�.
     * 
     * @param mapClass
     */
	public void setMapperClass(String mapperClass){
		this.mapperClass = mapperClass;
	}
	
	/**
     * Role Hierarchy�� �����Ѵ�.
     * 
     * @param roleHierarchy
     */
    public void setRoleHierarchy(RoleHierarchy roleHierarchy) {
        this.roleHierarchy = roleHierarchy;
    }
	
    /**
     * JdbcUserDetailsManager Ŭ���� ������
     */
	@Override
	protected void initDao() throws ApplicationContextException {
		// TODO Auto-generated method stub
		super.initDao();
		
		try {
			initMappingSqlQueries();
		} catch (Exception e) {
			LOGGER.error("UserDetailsManager.initDao.Exception : {}", e.toString(), e);
		}
	}
	
	private void initMappingSqlQueries() throws Exception {
		Class<?> clazz = loadClass(this.mapperClass);
		Constructor<?> constructor = clazz.getConstructor(new Class[] {DataSource.class, String.class });
        Object[] params = new Object[] { getDataSource(), getUsersByUsernameQuery() };
        
        this.usersByUsernameMapping = (MariUsersByUsernameMapping)constructor.newInstance(params);
	}
	
	/**
     * JdbcDaoImpl Ŭ������ loadUsersByUsername �޼ҵ� ������.
     * ����ڸ�(�Ǵ� ID)�� MariUserDetails�� ������ ��ȸ�Ѵ�.
     * 
     * @param username
     * @return
     * @throws UsernameNotFoundException
     * @throws DataAccessException
     */
	@Override
	public MariUserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException, DataAccessException {
		
		List<UserDetails> users = loadUsersByUsername(username);
		
		if (users.size() == 0) {
        	LOGGER.debug("Query returned no results for user '{}'", username);

			throw new UsernameNotFoundException(messages.getMessage("MariJdbcUserDetailsManager.notFound", new Object[] { username }, "Username {0} not found"));
        }
		
		UserDetails obj = users.get(0);
		this.userDetails = (MariUserDetails)obj;
		
		Set<GrantedAuthority> dbAuthsSet = new HashSet<GrantedAuthority>();
		
		dbAuthsSet.addAll(loadUserAuthorities(this.userDetails.getUsername()));
		
		List<GrantedAuthority> dbAuths = new ArrayList<GrantedAuthority>(dbAuthsSet);
		
		addCustomAuthorities(this.userDetails.getUsername(), dbAuths);

        if (dbAuths.size() == 0) {
			throw new UsernameNotFoundException(messages.getMessage("MariJdbcUserDetailsManager.noAuthority", new Object[] { username }, "User {0} has no GrantedAuthority"));
        }
        
        Collection<? extends GrantedAuthority> authorities = roleHierarchy.getReachableGrantedAuthorities(dbAuths);
		
		return new MariUserDetails(this.userDetails.getUsername(), this.userDetails.getPassword(), this.userDetails.isEnabled()
				, true, true, true, authorities, this.userDetails.getUserVO());
	}
	
	/**
     * JdbcDaoImpl Ŭ������ loadUsersByUsername �޼ҵ� ������.
     * ����ڸ�(�Ǵ� ID)�� UserDetails ������ ��ȸ�Ͽ� ����Ʈ �������� �����Ѵ�.
     */
	@Override
	protected List<UserDetails> loadUsersByUsername(String username) {
		List<MariUserDetails> list = usersByUsernameMapping.execute(username);

        ArrayList<UserDetails> newList = new ArrayList<UserDetails>();

        for (MariUserDetails user : list) {
        	newList.add(user);
        }
		return newList;
	}
	
	/**
     * ������ ����� �̸����� ���������(MariUserDetails)�� �����´�.
     * 
     * @return
     * @throws UsernameNotFoundException
     * @throws DataAccessException
     */
    public MariUserDetails getAuthenticatedUser() throws UsernameNotFoundException, DataAccessException {

        return loadUserByUsername(SecurityContextHolder.getContext().getAuthentication().getName());
    }
	
	/**
     * Ŭ���������� ��ü�� �ε��Ѵ�.
     * 
     * @param className
     * @return
     * @throws ClassNotFoundException
     * @throws Exception
     */
	public static Class<?> loadClass(String className) throws ClassNotFoundException, Exception {

		Class<?> clazz = Thread.currentThread().getContextClassLoader().loadClass(className);

		if (clazz == null) {
			clazz = Class.forName(className);
		}

		return clazz;
	}
}
