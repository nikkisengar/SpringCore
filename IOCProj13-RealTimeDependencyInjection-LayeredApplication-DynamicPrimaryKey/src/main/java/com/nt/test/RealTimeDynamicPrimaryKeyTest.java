package com.nt.test;

import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.controller.EmployeeController;
import com.nt.vo.EmployeeVO;

public class RealTimeDynamicPrimaryKeyTest {

	public static void main(String[] args) {
		BeanFactory factory=null;
		EmployeeController controller=null;
		Scanner sc=null;
		String name=null,jobTitle=null,basicSalary=null;
		EmployeeVO vo=null;
		
		// creating the IOC container
		factory=new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
		
		//get Controller
		controller=factory.getBean("empController", EmployeeController.class);
		
		//Reading the inputs from the end users
		sc=new Scanner(System.in);
		
		System.out.println("Enter Employee Name: ");
		name=sc.next();
		
		System.out.println("Enter Employee Job Title: ");
		jobTitle=sc.next();
		
		System.out.println("Enter Employee Salary: ");
		basicSalary=sc.next();
		
		//using VO class
		vo=new EmployeeVO();
		
		vo.setEmpName(name);
		vo.setEmpJobTitle(jobTitle);
		vo.setEmpSalary(basicSalary);
		
		//invoking the method in controller class
		try {
			System.out.println(controller.task(vo));
		}catch(Exception e) {
			System.out.println("Internal Problem :: "+e.getMessage());
		}
	}//main
}//class
