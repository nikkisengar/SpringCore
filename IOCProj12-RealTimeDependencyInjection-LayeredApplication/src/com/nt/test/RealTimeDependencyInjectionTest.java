package com.nt.test;

import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.controller.MainController;
import com.nt.vo.StudentVO;

public class RealTimeDependencyInjectionTest {

	public static void main(String[] args) {
		
		BeanFactory factory=null;
		MainController controller=null;
		Scanner sc=null;
		String sno=null, sname=null,m1=null,m2=null,m3=null,m4=null,m5=null;
		StudentVO vo=null;
		
		// creating the IOC container
		factory=new XmlBeanFactory(new ClassPathResource("com/nt/cfgs/applicationContext.xml"));
		
		//Get Controller
		controller=factory.getBean("controller", MainController.class);
		
		//Reading the inputs from the end users
		sc=new Scanner(System.in);
		
		System.out.println("Enter Student Number: ");
		sno=sc.next();
		
		System.out.println("Enter Student Name: ");
		sname=sc.next();
		
		System.out.println("Enter Mark m1: ");
		m1=sc.next();
		
		System.out.println("Enter Mark m2: ");
		m2=sc.next();
		
		System.out.println("Enter Mark m3: ");
		m3=sc.next();
		
		System.out.println("Enter Mark m4: ");
		m4=sc.next();
		
		System.out.println("Enter Mark m5: ");
		m5=sc.next();
		
		//Create Student VO class object
		vo=new StudentVO();
		
		vo.setSno(sno);
		vo.setSname(sname);
		vo.setM1(m1);
		vo.setM2(m2);
		vo.setM3(m3);
		vo.setM4(m4);
		vo.setM5(m5);
		
		//Invoking the method in controller class
		try {
			System.out.println("Result is :: "+controller.process(vo));
		}
		catch(Exception e) {
			System.out.println("Internal problem :: "+e.getMessage());
		}
	}//main
}//class