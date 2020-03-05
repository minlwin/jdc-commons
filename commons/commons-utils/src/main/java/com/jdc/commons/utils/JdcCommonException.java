package com.jdc.commons.utils;

public class JdcCommonException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public JdcCommonException(String message, Throwable cause) {
		super(message, cause);
	}

	public JdcCommonException(String message) {
		super(message);
	}

	public JdcCommonException(Throwable cause) {
		super(cause);
	}
	
}
