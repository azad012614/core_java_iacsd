package com.phoenix.demos;

public class PolymorphismExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PolymorphismExample app=new PolymorphismExample();
		app.speak();
		app.speak(new Friend());

	}
	
	public void speak()
	{
		System.out.println("Default mode of speech");
	}
	
	public void speak(Friend ref)
	{
		System.out.println("Speak with a friend");
	}
	
	/*public String speak(Friend ref)
	{
		return "Speak with a friend";
	}*/

}

class Friend
{
	
}

class SpecialFriend
{
	
}

class Family
{
	
}