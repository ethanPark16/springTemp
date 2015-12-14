package com.pidotech.mari.cmm.security;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.pidotech.mari.cmm.service.LoginVO;

/**
 * MariSessionMapping.java
 * 인증시 가져온 정보를 가져와 세션에 담아준다.
 *
 * @author ethan
 * @since 2015. 11. 25.
 * @etc 
 *
 */
public class MariSessionMapping extends MariUsersByUsernameMapping {
	
	public MariSessionMapping(DataSource ds, String usersByUsernameQuery) {
		// TODO Auto-generated constructor stub
		super(ds, usersByUsernameQuery);
	}
	
	@Override
	protected MariUserDetails mapRow(ResultSet rs, int rownum) throws SQLException {
		
		String userId    = rs.getString("user_id");
        String password  = rs.getString("password");
        boolean enabled  = rs.getBoolean("enabled");

        String userNm    = rs.getString("user_name");
        String orgnztId  = rs.getString("orgnzt_id");
        String orgnztNm    = rs.getString("orgnzt_nm");

		LoginVO loginVO = new LoginVO();
		
		loginVO.setId(userId);
		loginVO.setPassword(password);
		loginVO.setName(userNm);
		loginVO.setOrgnztId(orgnztId);
		loginVO.setOrgnztNm(orgnztNm);
		
		return new MariUserDetails(userId, password, enabled, loginVO);
	}
}
