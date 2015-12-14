package com.pidotech.mari.cmm.aspect;

import org.aspectj.lang.JoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataAccessException;

import com.pidotech.mari.cmm.exception.BizException;

/**
 * ExceptionTransfer : 
 * 	
 * 	업무상 발생시킨 BizException, RuntimeException, 나머지 exception에 대한 로깅과 throw를 담당
 * 
 * @author ethan park
 * @since 2015.10.27
 */

public class ExceptionTransfer {
	private static final Logger LOGGER = LoggerFactory.getLogger(ExceptionTransfer.class);
	
	public void transfer(JoinPoint joinPoint, Exception exception) throws Exception {
		LOGGER.debug("execute ExceptionTransfer.transfer ");

		Class<?> clazz = joinPoint.getTarget().getClass();
		
		// 비즈니스 서비스에서 업무규칙에 따라 발생시킨 exception 처리
		if (exception instanceof BizException) {
			LOGGER.debug("Exception case :: BizException ");

			BizException be = (BizException) exception;
			//wrapp 된 Exception 있는 경우 error 원인으로 출력해준다.
			if (be.getWrappedException() != null) {
				Throwable throwable = be.getWrappedException();
				getLog(clazz).error(be.getMessage(), throwable);
			} else {
				getLog(clazz).error(be.getMessage(), be.getCause());
			}

			throw be;

		//RuntimeException 이 발생시 내부에서 DataAccessException 인 경우 는 별도록 throw.
		} else if (exception instanceof RuntimeException) {
			LOGGER.debug("RuntimeException case :: RuntimeException ");

			RuntimeException be = (RuntimeException) exception;
			getLog(clazz).error(be.getMessage(), be.getCause());

			if (be instanceof DataAccessException) {
				LOGGER.debug("RuntimeException case :: DataAccessException ");
				DataAccessException sqlEx = (DataAccessException) be;
				throw sqlEx;
			}

			throw be;

		} else {
			LOGGER.debug("case :: Exception ");

			getLog(clazz).error(exception.getMessage(), exception.getCause());

			throw exception;
		}
	}
	
	protected Logger getLog(Class<?> clazz) {
		return LoggerFactory.getLogger(clazz);
	}
}
