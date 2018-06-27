package com.nt.vo;

/*VO(Value Object) class is a java bean that holds either inputs or outputs.
 * Generally the properties in the VO class are taken as String not necessary
 * but recommended to use
 */
public class StudentVO {
	
	//VO properties
	private String sno;
	private String sname;
	private String m1,m2,m3,m4,m5;
	
	//Setters and Getters
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	
	
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	
	
	public String getM1() {
		return m1;
	}
	public void setM1(String m1) {
		this.m1 = m1;
	}
	
	
	public String getM2() {
		return m2;
	}
	public void setM2(String m2) {
		this.m2 = m2;
	}
	
	
	public String getM3() {
		return m3;
	}
	public void setM3(String m3) {
		this.m3 = m3;
	}
	
	
	public String getM4() {
		return m4;
	}
	public void setM4(String m4) {
		this.m4 = m4;
	}
	
	
	public String getM5() {
		return m5;
	}
	public void setM5(String m5) {
		this.m5 = m5;
	}
}//VO ends
