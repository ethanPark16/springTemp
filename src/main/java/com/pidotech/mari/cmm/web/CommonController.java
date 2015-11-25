package com.pidotech.mari.cmm.web;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * CommonController.java
 * 프레임워크 공용 화면 controller
 *
 * @author ethan
 * @since 2015. 11. 19.
 * @etc 
 *
 */
@Controller
public class CommonController {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	/**
	 * Access Denied
	 *
	 * @return String
	 * @param request HttpServletRequest
	 * @param locale Locale
	 * @param model ModelMap
	 * @exception Exception
	 */
	@RequestMapping(value= {"/403.do"})
	public String accessDenied (HttpServletRequest request, Locale locale, ModelMap model) throws Exception {
		
		logger.info("HTTP 403 Access Denied", locale);
		
		return "/403";
	}
	/**
	 * page not found
	 *
	 * @return String
	 * @param request HttpServletRequest
	 * @param locale Locale
	 * @param model ModelMap
	 * @exception Exception
	 */
	@RequestMapping(value= {"/404.do"})
	public String notFound (HttpServletRequest request, Locale locale, ModelMap model) throws Exception {
		
		logger.info("HTTP 404 page not found", locale);
		
		return "/404";
	}
	/**
	 * internal server error
	 *
	 * @return String
	 * @param request HttpServletRequest
	 * @param locale Locale
	 * @param model ModelMap
	 * @exception Exception
	 */
	@RequestMapping(value= {"/500.do"})
	public String internalServerError (HttpServletRequest request, Locale locale, ModelMap model) throws Exception {
		
		logger.info("HTTP 500 internal server error", locale);
		
		return "/500";
	}
}
