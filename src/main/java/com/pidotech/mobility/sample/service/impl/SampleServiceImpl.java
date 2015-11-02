package com.pidotech.mobility.sample.service.impl;

import java.util.HashMap;
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
	@Autowired
	public SampleDAO sampleMapper;

	@Override
	public HashMap<String, String> selectUser(SampleVO vo) throws Exception {
		// TODO Auto-generated method stub
		return sampleMapper.selectUser(vo); 
	}

	@Override
	public List<SampleVO> selectUserList(SampleVO vo) throws Exception {
		// TODO Auto-generated method stub
		return sampleDAO.selectUserList(vo);
	}

	@Override
	public int insertUser(SampleVO vo) throws Exception {
		// TODO Auto-generated method stub
		return sampleDAO.insertUser(vo);
	}

	@Override
	public int updateUser(SampleVO vo) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteUser(SampleVO vo) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

}
