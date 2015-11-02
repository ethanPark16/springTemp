package com.pidotech.mobility.sample.service.impl;

import java.util.HashMap;
import java.util.List;

import com.pidotech.cmm.dataaccess.Mapper;
import com.pidotech.mobility.sample.service.SampleVO;

@Mapper("sampleMapper")
public interface SampleMapper {
	
	/**
	 * selectUser - ���� ����� ���� ��ȸ
	 *
	 * @return SampleVO
	 * @param SampleVO
	 * @exception Exception
	 */
	public HashMap<String, String> selectUser(SampleVO vo) throws Exception;
	
	/**
	 * selectUserList - ����� ����Ʈ ��ȸ
	 *
	 * @return List<SampleVO>
	 * @param SampleVO
	 * @exception Exception
	 */
	public List<SampleVO> selectUserList(SampleVO vo) throws Exception;
	
	public int updateUser(HashMap<String, String> map) throws Exception;
}
