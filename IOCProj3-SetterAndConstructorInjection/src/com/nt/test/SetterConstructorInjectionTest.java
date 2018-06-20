package com.nt.test;



import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.nt.beans.WishMsgGenerator;

public class SetterConstructorInjectionTest {

	public static void main(String[] args) {
		
		System.out.println("main(-) method called...");
		// Locating the configuration file
		Resource res=null;
		
		//Creating the reference of BeanFactory Interface to create IOC container
		BeanFactory factory=null;
		
		//Creating the reference of WishMsgGenerator class to hold the object created at run time
		WishMsgGenerator wish=null;
		
		//Using the references
		res=new FileSystemResource("src/com/nt/cfgs/applicationContext.xml");
		
		factory=new XmlBeanFactory(res);
		
		wish=(WishMsgGenerator)factory.getBean("wish");
		
		//invoking the object
		System.out.println(wish.generateWishMsg("Nikhil"));
		
		System.out.println("end of main() method...");
	}//End of Main Method
}//End of Class
