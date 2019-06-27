package com.phoenix.demos;

public class StaticExamples {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Account.rateOfInterest);
		Account acct=new Account();
		acct.setId(12);
		//acct.nomineeName="XYZ";
		System.out.println(acct.nomineeName);
		
		Account acct2=new Account(2,"ABC",1000,new MyDate(),"NewName");
//		balance=10;
		System.out.println(acct2.nomineeName);
	}

}
