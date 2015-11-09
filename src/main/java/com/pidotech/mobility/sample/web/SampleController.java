package com.pidotech.mobility.sample.web;

import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
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
	 * @param request HttpServletRequest
	 * @param locale Locale
	 * @param model ModelMap
	 * @exception Exception
	 */
	@RequestMapping(value= {"/", "/sample/samplePageMain.do"})
	public String samplePageMain (HttpServletRequest request, Locale locale, ModelMap model) throws Exception {
		
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "/sample/main";
	}
	
	/**
	 * samplePage - dataTable
	 *
	 * @return String
	 * @param request HttpServletRequest
	 * @param locale Locale
	 * @param model ModelMap
	 * @exception Exception
	 */
	@RequestMapping(value="/sample/dataTable.do")
	public String samplePage (HttpServletRequest request, Locale locale, ModelMap model) throws Exception {
		
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "/sample/table";
	}
	
	/**
	 * dataTableList (VO & DAO 사용 예제)
	 *
	 * @return String
	 * @param request HttpServletRequest
	 * @param model ModelMap
	 * @exception Exception
	 */
	@RequestMapping(value="/sample/dataTableList.do")
	public String getSampleUserList (HttpServletRequest request, ModelMap model) throws Exception {
		
		logger.info("!! getSampleUserList ");
		
		SampleVO vo = new SampleVO();
		List<SampleVO> result = sampleService.selectUserList(vo); 
		
		model.addAttribute("dataList", result);
		
		return "/sample/table";
	}
	
	/**
	 * getSempleList (Map & Mapper Interface 사용 예제)
	 *
	 * @return String
	 * @param request HttpServletRequest
	 * @param model ModelMap
	 * @exception Exception
	 */
	@RequestMapping(value="/sample/getSampleUser.do")
	public String getSampleUser (HttpServletRequest request, ModelMap model) throws Exception {
		
		logger.info("!! getSampleUser !!!!!!!!!!");
		
		SampleVO vo = new SampleVO();
		HashMap<String, String> result = new HashMap();
		vo.setUser_id("ethan");
		result = sampleService.selectUser(vo); 
		
		model.addAttribute("dataMap", result);
		
		return "/sample/Sample";
	}
	
	/**
	 * insertSampleUser
	 *
	 * @return String
	 * @param request HttpServletRequest
	 * @param model ModelMap
	 * @exception Exception
	 */
	@RequestMapping(value="/sample/insertSampleUser.do")
	public String insertSampleUser (HttpServletRequest request, @ModelAttribute SampleVO vo , ModelMap model) throws Exception {
		
		sampleService.insertUser(vo);
		return "/sample/Sample";
	}
	
	/**
	 * updateSampleUser
	 *
	 * @return String
	 * @param request HttpServletRequest
	 * @param model ModelMap
	 * @exception Exception
	 */
	@RequestMapping(value="/sample/updateSampleUser.do")
	public String updateSampleUser (HttpServletRequest request, ModelMap model) throws Exception {
		
		return "1111";
	}
	
	/**
	 * deleteSampleUser
	 *
	 * @return String
	 * @param request HttpServletRequest
	 * @param model ModelMap
	 * @exception Exception
	 */
	@RequestMapping(value="/sample/deleteSampleUser.do")
	public String deleteSampleUser (HttpServletRequest request, ModelMap model) throws Exception {
		
		return "";
	}
}
