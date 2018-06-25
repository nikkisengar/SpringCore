package com.nt.beans;

public class FirstFlight implements Courier{
	
	public void deliver(int ordId) {
		System.out.println("FirstFlight :: Delivering order whose order Id = "+ordId );
	}//method ends
}//class ends
