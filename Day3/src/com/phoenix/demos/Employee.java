package com.phoenix.demos;

public class Employee {
	
	float basicSal;
	float deductions;
	
	private float totalSal; // Should this variable be declared here?

	public float getBasicSal() {
		return basicSal;
	}

	public void setBasicSal(float basicSal) {
		this.basicSal = basicSal;
	}

	public float getDeductions() {
		return deductions;
	}

	public void setDeductions(float deductions) {
		this.deductions = deductions;
	}
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(float v1, float v2)
	{
		basicSal=v1;
		deductions=v2;
	}

	public float calcSal()
	{
		return basicSal-deductions;
	}
}
