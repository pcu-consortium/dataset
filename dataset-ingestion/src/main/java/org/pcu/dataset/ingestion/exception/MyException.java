package org.pcu.dataset.ingestion.exception;

public class MyException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	public MyException (String errorMessage, Throwable err) {
		super(errorMessage,err);
	}
	
}
