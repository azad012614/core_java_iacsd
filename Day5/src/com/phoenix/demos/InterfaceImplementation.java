package com.phoenix.demos;

public class InterfaceImplementation implements Printable{

	/**
	 * @param args
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceImplementation ref=new InterfaceImplementation();
		Printable p=new InterfaceImplementation();
		
		Printable[] refArray=new Printable[3];
		refArray[0]=new InterfaceImplementation();
		refArray[1]=new Manager();

	}

	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Print method being implemented in a concrete class");
	}

}
