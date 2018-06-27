package com.nt.factory;

import java.util.HashMap;
import java.util.Map;

import com.nt.component.CNGEngine;
import com.nt.component.DieselEngine;
import com.nt.component.Engine;
import com.nt.component.PetrolEngine;
import com.nt.component.Vehicle;

// Here we are taking factory class to represent a image of IOC container
public class VehicleFactory {

	//using generic
	private static Map<String,Object> cacheMap=new HashMap<>();
	
	
	public static Object getInstance(String id,String enggType) {
	
		//Creating the reference of the Engine Interface
		Engine engg=null;
		Vehicle vehicle=null;
		
		if(!cacheMap.containsKey(id)) {
			engg=new DieselEngine();
			
			cacheMap.put(id, engg);
		}
		else if(id.equals("PEng")) {
			engg=new PetrolEngine();
			cacheMap.put(id, engg);
		}
		else if(id.equals("cEng")) {
			engg=new CNGEngine();
			cacheMap.put(id, engg);
		}
		else if(id.equals("vehicle")) {
			vehicle=new Vehicle();
			
			if(enggType.equals("diesel")) {
				engg=new DieselEngine();
				vehicle.setEngg(engg);
			}
			else if(enggType.equals("petrol")) {
				engg=new PetrolEngine();
				vehicle.setEngg(engg);
			}
			else if(enggType.equals("cng")) {
				engg=new CNGEngine();
				vehicle.setEngg(engg);
			}
			else {
				throw new IllegalArgumentException("Invalid Argument passed...");
			}
			cacheMap.put(id, vehicle);
		}
		else
			throw new IllegalArgumentException("Invalid ID...");
		
		return cacheMap.get(id);
	}//method ends
	
	
	
}
