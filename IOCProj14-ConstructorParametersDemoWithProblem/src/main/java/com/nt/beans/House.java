package com.nt.beans;

//Using House class to demonstrate problem in constructor injection
public class House {

	//Properties of House class
	private String name;
	private String location;
	private float price;
	private int noOfRooms;
	
	//Constructor Injection
	public House(String name, String location, float price, int noOfRooms) {
		System.out.println(".................................");
		System.out.println("Inside House class Constructor...");
		System.out.println(".................................");
		this.name = name;
		this.location = location;
		this.price = price;
		this.noOfRooms = noOfRooms;
	}

	//toString() method to display all easily.
	@Override
	public String toString() {
		return "House [name=" + name + ", location=" + location + ", price=" + price + ", noOfRooms=" + noOfRooms + "]";
	}
	
	
}//end of House
