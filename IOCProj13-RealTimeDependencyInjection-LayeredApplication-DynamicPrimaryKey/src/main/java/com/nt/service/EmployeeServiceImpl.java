package com.nt.service;

import com.nt.bo.EmployeeBO;
import com.nt.dao.EmployeeDAO;
import com.nt.dto.EmployeeDTO;

public class EmployeeServiceImpl implements EmployeeService {

	//Dependent class object
	private EmployeeDAO dao;
	
	//Constructor Injection
	public EmployeeServiceImpl(EmployeeDAO dao) {
		System.out.println("......................");
		System.out.println("Inside Service class..");
		System.out.println("......................");
		this.dao = dao;
	}
	
	
	public String calculateSalary(EmployeeDTO dto) throws Exception {
		//creating the BO class object
		EmployeeBO bo=null;
		int count=0;
		float gSal,nSal;
		
		//Business Logic
		gSal=dto.getEmpSalary()+(dto.getEmpSalary()*0.4f);
		nSal=gSal-(gSal*0.2f);
		
		//create BO class object
		bo=new EmployeeBO();
		
		bo.setEmpNo(dto.getEmpNo());
		bo.setEmpName(dto.getEmpName());
		bo.setEmpJobTitle(dto.getEmpJobTitle());
		bo.setEmpBasicSalary(dto.getEmpSalary());
		bo.setEmpGrossSalary(gSal);
		bo.setEmpNetSalary(nSal);
		
		//use dao
		count=dao.insert(bo);
		
		//process the result
		if(count==0)
			return "Not Inserted into the database table...";
		else
			return "Successfully Inserted into the database table...";
	}
}
