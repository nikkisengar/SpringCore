package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.nt.beans.WishMsgGenerator;

public class SetterInjectionTest {

	public static void main(String[] args) {
		
		//Declaring the Resource Interface reference variable
		Resource res=null;
		
		//Declaring the BeanFactory Interface reference variable to create Container
		BeanFactory factory=null;
		
		//Declaring the reference of bean class WishMsgGenerator
		WishMsgGenerator wish=null;
		
		// Locating the Configuration file
		res=new FileSystemResource("src/com/nt/cfgs/applicationContext.xml");
		
		//Creating the IOC container
		factory=new XmlBeanFactory(res);
		
		//Creating the Spring Container and storing the object of class 
		wish=(WishMsgGenerator)factory.getBean("wish");
		
		//Invoking the method
		System.out.println(wish.generateWishMsg("Nikhil"));
	}

}
