package com.pidotech.mobility.sample.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pidotech.mobility.sample.service.SampleService;
import com.pidotech.mobility.sample.service.SampleVO;

/**
 * SampleServiceImpl.java
 *
 * @author ethan
 * @since 2015. 10. 27.
 * @etc 
 *
 */
@Service("sampleService")
public class SampleServiceImpl implements SampleService {
	@Autowired
	public SampleDAO sampleDAO;

	@Override
	public SampleVO selectUser(SampleVO vo) throws Exception {
		// TODO Auto-generated method stub
		return sampleDAO.selectUser(vo); 
	}

	@Override
	public List<SampleVO> selectUserList(SampleVO vo) throws Exception {
		// TODO Auto-generated method stub
		return sampleDAO.selectUserList(vo);
	}

	@Override
	public void insertUser(SampleVO vo) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateUser(SampleVO vo) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteUser(SampleVO vo) throws Exception {
		// TODO Auto-generated method stub

	}

}
