package com.phoenix.demos;


public class LowBalanceException extends Exception {
	
	public LowBalanceException() {
		// TODO Auto-generated constructor stub
	}
	
	public LowBalanceException(String msg)
	{
		super(msg);
	}
	
	public LowBalanceException(float amount)
	{
		System.out.println("You are short by "+amount);
	}

}
