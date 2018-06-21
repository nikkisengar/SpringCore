package com.nt.service;

import com.nt.beans.StudentDetails;

public class StudentService {
	public String generateResult(StudentDetails details) {
		
		//initializing the local variable
		double total=0.0,percent=0.0;
		
		//Adding the total marks
		total=details.getM1()+details.getM2()+details.getM3()+details.getM4()+details.getM5();
		
		percent=(total*100)/500;
		//Using the bean class setter methods to update the values of the bean class
		return "The Student information are:\n============================\nStudent Id number: "+details.getSno()+"\nStudent Name"+details.getSname()+"\nTotal marks scored by Student: "+total+"\nPercentages scored by Student: "+percent+"%";
	}//generateResult(-) ends
}//Class ends
