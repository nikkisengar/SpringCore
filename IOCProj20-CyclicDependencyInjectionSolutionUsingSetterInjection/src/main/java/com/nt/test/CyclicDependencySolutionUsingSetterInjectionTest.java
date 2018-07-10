package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.beans.B;

public class CyclicDependencySolutionUsingSetterInjectionTest {

	public static void main(String[] args) {
		BeanFactory factory=null;
		//A a=null;
		B b=null;
		
		// create IOC container
		factory=new XmlBeanFactory(new ClassPathResource("com/nt/cfgs/applicationContext.xml"));

		//get Bean
		//a=factory.getBean("aClass", A.class);
		b=factory.getBean("bClass", B.class);
		
		//System.out.println(a);
		System.out.println(b);
	}//main
}//class
