package com.java.api.exception;

import lombok.Data;

@Data
public class ApiException extends Exception {
	private static final long serialVersionUID = 1L;
	private String errorMessage;
	private Integer errorCode;

	public ApiException(Integer ErrorCode, String ErrorMessage) {
		this.errorMessage = ErrorMessage;
		this.errorCode = ErrorCode;
	}

	@Override
	public String toString() {
		return "[errorCode=" + errorCode + ",errorMessage=" + errorMessage + "]";
	}
	
	
}
