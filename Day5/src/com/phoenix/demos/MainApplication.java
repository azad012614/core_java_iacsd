package com.phoenix.demos;

public class MainApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FactoryClass factory=new FactoryClass();
		Printable ref=factory.getObject();
		MainApplication app=new MainApplication();
		app.printAll(ref);
/*		Employee e=new Manager();
		app.printAll(e);
		app.printAll(new Supplier());*/
	}
	
	public void printAll(Printable ref)
	{
		ref.print();
	}
	
}
