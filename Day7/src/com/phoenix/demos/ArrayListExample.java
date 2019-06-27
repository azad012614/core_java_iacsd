package com.phoenix.demos;

import java.util.ArrayList;

public class ArrayListExample {

	/**
	 * @param args
	 * @throws LowBalanceException 
	 * @throws NullPointerException 
	 */
	public static void main(String[] args) throws NullPointerException, LowBalanceException {
		// TODO Auto-generated method stub
		
		ArrayList<Account> listOfAccounts=new ArrayList();
		listOfAccounts.add(new Account());
		listOfAccounts.add(new Account(2,"Chetan",10000));
		System.out.println(listOfAccounts.size());
/*		listOfAccounts.remove(1);
		System.out.println(listOfAccounts.size());*/
		for(int counter=0;counter<listOfAccounts.size();counter++)
		{
			
			Account ref=listOfAccounts.get(counter);
			ref.withdraw(2000);
/*			Object ref=listOfAccounts.get(counter);
			if(ref instanceof Account)
			{
				Account act=(Account)ref;
				try {
					act.withdraw(100);
				} catch (NullPointerException | LowBalanceException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}*/

		}
		
		for(Account ref:listOfAccounts)
		{
			ref.withdraw(1000);
		}

	}

}
