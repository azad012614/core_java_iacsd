package com.phoenix.demos;

public abstract class Employee {
	
	int empId;
	String empName;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int v1, String v2)
	{
		empId=v1;
		empName=v2;
	}
	
	public boolean equals(Employee ref)
	{
		if(empId==ref.empId){
			return true;
		}
		else
		{
			return false;
		}
	}
	/*public int hashCode() {
		// TODO Auto-generated method stub
		return 1000;
	}*/
	
	public String toString()
	{
		return "[empId:"+this.empId+",empName:"+this.empName+"]";
	}

}
