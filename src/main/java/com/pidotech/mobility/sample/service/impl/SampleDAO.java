package com.pidotech.mobility.sample.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.pidotech.cmm.dataaccess.AbstractMapper;
import com.pidotech.mobility.sample.service.SampleVO;

@Repository("sampleDAO")
public class SampleDAO extends AbstractMapper {
	/**
	 * selectUser - 단일 사용자 정보 조회
	 *
	 * @return SampleVO
	 * @param SampleVO
	 * @exception Exception
	 */
	public SampleVO selectUser(SampleVO vo) throws Exception {
		
		HashMap result = selectOne("sample.selectUser", vo);
		
		logger.debug("user_id : "+result.get("user_id"));
		return null;
	}
	
	/**
	 * selectUserList - 사용자 리스트 조회
	 *
	 * @return List<SampleVO>
	 * @param SampleVO
	 * @exception Exception
	 */
	public List<SampleVO> selectUserList(SampleVO vo) throws Exception {
		
		return selectList("sample.selectUserList", vo);
	}
}
