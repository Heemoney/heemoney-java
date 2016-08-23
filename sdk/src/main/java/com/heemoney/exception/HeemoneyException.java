package com.heemoney.exception;

/**
 * Heemoney 自定义异常
 *
 * @author DavidKong
 * @since 2016.7.29
 */
public class HeemoneyException extends Exception {

	private static final long serialVersionUID = 1L;

	public HeemoneyException() {}

	public HeemoneyException(String msg) {
		super(msg);
	}
}