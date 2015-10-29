package com.pidotech.mobility.sample.web;

import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pidotech.mobility.HomeController;
import com.pidotech.mobility.sample.service.SampleService;
import com.pidotech.mobility.sample.service.SampleVO;

/**
 * SampleController.java
 * 
 * 각종 처리를 위한 Sample Controller
 *
 * @author ethan
 * @since 2015. 10. 27.
 * @etc 
 *
 */
@Controller
public class SampleController {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	public SampleService sampleService;
	
	/**
	 * samplePage
	 *
	 * @return String
	 * @param 
	 * @exception
	 */
	@RequestMapping(value="/sample/samplePage.do")
	public String samplePage (HttpServletRequest request, Locale locale, ModelMap model) throws Exception {
		
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "/sample/Sample";
	}
	
	/**
	 * getSempleList
	 *
	 * @return String
	 * @param 
	 * @exception Exception
	 */
	@RequestMapping(value="/sample/getSampleList.do")
	public String getSempleList (HttpServletRequest request, ModelMap model) throws Exception {
		
		logger.info("getSempleList");
		
		SampleVO vo = new SampleVO();
		SampleVO result = new SampleVO();
		vo.setUserId("ethan");
		result = sampleService.selectUser(vo); 
		
		//model.addAttribute("userId", result.getUserId());
		//model.addAttribute("userName", result.getUserName());
		
		return "/sample/Sample";
	}
}
