package com.phoenix.demos;

public class Manager extends Employee {
	
	float incentives;

	public float getIncentives() {
		return incentives;
	}

	public void setIncentives(float incentives) {
		this.incentives = incentives;
	}
	
	public Manager() {
		// TODO Auto-generated constructor stub
	}
	
	public Manager(float v1, float v2, float v3)
	{
		super(v1,v2);
		incentives=v3;
	}
	
	public float calcSal()
	{
		return basicSal+incentives-deductions;
	}

}
