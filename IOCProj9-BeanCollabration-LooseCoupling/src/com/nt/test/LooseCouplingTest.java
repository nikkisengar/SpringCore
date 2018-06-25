package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.beans.Flipkart;

public class LooseCouplingTest {

	public static void main(String[] args) {
		// Creating the BeanFactory reference
		BeanFactory factory=null;
		
		//Creating the target class reference
		Flipkart fkpt=null;
		
		//Creating the IOC container
		factory=new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
		
		//getting the bean
		fkpt=factory.getBean("fkpt", Flipkart.class);
		
		//invoking the method
		System.out.println(fkpt.Shopping(new String[]{"Shirt","Pant","Trusers","T-Shirt"}));
	}//main method ends
}//class ends
