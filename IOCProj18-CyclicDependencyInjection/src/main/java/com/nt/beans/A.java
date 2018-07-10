package com.nt.beans;

/*Demonstrating the Circular Dependency Injection.
 * Can be performed in the below cases:
 * 1) when using Constructor Injection
 * 2) when using Setter and constructor in combination
 */
public class A {
	
	//Bean property
	private B b;

	//A class Constructor
	public A(B b) {
		System.out.println("Inside the A class constructor...");
		this.b = b;
	}

	//toString() method
	@Override
	public String toString() {
		return "A [b=" + b + "]";
	}
	
	
}//end of A
