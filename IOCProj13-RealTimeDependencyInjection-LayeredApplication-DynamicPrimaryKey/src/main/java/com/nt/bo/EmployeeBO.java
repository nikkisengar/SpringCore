package com.nt.bo;

/*BO(Business Object) class is a Java Bean which holds the persistable data
 * or data given by persistance logic. It is also called Entity Bean / Domain class*/
public class EmployeeBO {
	
	//BO properties should match with the columns of the table in the database with compatible types
	private int empNo;
	private String empName;
	private String empJobTitle;
	private float empBasicSalary;
	private float empGrossSalary;
	private float empNetSalary;
	
	
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
	
	public float getEmpBasicSalary() {
		return empBasicSalary;
	}
	public void setEmpBasicSalary(float empBasicSalary) {
		this.empBasicSalary = empBasicSalary;
	}
	
	public float getEmpGrossSalary() {
		return empGrossSalary;
	}
	public void setEmpGrossSalary(float empGrossSalary) {
		this.empGrossSalary = empGrossSalary;
	}
	
	public float getEmpNetSalary() {
		return empNetSalary;
	}
	public void setEmpNetSalary(float empNetSalary) {
		this.empNetSalary = empNetSalary;
	}
	
}//end of BO class
