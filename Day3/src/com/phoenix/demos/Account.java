package com.phoenix.demos;


public class Account {
	
	public final String nomineeName;
	int id;
	String name;
	float balance;
	MyDate dateOfOpening;
	static float rateOfInterest;
	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public float getBalance() {
		return balance;
	}



	public void setBalance(float balance) {
		this.balance = balance;
	}


	public Account() {
		// TODO Auto-generated constructor stub
		nomineeName="Default";
	}

	public Account(int v1, String v2, float v3, MyDate v4,String value)
	{
		id=v1;
		name=v2;
		balance=v3;
		dateOfOpening=v4;
		rateOfInterest=0.05f;
		nomineeName=value;
	}
	
	static
	{
		rateOfInterest=0.06f;
		System.out.println("This will execute before main");
	}
	
	public void withdraw(int amount)
	{
		balance-=amount;
	}
	
	

}



