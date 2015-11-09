package com.pidotech.mari.sample.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.pidotech.mari.cmm.dataaccess.AbstractMapper;
import com.pidotech.mari.sample.service.SampleVO;

@Repository("sampleDAO")
public class SampleDAO extends AbstractMapper {
	/**
	 * selectUser - 단일 사용자 정보 조회
	 *
	 * @return SampleVO
	 * @param vo SampleVO
	 * @exception Exception
	 */
	public HashMap<String, String> selectUser(SampleVO vo) throws Exception {
		
		HashMap<String, String> result = selectOne("sample.selectUser", vo);
		
		logger.debug("user_id : "+result.get("user_id"));
		return null;
	}
	
	/**
	 * selectUserList - 사용자 리스트 조회
	 *
	 * @return List<SampleVO>
	 * @param vo SampleVO
	 * @exception Exception
	 */
	public List<SampleVO> selectUserList(SampleVO vo) throws Exception {
		
		return selectList("sample.selectUserList", vo);
	}
	
	
	public int insertUser(SampleVO vo) throws Exception {
		return insert("sample.insertUser", vo);
	}
	
	public int deleteUser(HashMap<String, String> map) throws Exception {
		return 0;
	}
}
