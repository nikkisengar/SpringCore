package com.nt.vo;

/*VO(Value Object) class is a java bean that holds either inputs or outputs.
 * Generally the properties in the VO class are taken as String not necessary
 * but recommended to use
 */
public class EmployeeVO {

	//VO Bean class properties
	private String empNo;
	private String empName;
	private String empJobTitle;
	private String empSalary;
	
	
	//Setters and Getters
	public String getEmpNo() {
		return empNo;
	}
	public void setEmpNo(String empNo) {
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
	

	public String getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(String empSalary) {
		this.empSalary = empSalary;
	}
	
}//end of VO class
