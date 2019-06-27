package com.phoenix.demos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FactoryClass {
	
	public Printable getObject()
	{
		Printable returnValue=null;
		try {
			FileInputStream fin=new FileInputStream("classname.txt");
			Scanner sc=new Scanner(fin);
			String className=sc.next();
			Class c=Class.forName(className);
			returnValue= (Printable) c.newInstance();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return returnValue;

	}

}
