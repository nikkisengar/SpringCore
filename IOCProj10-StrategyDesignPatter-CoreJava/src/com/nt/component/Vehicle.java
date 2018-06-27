package com.nt.component;

//Vehicle class is a like a controller class which will call the other class methods
public class Vehicle {
	
	//creating the reference of Interface Engine so that it can be used to call the 
	private Engine engg;

	//setter method
	public void setEngg(Engine engg) {
		this.engg = engg;
	}
	
	//methods to start and stop the engine
	public void move() {
		engg.start();
		System.out.println("Vehicle	is moving...");
	}
	
	public void park() {
		engg.stop();
		System.out.println("Vehicle parked...");
	}
}//class ends
