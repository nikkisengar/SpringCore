package com.nt.beans;

import java.util.Arrays;
import java.util.Random;

public class Flipkart {

	//Using the Services of DTDC
	private DTDC dtdc;

	//Setter method
	public void setDtdc(DTDC dtdc) {
		this.dtdc = dtdc;
	}
	
	//business logic
	public String Shopping(String[] purchasedItems) {
		
		//local variables
		int billAmt=0;
		int ordId=0;
		
		//Shopping and Billing logic
		billAmt=purchasedItems.length*1000;
		
		//generate random order id
		ordId=new Random().nextInt(100000);
		
		//Invoking the deliver method
		dtdc.deliver(ordId);
		
		return "Order id: "+ordId+"\nIteams are: "+ Arrays.toString(purchasedItems) +"\nBill Amount: "+billAmt;
	}
	
	
}
