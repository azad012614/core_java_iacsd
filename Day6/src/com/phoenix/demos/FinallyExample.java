package com.phoenix.demos;

public class FinallyExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			checkFinally();
	}

	public static void checkFinally()
	{
		try
		{
			System.out.println("This code will always execute");
			//return;
		}
		catch(Exception e)
		{
			System.out.println("This code will execute on exception");
		}
		finally
		{
			System.out.println("Will this code execute?");
		}
		System.out.println("After finally execution");
	}
}
