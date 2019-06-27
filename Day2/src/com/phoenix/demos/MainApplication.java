package com.phoenix.demos;

public class MainApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] intArray={1,2,3};
		String[] names={"One","Two"};
		
		Account[] multipleAccts =new Account[2];
		
		Account[] alternateArray={new Account(),new Account()};
		
		Account.intRate=0.03f;
		//multipleAccts[1]=new MyDate(1,2,3);
		multipleAccts[0]=new Account(3,"ABC",2000,new MyDate(1,1,1));
		System.out.println(multipleAccts[0].getId());
		MyDate date=new MyDate(12,12,12);
		
		multipleAccts[1].intRate=0.04f;
		
/*		Account acct=new Account(1,"Chetan",2.4f,date);
		acct=new Account(2,"XYZ",4.5f,new MyDate(23,1,23));
		date.setMonth(2);
		System.out.println(acct.dateOfOpening.month);*/
	}

}
