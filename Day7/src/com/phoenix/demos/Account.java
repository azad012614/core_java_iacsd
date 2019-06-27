package com.phoenix.demos;


public class Account implements Comparable<Account> {
	
	public int accountId;
	public String accountName;
	public float accountBal;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}
	
	public Account(int v1, String v2, float v3)
	{
		accountId=v1;
		accountName=v2;
		accountBal=v3;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public float getAccountBal() {
		return accountBal;
	}

	public void setAccountBal(float accountBal) {
		this.accountBal = accountBal;
	}
	
	public void deposit(float amount)
	{
		accountBal+=amount;
	}
	
	public void withdraw(float amount) throws LowBalanceException, NullPointerException
	{
		accountBal-=amount;
		if(accountBal<0)
		{
				throw new LowBalanceException(accountBal);
		}
	}

	@Override
	public int compareTo(Account o) {
		
		if(this.accountId > o.accountId)
		{
			return -1;
		}
		else
			if(this.accountId < o.accountId)
			{
				return 1;
			}
			else
			{
				return 0;
			}
		

	}




}
