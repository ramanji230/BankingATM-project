package com;

public class InsufficintBalanceException extends RuntimeException {
	
	private String message;
	
	public  InsufficintBalanceException(String message) {
		this.message=message;
	}
	
	@Override
	public String getMessage() {
		return message;
	}

}
