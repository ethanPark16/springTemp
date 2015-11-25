package com.pidotech.mari.cmm.aspect;

import org.aspectj.lang.JoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogAspect {
	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	
	public void aroundLogger (JoinPoint joinPoint){
		Class<?> clazz = joinPoint.getTarget().getClass();
		getLog(clazz).debug("aroundLogger Test : "+joinPoint.getClass().getName());
	}
	
	public void beforeLog() {
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! beforLog !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
	}
	
	protected Logger getLog(Class<?> clazz) {
		return LoggerFactory.getLogger(clazz);
	}
}
