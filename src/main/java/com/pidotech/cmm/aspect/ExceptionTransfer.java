package com.pidotech.cmm.aspect;

import org.aspectj.lang.JoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataAccessException;

import com.pidotech.cmm.exception.BizException;

/**
 * ExceptionTransfer : 
 * 	
 * 	������ �߻���Ų BizException, RuntimeException, ������ exception�� ���� �α�� throw�� ���
 * 
 * @author ethan park
 * @since 2015.10.27
 */
public class ExceptionTransfer {
	private static final Logger LOGGER = LoggerFactory.getLogger(ExceptionTransfer.class);
	
	public void transfer(JoinPoint thisJoinPoint, Exception exception) throws Exception {
		
		Class<?> clazz = thisJoinPoint.getTarget().getClass();
		
		// ����Ͻ� ���񽺿��� ������Ģ�� ���� �߻���Ų exception ó��
		if (exception instanceof BizException) {
			LOGGER.debug("Exception case :: BizException ");

			BizException be = (BizException) exception;
			//wrapp �� Exception �ִ� ��� error �������� ������ش�.
			if (be.getWrappedException() != null) {
				Throwable throwable = be.getWrappedException();
				getLog(clazz).error(be.getMessage(), throwable);
			} else {
				getLog(clazz).error(be.getMessage(), be.getCause());
			}

			throw be;

		//RuntimeException �� �߻��� ���ο��� DataAccessException �� ��� �� ������ throw.
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
