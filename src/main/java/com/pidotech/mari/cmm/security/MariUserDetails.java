package com.pidotech.mari.cmm.security;

import java.util.Arrays;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;

public class MariUserDetails extends User {
	private static final long serialVersionUID = 2517403097977414969L;
	private Object userVO;
	
	/**
     * User Ŭ������ ������ Override
     * 
     * @param username ����ڰ���
     * @param password ����� �н�����
     * @param enabled ����ڰ��� ��뿩��
     * @param accountNonExpired
     * @param credentialsNonExpired
     * @param accountNonLocked
     * @param authorities
     * @param egovVO ����� VO��ü
     * @throws IllegalArgumentException
     */
	// CHECKSTYLE:OFF
    public MariUserDetails(String username, String password, boolean enabled,
            boolean accountNonExpired, boolean credentialsNonExpired,
            boolean accountNonLocked, Collection<? extends GrantedAuthority> authorities,
            Object userVO) throws IllegalArgumentException {

        super(username, password, enabled, accountNonExpired,
            credentialsNonExpired, accountNonLocked, authorities);

        this.userVO = userVO;
    }
    // CHECKSTYLE:ON

    /**
     * EgovUserDetails ������
     * 
     * @param username
     * @param password
     * @param enabled
     * @param egovVO
     * @throws IllegalArgumentException
     */
    public MariUserDetails(String username, String password, boolean enabled, Object userVO) throws IllegalArgumentException {
    	
    	this(username, password, enabled, true, true, true, 
    			Arrays.asList(new GrantedAuthority[] {new SimpleGrantedAuthority("HOLDER")}), userVO);
    }

    /**
     * ���� ��ü ���.
     * 
     * @return �����VO ��ü
     */
    public Object getUserVO() {
        return userVO;
    }

    /**
     * ���� ��ü ����.
     * 
     * @param mariVO �����VO��ü
     */
    public void setUserVO(Object userVO) {
        this.userVO = userVO;
    }
}
