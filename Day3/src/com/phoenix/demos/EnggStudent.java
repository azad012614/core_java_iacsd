package com.phoenix.demos;

public class EnggStudent extends Student{
	
	private String specialization;

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	
	public EnggStudent() {
		// TODO Auto-generated constructor stub
	}
	
	public EnggStudent(int v1,String v2, String v3, String v4, String v5)
	{
		super(v1,v2,v3,v4);
		//permanentNo=v1;
		specialization=v5;
	}

	public void checkInfo()
	{
		System.out.println("Parameterized checkInfo");
		//return "Value";
	}
}
