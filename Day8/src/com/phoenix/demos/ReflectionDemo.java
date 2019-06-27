package com.phoenix.demos;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class ReflectionDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account acct=new Account();
		
		try {
			Class metaData=Class.forName("com.phoenix.demos.Account");
			
			/*Field[] fields=metaData.getFields();
			
			for(Field field:fields)
			{
				System.out.println(field.getName());*/
			Method[]methods = metaData.getDeclaredMethods();
			for(Method method:methods)
			{
				//System.out.println("Method name: "+method.getName());
				String methodName=method.getName();
				if(methodName.equals("deposit"))
				{
					Object[] params={10000};
					try {
						method.invoke(metaData.newInstance(), params);
					} catch (IllegalAccessException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IllegalArgumentException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (InvocationTargetException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (InstantiationException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				/*System.out.println("Number of Parameters: "+method.getParameterCount());
				System.out.println("Parameter List");
				Parameter[] params=method.getParameters();
				for(Parameter param:params)
				{
					System.out.println("Parameter "+ param.getName());
					
				}*/
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
	}

}
