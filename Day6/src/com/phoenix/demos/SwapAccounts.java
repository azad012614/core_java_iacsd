package com.phoenix.demos;

public class SwapAccounts {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account a1=new Account(1,"Chetan",1000);
		Account a2=new Account(2,"Mahesh",2000);
		
		try {
			a2.withdraw(4000);
		} catch (LowBalanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		/*SwapAccounts app=new SwapAccounts();
		//app.swap(a1,a2);
		Account[] arrayOfAccts={a1,a2};
		app.swap(arrayOfAccts);
		System.out.println(arrayOfAccts[0].accountName);*/
	}
	
	public void swap(Account[] ref)
	{
		Account temp;
		temp=ref[0];
		ref[0]=ref[1];
		ref[1]=temp;
		
		/*float temp;
		temp=ref1.accountBal;
		ref1.accountBal=ref2.accountBal;
		ref2.accountBal=temp;*/
		
	}

}
