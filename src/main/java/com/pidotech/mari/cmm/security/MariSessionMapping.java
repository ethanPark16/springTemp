package com.pidotech.mari.cmm.security;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.pidotech.mari.cmm.service.LoginVO;

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

        String userNm    = rs.getString("user_nm");
        String deptId  = rs.getString("dept_id");
        String deptNm    = rs.getString("dept_nm");

		LoginVO loginVO = new LoginVO();
		
		loginVO.setId(userId);
		loginVO.setPassword(password);
		loginVO.setName(userNm);
		loginVO.setDeptId(deptId);
		loginVO.setDeptNm(deptNm);
		
		return new MariUserDetails(userId, password, enabled, loginVO);
	}
}
