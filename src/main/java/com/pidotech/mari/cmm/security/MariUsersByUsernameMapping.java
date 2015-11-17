package com.pidotech.mari.cmm.security;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import javax.sql.DataSource;

import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.MappingSqlQuery;

public abstract class MariUsersByUsernameMapping extends MappingSqlQuery<MariUserDetails>{
	/**
     * ����������� ���̺��� ��ȸ�Ͽ� ����ڰ�ü�� �����Ѵ�.
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
