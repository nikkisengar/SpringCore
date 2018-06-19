package com.nt.beans;

import java.util.Date;

//Bean Class with Business logic
public class WishMsgGenerator {

	//Declaring the Bean Property
	private Date date;

	//Defining Parameterized Constructor
	public WishMsgGenerator(Date date){
		System.out.println("Inside parameterized Constructor...");
		this.date=date;
	}
	
	/*
	 * //Setter Method of the bean property
	public void setDate(Date date) {
		System.out.println("Setter Method of the Bean Property.");
		this.date = date;
	}
	*/
	
	//generateWishMsg(-) method with business logic
	public String generateWishMsg(String name){
		
		System.out.println("generateWishMsg(-) is called...");
		//using local variable
		int hours;
		
		//using the getHours() method of Date class
		hours=date.getHours();
		
		if(hours<12)
			return "GM :: "+name;
		else if(hours<16)
			return "GA :: "+name;
		else if(hours<20)
			return "GE :: "+name;
		else
			return "GN :: "+name;
	}//Method Ends
}//Class Ends
