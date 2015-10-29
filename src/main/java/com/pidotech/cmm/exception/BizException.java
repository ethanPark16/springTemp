package com.pidotech.cmm.exception;

import java.text.MessageFormat;

/**
 * BizException : 비즈니스 서비스 구현체에서 발생시키는 Exception .
 * 
 * @author ethan park
 * @since 2015.10.27
 */
public class BizException extends Exception {
	private static final long serialVersionUID = 1L;

	protected String message = null;
	protected Throwable wrappedException = null;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Throwable getWrappedException() {
		return wrappedException;
	}

	public void setWrappedException(Throwable wrappedException) {
		this.wrappedException = wrappedException;
	}

	/**
	 * BizException 기본 생성자.
	 */
	public BizException() {
		this("BaseException without message", null, null);
	}

	/**
	 * BaseException 생성자.
	 * 
	 * @param defaultMessage 메세지 지정
	 */
	public BizException(String defaultMessage) {
		this(defaultMessage, null, null);
	}

	/**
	 * BaseException 생성자.
	 * 
	 * @param wrappedException  원인 Exception
	 */
	public BizException(Throwable wrappedException) {
		this("BizException without message", null, wrappedException);
	}

	/**
	 * BaseException 생성자.
	 * 
	 * @param defaultMessage 메세지 지정
	 * @param wrappedException 원인 Exception
	 */
	public BizException(String defaultMessage, Throwable wrappedException) {
		this(defaultMessage, null, wrappedException);
	}

	/**
	 * BaseException 생성자.
	 * 
	 * @param defaultMessage 메세지 지정
	 * @param messageParameters 치환될 메세지 리스트
	 * @param wrappedException 원인 Exception
	 */
	public BizException(String defaultMessage, Object[] messageParameters, Throwable wrappedException) {
		super(wrappedException);

		String userMessage = defaultMessage;
		if (messageParameters != null) {
			userMessage = MessageFormat.format(defaultMessage, messageParameters);
		}
		this.wrappedException = wrappedException;
		this.message = userMessage;
	}

}
