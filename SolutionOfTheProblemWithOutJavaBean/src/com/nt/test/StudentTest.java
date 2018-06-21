package com.nt.test;

import com.nt.beans.StudentDetails;
import com.nt.service.StudentService;

public class StudentTest {

	public static void main(String[] args) {
		
		// creating Service class object
		StudentService service=new StudentService();
		
		//creating the Bean class object
		StudentDetails details=new StudentDetails();
		
		//Passing the values to the bean properties
		details.setSno(101);
		details.setSname("Nikhil Sengar");
		details.setM1(69);
		details.setM2(70);
		details.setM3(58);
		details.setM4(60);
		details.setM5(46);
		
		//Invoking the Service class object
		System.out.println(service.generateResult(details));

	}

}
