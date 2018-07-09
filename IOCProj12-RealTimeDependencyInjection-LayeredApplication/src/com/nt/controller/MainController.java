package com.nt.controller;

import com.nt.dto.StudentDTO;
import com.nt.service.ExamService;
import com.nt.vo.StudentVO;

/*Controller class contains integration logic (i.e. logic to take request/inputs
 * and to pass to appropriate service class, similarly logic to take output
 * and pass it to appropriate client/view(servlet/JSP) components)*/
public class MainController {
	
	//Creating the Service Interface object
	private ExamService service;
	String result=null;
	
	public MainController(ExamService service) {
		System.out.println("Inside Controller class");
		System.out.println(".......................");
		this.service = service;
	}
	
	//Writing the method to perform all the activities
	public String process(StudentVO vo) throws Exception{
		StudentDTO dto=null;
		
		//convert VO class object to DTO class object
		dto=new StudentDTO();
		
		dto.setSno(Integer.parseInt(vo.getSno()));
		dto.setSname(vo.getSname());
		dto.setM1(Integer.parseInt(vo.getM1()));
		dto.setM2(Integer.parseInt(vo.getM2()));
		dto.setM3(Integer.parseInt(vo.getM3()));
		dto.setM4(Integer.parseInt(vo.getM4()));
		dto.setM5(Integer.parseInt(vo.getM5()));
		
		
		//Using Service class
		result=service.generateResult(dto);
		
		return result;
	}//method
}//class
