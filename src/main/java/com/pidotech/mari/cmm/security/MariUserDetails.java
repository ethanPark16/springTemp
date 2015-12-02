package com.pidotech.mari.cmm.security;

import java.util.Arrays;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;

/**
 * MariUserDetails.java
 * spring security 의 User 객체를 상속받아 사용자 계정정보를 세션으로 관리한다.
 *
 * @author ethan
 * @since 2015. 11. 25.
 * @etc 
 *
 */
public class MariUserDetails extends User {
	private static final long serialVersionUID = 2517403097977414969L;
	private Object userVO;
	
	/**
     * User 클래스의 생성자 Override
     * 
     * @param username 사용자계정
     * @param password 사용자 패스워드
     * @param enabled 사용자계정 사용여부
     * @param accountNonExpired
     * @param credentialsNonExpired
     * @param accountNonLocked
     * @param authorities
     * @param userVO 사용자 VO객체
     * @throws IllegalArgumentException
     */
    public MariUserDetails(String username, String password, boolean enabled,
            boolean accountNonExpired, boolean credentialsNonExpired,
            boolean accountNonLocked, Collection<? extends GrantedAuthority> authorities,
            Object userVO) throws IllegalArgumentException {

        super(username, password, enabled, accountNonExpired,
            credentialsNonExpired, accountNonLocked, authorities);

        this.userVO = userVO;
    }

    /**
     * MariUserDetails 생성자
     * 
     * @param username
     * @param password
     * @param enabled
     * @param userVO
     * @throws IllegalArgumentException
     */
    public MariUserDetails(String username, String password, boolean enabled, Object userVO) throws IllegalArgumentException {
    	
    	this(username, password, enabled, true, true, true, 
    			Arrays.asList(new GrantedAuthority[] {new SimpleGrantedAuthority("HOLDER")}), userVO);
    }

    /**
     * 인증 객체 얻기.
     * 
     * @return 사용자VO 객체
     */
    public Object getUserVO() {
        return userVO;
    }

    /**
     * 인증 객체 지정.
     * 
     * @param mariVO 사용자VO객체
     */
    public void setUserVO(Object userVO) {
        this.userVO = userVO;
    }
}
