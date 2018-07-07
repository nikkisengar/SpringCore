package com.nt.service;

import com.nt.bo.StudentBO;
import com.nt.dao.StudentDAO;
import com.nt.dto.StudentDTO;

public class ExamServiceImplementation implements ExamService {

	//dependent object
	private StudentDAO dao;
	
	//constructor injection
	public ExamServiceImplementation(StudentDAO dao) {
		this.dao = dao;
	}
	
	@Override
	public String generateResult(StudentDTO dto) throws Exception {
		
		//creating StudentBO object
		StudentBO bo=null;
		int total=0,count=0;
		float avg=0.0f;
		String result=null;
		
		//Write business logic or service logic
		total=dto.getM1()+dto.getM2()+dto.getM3()+dto.getM4()+dto.getM5();
		
		avg=total/5.0f;
		
		if(dto.getM1()<35||dto.getM2()<35||dto.getM3()<35||dto.getM4()<35||dto.getM5()<35)
			result="fail";
		else
			result="pass";
		
		
		//Preparing the BO object having persistable data.
		bo=new StudentBO();
		
		bo.setSno(dto.getSno());
		bo.setSname(dto.getSname());
		bo.setTotal(total);
		bo.setAvg(avg);
		bo.setResult(result);
		
		
		//Using DAO
		count=dao.insert(bo);
		
		if(count==0)
			return "Registration Failed :: result is :: "+result;
		else
			return "Registration Successful :: result is :: "+result;
		
		
	}

}
