package com.nt.service;

import com.nt.dto.EmployeeDTO;

//Service interface contains the method to be implemented
public interface EmployeeService {

	//public abstract method takes DTO class as an object
	public String calculateSalary(EmployeeDTO dto) throws Exception;
}//end of interface
