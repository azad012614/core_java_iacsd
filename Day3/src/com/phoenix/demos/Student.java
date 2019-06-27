package com.phoenix.demos;

public class Student {
	
	private int permanentNo;
	private String studentName;
	private String contactDetails;
	private String courseName;
	
	
	public int getPermanentNo() {
		return permanentNo;
	}


	public void setPermanentNo(int permanentNo) {
		this.permanentNo = permanentNo;
	}


	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studetnName) {
		this.studentName = studetnName;
	}


	public String getContactDetails() {
		return contactDetails;
	}


	public void setContactDetails(String contactDetails) {
		this.contactDetails = contactDetails;
	}


	public String getCourseName() {
		return courseName;
	}


	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}


	public Student() {
		// TODO Auto-generated constructor stub
		System.out.println("Default constructor of Student");
	}


	public Student(int permanentNo, String studetnName, String contactDetails,
			String courseName) {
		super();
		this.permanentNo = permanentNo;
		this.studentName = studetnName;
		this.contactDetails = contactDetails;
		this.courseName = courseName;
	}

	public void checkInfo()
	{
		System.out.println("Student class");
	}
}
