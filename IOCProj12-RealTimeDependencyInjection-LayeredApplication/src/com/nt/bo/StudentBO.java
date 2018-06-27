package com.nt.bo;

/*BO(Business Object) class is a Java Bean which holds the persistable data
 * or data given by persistance logic. It is also called Entity Bean / Domain class*/
public class StudentBO {
	
	//BO properties should match with the columns of the table in the database with compatible types
	private int sno;
	private String sname;
	private int total;
	private float avg;
	private String result;
	
	//Setters and Getters
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	
	
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	
	
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
	
	public float getAvg() {
		return avg;
	}
	public void setAvg(float avg) {
		this.avg = avg;
	}
	
	
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
}//BO ends
