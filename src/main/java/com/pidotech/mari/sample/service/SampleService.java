package com.pidotech.mari.sample.service;

import java.util.HashMap;
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
	public HashMap<String, String> selectUser(SampleVO vo) throws Exception;
	
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
	public int insertUser(SampleVO vo) throws Exception;
	
	/**
	 * updateUser - 유저정보 수정
	 *
	 * @return void
	 * @param SampleVO
	 * @exception
	 */
	public int updateUser(SampleVO vo) throws Exception;
	
	/**
	 * deleteUser - 유저삭제
	 *
	 * @return void
	 * @param SampleVO
	 * @exception Exception
	 */
	public int deleteUser(SampleVO vo) throws Exception;
}
