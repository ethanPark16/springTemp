package com.pidotech.cmm.exception;

import java.text.MessageFormat;

/**
 * BizException : ����Ͻ� ���� ����ü���� �߻���Ű�� Exception .
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
	 * BizException �⺻ ������.
	 */
	public BizException() {
		this("BaseException without message", null, null);
	}

	/**
	 * BaseException ������.
	 * 
	 * @param defaultMessage �޼��� ����
	 */
	public BizException(String defaultMessage) {
		this(defaultMessage, null, null);
	}

	/**
	 * BaseException ������.
	 * 
	 * @param wrappedException  ���� Exception
	 */
	public BizException(Throwable wrappedException) {
		this("BizException without message", null, wrappedException);
	}

	/**
	 * BaseException ������.
	 * 
	 * @param defaultMessage �޼��� ����
	 * @param wrappedException ���� Exception
	 */
	public BizException(String defaultMessage, Throwable wrappedException) {
		this(defaultMessage, null, wrappedException);
	}

	/**
	 * BaseException ������.
	 * 
	 * @param defaultMessage �޼��� ����
	 * @param messageParameters ġȯ�� �޼��� ����Ʈ
	 * @param wrappedException ���� Exception
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
