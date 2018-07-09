package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.beans.House;

public class ConstructorInjectionSolutionUsingNameAttrbuteHouseTest {

	public static void main(String[] args) {
		BeanFactory factory=null;
		House house=null;
		
		// creating the IOC container
		factory=new XmlBeanFactory(new ClassPathResource("com/nt/cfgs/applicationContext.xml"));
		
		//get the House class
		house=factory.getBean("house", House.class);
		
		//Displaying the values
		System.out.println("House Details: "+house);

	}

}
