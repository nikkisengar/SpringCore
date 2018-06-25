package com.nt.beans;

public class BlueDart implements Courier{
	
	public void deliver(int ordId) {
		System.out.println("BlueDart :: Delivering order whose Order Id = "+ordId);
	}//method ends
}//class ends
