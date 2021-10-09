package com.exchange.rates.service.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.exchange.rates.service.util.ExchangeConstant;

@ControllerAdvice
public class RestResponseEntityExceptionHandler 
  extends ResponseEntityExceptionHandler {

	private static final Logger LOG = LoggerFactory.getLogger(RestResponseEntityExceptionHandler.class);

	
	@ExceptionHandler(value = { Exception.class })
	protected ResponseEntity<Object> handleGeneralException(Exception ex, WebRequest request) {
		LOG.info("Inside Exception class");
		HttpHeaders headers = new HttpHeaders();
		ErrorResponse errorResponse = new ErrorResponse();
		errorResponse.setError_Code(ExchangeConstant.ERROR_CODE_1000);
		errorResponse.setError_Code(ExchangeConstant.ERROR_MESSAGE_1000);
		return new ResponseEntity<Object>(errorResponse, headers, HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@ExceptionHandler(value = { DBEntityServiceException.class })
	protected ResponseEntity<Object> handleException(DBEntityServiceException ex, WebRequest request) {
		LOG.info("Inside DBEntityServiceException class");
		HttpHeaders headers = new HttpHeaders();
		ErrorResponse errorResponse = null;
		errorResponse = convertErrorResponse(ex);
		return new ResponseEntity<Object>(errorResponse, headers, HttpStatus.NOT_FOUND);
	}

	private ErrorResponse convertErrorResponse(DBEntityServiceException ex) {
		ErrorResponse response = new ErrorResponse();
		response.setError_Code(ex.getFaultCode());
		response.setError_message(ex.getFaultReason());
		return response;
	}
}