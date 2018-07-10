package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.beans.B;

public class CyclicDependencyTest {

	public static void main(String[] args) {
		BeanFactory factory=null;
		B b=null;
		
		// create IOC container
		factory=new XmlBeanFactory(new ClassPathResource("com/nt/cfgs/applicationContext.xml"));

		//get Bean
		b=factory.getBean("bClass", B.class);
		
		System.out.println(b);
	}

}
