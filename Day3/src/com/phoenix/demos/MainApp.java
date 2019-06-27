package com.phoenix.demos;

import java.util.Scanner;

public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MainApp app=new MainApp();
		
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		Student ref=null;
		if(choice==1)
		{
			ref=new EnggStudent(1,"A","b","c","d");			
		}
		else
		{
			ref=new MedicalStudent();			
		}

//		engg1.checkInfo();

		app.businessLogic(ref);
	}

	public void businessLogic(Student ref)
	{
		ref.checkInfo();
	}
}
