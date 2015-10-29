package com.pidotech.mobility.sample.service;

import java.util.List;

import org.springframework.stereotype.Service;

public interface SampleService {
	
	/**
	 * selectUser - 단일대상 유저조회
	 *
	 * @return SempleVO
	 * @param SampleVO
	 * @exception Exception
	 */
	public SampleVO selectUser(SampleVO vo) throws Exception;
	
	/**
	 * selectUserList - 유저 리스트 조회
	 *
	 * @return List<SempleVO>
	 * @param SampleVO
	 * @exception Exception
	 */
	public List<SampleVO> selectUserList(SampleVO vo) throws Exception;
	
	/**
	 * insertUser - 유저등록
	 *
	 * @return void
	 * @param SampleVO
	 * @exception Exception
	 */
	public void insertUser(SampleVO vo) throws Exception;
	
	/**
	 * updateUser - 유저정보 수정
	 *
	 * @return void
	 * @param SampleVO
	 * @exception
	 */
	public void updateUser(SampleVO vo) throws Exception;
	
	/**
	 * deleteUser - 유저삭제
	 *
	 * @return void
	 * @param SampleVO
	 * @exception Exception
	 */
	public void deleteUser(SampleVO vo) throws Exception;
}
