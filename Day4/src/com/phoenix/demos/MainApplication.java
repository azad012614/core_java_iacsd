package com.phoenix.demos;

public class MainApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1=new Employee(1,"XYZ");
		Employee e2=new Employee(1,"XYZ");
		
		int val1=10;
		int val2=10;
		/*String name="Chetan";
		System.out.println(name.hashCode());
		name+=" is a trainer";
		System.out.println(name.hashCode());*/
		
		String var1="String1";
		String var2="String1";
		
		if(var1==var2)
		{
			System.out.println("Same values");
		}
		else
		{
			System.out.println("Different values");
		}
		
		
		/*System.out.println("The hashcode for the first object is "+e1);
		System.out.println("The hashcode for the second object is "+e2);
		
		
		//if("String1"=="String1")
		if(new Employee()==new Employee())
		{
			System.out.println("Same values");
		}
		else
		{
			System.out.println("Different values");
		}
*/
	}

}
