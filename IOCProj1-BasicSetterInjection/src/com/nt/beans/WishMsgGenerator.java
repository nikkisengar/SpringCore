package com.nt.beans;

import java.util.Date;

//Class for Generating Wish Message
public class WishMsgGenerator {
	
	//Bean Property
	Date date;

	//Creating Zero Parameter Constructor
	WishMsgGenerator(){
		System.out.println("Zero-Param Constructor.");
	}
	
	//Setter Method used for Setter Injection
	public void setDate(Date date) {
		System.out.println("Inside Setter Method.");
		this.date = date;
	}
	
	public String generateWishMsg(String name) {

		//Declaring the local variable
		int hours;
		
		//Get Current Hours of the Day
		hours=date.getHours();
		
		//Writing Business logic to generate the Wish message 
		if(hours<12)
			return "GM: "+name;
		else if(hours<16)
			return "GA: "+name;
		else if(hours<20)
			return "GE: "+name;
		else
			return "GN: "+name;
	}
}
