package com.phoenix.demos;

public class SalesPerson extends Employee {

	float commission;

	public float getCommission() {
		return commission;
	}

	public void setCommission(float commission) {
		this.commission = commission;
	}
	
	public SalesPerson() {
		// TODO Auto-generated constructor stub
	}
	
	public SalesPerson(float v1, float v2, float v3)
	{
		super(v1, v2);
		commission=v3;
	}
	
	public float calcSal()
	{
		return basicSal+commission-deductions;
	}
}
