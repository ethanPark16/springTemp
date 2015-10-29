package com.pidotech.mobility.sample.service;

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
	public SampleVO selectUser(SampleVO vo) throws Exception;
	
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
	public void insertUser(SampleVO vo) throws Exception;
	
	/**
	 * updateUser - �������� ����
	 *
	 * @return void
	 * @param SampleVO
	 * @exception
	 */
	public void updateUser(SampleVO vo) throws Exception;
	
	/**
	 * deleteUser - ��������
	 *
	 * @return void
	 * @param SampleVO
	 * @exception Exception
	 */
	public void deleteUser(SampleVO vo) throws Exception;
}
