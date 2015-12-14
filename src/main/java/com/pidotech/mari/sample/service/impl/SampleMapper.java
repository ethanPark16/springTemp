package com.pidotech.mari.sample.service.impl;

import java.util.HashMap;
import java.util.List;

import com.pidotech.mari.cmm.dataaccess.SqlMapper;
import com.pidotech.mari.sample.service.SampleVO;

@SqlMapper("sampleMapper")
public interface SampleMapper {
	
	/**
	 * selectUser - 단일 사용자 정보 조회
	 *
	 * @return SampleVO
	 * @param SampleVO
	 * @exception Exception
	 */
	public HashMap<String, String> selectUser(SampleVO vo) throws Exception;
	
	/**
	 * selectUserList - 사용자 리스트 조회
	 *
	 * @return List<SampleVO>
	 * @param SampleVO
	 * @exception Exception
	 */
	public List<SampleVO> selectUserList(SampleVO vo) throws Exception;
	
	public int updateUser(HashMap<String, String> map) throws Exception;
}
