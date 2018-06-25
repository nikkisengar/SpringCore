package com.nt.beans;

public class DTDC implements Courier{

	public void deliver(int ordId) {
		System.out.println("DTDC :: Delivering Order Whose Order Id = "+ordId);
	}//method ends
}//class ends
