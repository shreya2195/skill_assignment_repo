package com.exchange.rates.service.exception;

public class ErrorResponse {
	
    
	private String error_Code;

    private String error_message;

	public String getError_Code() {
		return error_Code;
	}

	public void setError_Code(String error_Code) {
		this.error_Code = error_Code;
	}

	public String getError_message() {
		return error_message;
	}

	public void setError_message(String error_message) {
		this.error_message = error_message;
	}

	@Override
	public String toString() {
		return "ErrorResponse [error_Code=" + error_Code + ", error_message=" + error_message + "]";
	}

	
}
