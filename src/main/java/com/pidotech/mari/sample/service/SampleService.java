package com.pidotech.mari.sample.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

public interface SampleService {
	
	/**
	 * selectUser - ���ϴ�� ������ȸ
	 *
	 * @return SempleVO
	 * @param SampleVO
	 * @exception Exception
	 */
	public HashMap<String, String> selectUser(SampleVO vo) throws Exception;
	
	/**
	 * selectUserList - ���� ����Ʈ ��ȸ
	 *
	 * @return List<SempleVO>
	 * @param SampleVO
	 * @exception Exception
	 */
	public List<SampleVO> selectUserList(SampleVO vo) throws Exception;
	
	/**
	 * insertUser - �������
	 *
	 * @return void
	 * @param SampleVO
	 * @exception Exception
	 */
	public int insertUser(SampleVO vo) throws Exception;
	
	/**
	 * updateUser - �������� ����
	 *
	 * @return void
	 * @param SampleVO
	 * @exception
	 */
	public int updateUser(SampleVO vo) throws Exception;
	
	/**
	 * deleteUser - ��������
	 *
	 * @return void
	 * @param SampleVO
	 * @exception Exception
	 */
	public int deleteUser(SampleVO vo) throws Exception;
}
