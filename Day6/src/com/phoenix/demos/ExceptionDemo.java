package com.phoenix.demos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag=true;
		Scanner sc=new Scanner(System.in);
		
		try {
			Connection con=DriverManager.getConnection("");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		while(flag==true)
		{
			try
			{
				int value=sc.nextInt();
				System.out.println(value);
				System.out.println("After the possible error");
				flag=false;
			}
			//System.out.print("After try");
			catch(NullPointerException ne)
			{
				
			}
			catch(InputMismatchException ime)
			{
				sc.next();
				ime.printStackTrace();
			}			
			System.out.println("After the catch");
		}


	}

}
