package com.nt.beans;

/*Demonstrating the Circular Dependency Injection.
 * Can be performed in the below cases:
 * 1) when using Constructor Injection
 * 2) when using Setter and constructor in combination
 */
public class B {

	//Bean property
	private A a;

	//B class Constructor 
	public B() {
		System.out.println("Inside the B class Constructor...");
	}
	
	
	//Setter method
	public void setA(A a) {
		System.out.println("Inside Setter method of B class...");
		this.a = a;
	}



	//toString() method
	@Override
	public String toString() {
		return "B [a=" + a + "]";
	}
}//end of B
