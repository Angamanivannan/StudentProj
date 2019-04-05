package com.testServices.StudentApp.StudentApp.Excercises.one;

import java.util.Date;

public class StudentApp {
	
	
	private Integer studentId;
	private String name;
	private Date joiningDate;
	
	public StudentApp( Integer studentId,String name, Date joiningDate) {
		super();
		
		this.studentId = studentId;
		this.name = name;
		this.joiningDate = joiningDate;
	}
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Date getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	@Override
	public String toString() {
		return "StudentApp [studentId=" + studentId + ", name=" + name + ", joiningDate=" + joiningDate + "]";
	}
	
	

}
