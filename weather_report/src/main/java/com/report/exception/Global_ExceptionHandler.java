package com.report.exception;

import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.report.DTO.Weather_details;

import java.sql.SQLIntegrityConstraintViolationException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice // to visible this annotated class methods to all controller classes...global exception handler
public class Global_ExceptionHandler extends ResponseEntityExceptionHandler {

	private static final Logger log = LogManager.getLogger(Global_ExceptionHandler.class);

	@ExceptionHandler(InputEmptyException.class)
	public ResponseEntity<String> inputEmpty(InputEmptyException e) {
		log.error(e.getMessage());
		return new ResponseEntity<String>("One/few fields are empty have a look once", HttpStatus.BAD_REQUEST);

	}

	@ExceptionHandler(NullPointerException.class)//if this nullpointerexception raise in any controller then this method will execute
	public ResponseEntity<String> nullPointer(NullPointerException e) {

		return new ResponseEntity<String>("Null is there", HttpStatus.NOT_FOUND);

	}

	@Override
	protected ResponseEntity<Object> handleHttpRequestMethodNotSupported(HttpRequestMethodNotSupportedException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		// TODO Auto-generated method stub
		return new ResponseEntity<Object>("Request is wrong, Please check.. ", HttpStatus.METHOD_NOT_ALLOWED);
	}

	@ExceptionHandler(SQLIntegrityConstraintViolationException.class)
	public ResponseEntity<String> duplicate(SQLIntegrityConstraintViolationException e) {

		return new ResponseEntity<String>("given city is already available, try with new city details",
				HttpStatus.NO_CONTENT);

	}

	@ExceptionHandler(DuplicateKeyException.class)
	public ResponseEntity<String> duplicate(DuplicateKeyException e) {

		return new ResponseEntity<String>(
				"DuplicateKeyException--> given city is already available, try with new city details",
				HttpStatus.NO_CONTENT);

	}
	
	@ModelAttribute("w_details")
	public Weather_details info() {
		Weather_details wd = new Weather_details();
		wd.setCityname("tirupati");
		wd.setPincode(536982);
		wd.setTemparature("21C");
		return wd;
	}
	
	

}
