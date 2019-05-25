package com.ricardo.nova.exception;

/**
 * 存储过程调用异常
 * 
 * @author Frank
 *
 */
public class DBProcException extends BaseException {

	private static final long serialVersionUID = 1L;
	
	public DBProcException(Throwable cause) {
		super(cause);
	}
	
	public DBProcException(String message) {
		super(message);
	}
}
