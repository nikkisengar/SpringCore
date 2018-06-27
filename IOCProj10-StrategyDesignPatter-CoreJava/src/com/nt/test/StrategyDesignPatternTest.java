package com.nt.test;

import com.nt.component.Vehicle;
import com.nt.factory.VehicleFactory;

public class StrategyDesignPatternTest {

	public static void main(String[] args) {
		// Getting Vehicle Object
		Vehicle vehicle=null,vehicle1=null;
		
		//invoking the method
		vehicle=(Vehicle) VehicleFactory.getInstance("vehicle", "diesel");
		
		//invoking Vehicle class methods
		vehicle.move();
		vehicle.park();
		System.out.println("================================================");
		
		
		vehicle1=(Vehicle)VehicleFactory.getInstance("vehicle", "petrol");
		vehicle1.move();
		vehicle1.park();
		
		System.out.println("=================================================");
		System.out.println(vehicle.hashCode()+"======="+vehicle1.hashCode());
		
		

	}

}
