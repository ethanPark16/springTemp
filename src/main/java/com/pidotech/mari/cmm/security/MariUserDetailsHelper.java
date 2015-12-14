package com.pidotech.mari.cmm.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.authentication.encoding.ShaPasswordEncoder;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;

import com.pidotech.mari.cmm.util.MariObjectUtil;

/**
 * MariUserDetailsHelper.java
 * 인증된 사용자 계정 정보 제공 유틸리티 
 *
 * @author ethan
 * @since 2015. 11. 25.
 * @etc 
 *
 */
public final class MariUserDetailsHelper {
	private static final Logger LOGGER = LoggerFactory.getLogger(MariUserDetailsHelper.class);
	
	/**
     * 인증된 사용자객체를 VO형식으로 가져온다.
     * 
     * @return 사용자 ValueObject
     */
    public static Object getAuthenticatedUser() {
        SecurityContext context = SecurityContextHolder.getContext();
        Authentication authentication = context.getAuthentication();

        if (MariObjectUtil.isNull(authentication)) {
        	LOGGER.debug("## authentication object is null!!");
            return null;
        }

        if (authentication.getPrincipal() instanceof MariUserDetails) {
        	MariUserDetails details = (MariUserDetails) authentication.getPrincipal();


        	LOGGER.debug("## EgovUserDetailsHelper.getAuthenticatedUser : AuthenticatedUser is {}", details.getUsername());

	        return details.getUserVO();
        } else {
        	return authentication.getPrincipal();
        }
    }

    /**
     * 인증된 사용자의 권한 정보를 가져온다.
     * 예) [ROLE_ADMIN, ROLE_USER,
     * ROLE_A, ROLE_B, ROLE_RESTRICTED,
     * IS_AUTHENTICATED_FULLY,
     * IS_AUTHENTICATED_REMEMBERED,
     * IS_AUTHENTICATED_ANONYMOUSLY]
     * 
     * @return 사용자 권한정보 목록
     */
    public static List<String> getAuthorities() {
        List<String> listAuth = new ArrayList<String>();

        SecurityContext context = SecurityContextHolder.getContext();
        Authentication authentication = context.getAuthentication();

        if (MariObjectUtil.isNull(authentication)) {
        	LOGGER.debug("## authentication object is null!!");
            return null;
        }

        Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();

        Iterator<? extends GrantedAuthority> iter = authorities.iterator();

		while (iter.hasNext()) {
        	GrantedAuthority auth = iter.next();
        	listAuth.add(auth.getAuthority());

        	LOGGER.debug("## EgovUserDetailsHelper.getAuthorities : Authority is {}", auth.getAuthority());

        }

        return listAuth;
    }

    /**
     * 인증된 사용자 여부를 체크한다.
     * 
     * @return 인증된 사용자 여부(TRUE / FALSE)
     */
    public static Boolean isAuthenticated() {
        SecurityContext context = SecurityContextHolder.getContext();
        Authentication authentication = context.getAuthentication();

        if (MariObjectUtil.isNull(authentication)) {
        	LOGGER.debug("## authentication object is null!!");
            return Boolean.FALSE;
        }

        String username = authentication.getName();
        if (username.equals("anonymousUser")) {
        	LOGGER.debug("## username is {}", username);
            return Boolean.FALSE;
        }

        Object principal = authentication.getPrincipal();

        return (Boolean.valueOf(!MariObjectUtil.isNull(principal)));
    }

    /**
     * 기본 algorithmd(SHA-256)에 대한 패스워드 얻기.
     * 
     * @param password
     * @return
     */
    public static String getHashedPassword(String password) {
    	ShaPasswordEncoder encoder = new ShaPasswordEncoder(256);
    	String hashed = encoder.encodePassword(password, null);

		return hashed;
    }
    
}
