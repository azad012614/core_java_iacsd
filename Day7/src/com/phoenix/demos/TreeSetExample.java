package com.phoenix.demos;

import java.util.TreeSet;

public class TreeSetExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Account> sortedSet=new TreeSet();
		sortedSet.add(new Account(32,"XYZ",1000));
		sortedSet.add(new Account(23,"ABC",2000));
		sortedSet.add(new Account(45,"PQR",3000));
		
		for(Account acct:sortedSet)
		{
			System.out.println(acct.accountId);
		}

	}

}
