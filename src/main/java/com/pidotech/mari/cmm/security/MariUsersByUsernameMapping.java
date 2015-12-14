package com.pidotech.mari.cmm.security;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import javax.sql.DataSource;

import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.MappingSqlQuery;

/**
 * MariUsersByUsernameMapping.java
 * UsersByUsernameMapping 을 통해 사용자 계정정보를 가져오는 추상객체
 *
 * @author ethan
 * @since 2015. 11. 25.
 * @etc 
 *
 */
public abstract class MariUsersByUsernameMapping extends MappingSqlQuery<MariUserDetails>{
	/**
     * 사용자정보를 테이블에서 조회하여 사용자객체에 매핑한다.
     * @param ds
     * @param usersByUsernameQuery
     */
    public MariUsersByUsernameMapping(DataSource ds, String usersByUsernameQuery) {
        super(ds, usersByUsernameQuery);
        declareParameter(new SqlParameter(Types.VARCHAR));
        compile();
    }

    @Override
    protected abstract MariUserDetails mapRow(ResultSet rs, int rownum) throws SQLException;
}
