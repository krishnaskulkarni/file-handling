package com.capgemini.files.assignments;

import java.io.Serializable;
import java.util.Objects;

public class Myclass implements Serializable{
	
	private int studentRollNumber;
	private String studentName;
	private String studentDepartment;

	public Myclass() {
		super();
	}

	public Myclass(int studentRollNumber, String studentName, String studentDepartment) {
		super();
		this.studentRollNumber = studentRollNumber;
		this.studentName = studentName;
		this.studentDepartment = studentDepartment;
	}

	public int getStudentRollNumber() {
		return studentRollNumber;
	}

	public void setStudentRollNumber(int studentRollNumber) {
		this.studentRollNumber = studentRollNumber;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentDepartment() {
		return studentDepartment;
	}

	public void setStudentDepartment(String studentDepartment) {
		this.studentDepartment = studentDepartment;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(studentRollNumber,studentName,studentDepartment);
	}

	@Override
	public boolean equals(Object obj) {
		
		if (obj == null)
			return false;
		if (this == obj)
			return true;
		if(!(obj instanceof Myclass))
			return false;
		
		Myclass class1=(Myclass) obj;
		
		if(this.studentRollNumber==class1.studentRollNumber && this.studentName.equals(class1.studentName) && this.studentDepartment.equals(class1.studentDepartment))
			return true;
		return false;
	}


}
