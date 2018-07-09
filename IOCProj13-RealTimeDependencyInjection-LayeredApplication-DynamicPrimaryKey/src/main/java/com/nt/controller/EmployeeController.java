package com.nt.controller;

import com.nt.dto.EmployeeDTO;
import com.nt.service.EmployeeService;
import com.nt.vo.EmployeeVO;

/*Controller class contains integration logic (i.e. logic to take request/inputs
 * and to pass to appropriate service class, similarly logic to take output
 * and pass it to appropriate client/view(servlet/JSP) components)*/
public class EmployeeController {
	
	//Creating the Service Interface reference
	EmployeeService service;
	String returnValue=null;
	
	//constructor injection
	public EmployeeController(EmployeeService service) {
		System.out.println("..........................");
		System.out.println("Inside Controller class...");
		System.out.println("..........................");
		this.service = service;
	}
	
	
	//writing the method to perform all the activities
	public String task(EmployeeVO vo) throws Exception{
		
		//creating the DTO class object
		EmployeeDTO dto=null;
		
		dto=new EmployeeDTO();
		
		//converting VO class object to DTO class object
		//we should not write dto.setEmpNo(-) as this will be dynamically generated using SQL Sequence
		dto.setEmpNo(Integer.parseInt(vo.getEmpNo()));
		dto.setEmpName(vo.getEmpName());
		dto.setEmpJobTitle(vo.getEmpJobTitle());
		dto.setEmpSalary(Integer.parseInt(vo.getEmpSalary()));
		
		//using service class
		returnValue=service.calculateSalary(dto);
		
		return returnValue;
	}
	
	
}
