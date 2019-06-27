package com.phoenix.demos;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Account> accts =new HashSet();
		accts.add(new Account(1,"Chetan",10000));
		accts.add(new Account(2,"Mahesh",2000));
		accts.add(new Account(3,"Mayur",30000));
		for(Account ref:accts)
		{
			try {
				ref.withdraw(10000);
			} catch (NullPointerException | LowBalanceException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//Iterator go through entire collection
		
		Iterator<Account> iter=accts.iterator();
		while(iter.hasNext())
		{
			Account ref=iter.next();
			iter.remove();
			//ref.withdraw(10);
		}
	}

}
