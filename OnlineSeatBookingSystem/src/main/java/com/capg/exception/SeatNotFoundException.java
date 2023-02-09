package com.capg.exception;

public class SeatNotFoundException extends RuntimeException{
	String msg;
	
	//private String message;
    
	//public SeatNotFoundException() {}
	public SeatNotFoundException(String msg) {
		super();
		this.msg = msg;
	}
	public String getMessage() {
		return msg;
	}

}
