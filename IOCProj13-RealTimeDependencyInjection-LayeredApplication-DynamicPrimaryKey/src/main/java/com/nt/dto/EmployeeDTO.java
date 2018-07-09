package com.nt.dto;

import java.io.Serializable;

/*DTO(Data Transfer Object) / TO(Transfer Object) class is a Java Bean whose object holds
 * shippable data from one layer to another layer with or without network support.
 * This class generally implements java.io.Serializable interface (not mandatory but
 * recommended to use)*/
public class EmployeeDTO implements Serializable{
	
	//DTO properties are same as VO but with compatible data type
	private int empNo;
	private String empName;
	private String empJobTitle;
	private float empSalary;
	
	//Setters and Getters
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public String getEmpJobTitle() {
		return empJobTitle;
	}
	public void setEmpJobTitle(String empJobTitle) {
		this.empJobTitle = empJobTitle;
	}
	

	public float getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(float empSalary) {
		this.empSalary = empSalary;
	}

}//end of DTO class
