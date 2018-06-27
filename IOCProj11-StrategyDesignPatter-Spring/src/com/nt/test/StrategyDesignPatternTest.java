package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.beans.Engine;
import com.nt.beans.Vehicle;

public class StrategyDesignPatternTest {

	public static void main(String[] args) {
		BeanFactory factory=null;
		Vehicle vehicle=null;
		
		//Creating the IOC container
		factory=new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
		
		//Getting the Bean
		vehicle=factory.getBean("vehicle", Vehicle.class);
		
		//invoking the method
		vehicle.move();
		System.out.println("====================================================");
		vehicle.park();
	}

}
