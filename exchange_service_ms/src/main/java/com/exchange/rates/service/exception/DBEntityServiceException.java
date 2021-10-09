package com.exchange.rates.service.exception;

public class DBEntityServiceException extends Exception{
	
    private static final long serialVersionUID = 1L;
    
	private String faultCode;

    private String faultReason;

    
    public DBEntityServiceException() {   	
		super();
	}


	public DBEntityServiceException(String faultCode, String faultReason) {
		this.faultCode = faultCode;
		this.faultReason = faultReason;

	}


	/**
	 * @return the faultCode
	 */
	public String getFaultCode() {
		return faultCode;
	}


	/**
	 * @param faultCode the faultCode to set
	 */
	public void setFaultCode(String faultCode) {
		this.faultCode = faultCode;
	}


	/**
	 * @return the faultReason
	 */
	public String getFaultReason() {
		return faultReason;
	}


	/**
	 * @param faultReason the faultReason to set
	 */
	public void setFaultReason(String faultReason) {
		this.faultReason = faultReason;
	}


	
}
