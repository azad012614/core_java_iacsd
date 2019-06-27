package com.phoenix.demos;

public class Account {
	
	int id;
	String name;
	float balance;
	MyDate dateOfOpening;
	static float intRate;
	
	
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
	}

	public Account(int v1, String v2, float v3, MyDate v4)
	{
		id=v1;
		name=v2;
		balance=v3;
		dateOfOpening=v4;
	}

}
