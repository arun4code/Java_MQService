package com.messaging;

public class SalesException extends Exception {
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SalesException(String msg) {
	        super(msg);
    }

    public SalesException(String msg, Exception e) {
        super(msg, e);
    }

}
