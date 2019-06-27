package com.phoenix.demos;

public class MainApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee[] salList=new Employee[3];
		salList[0]=new Employee(10000,2000);
		salList[1]=new Manager(300000, 2000, 10000);
		salList[2]=new SalesPerson(10000,2000,20000);
		MainApplication app=new MainApplication();
		System.out.println("Total salary requirement is "+app.totalSal(salList));
	}

	public float totalSal(Employee[] list)
	{
		float returnVal=0;
		for(int counter=0;counter<list.length;counter++)
		{
			returnVal+=list[counter].calcSal();
		}
		return returnVal;
	}
	
}
