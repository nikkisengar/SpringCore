package com.nt.dao;

import com.nt.bo.EmployeeBO;

//DAO(Data Access Object) interface contains the method to be implemented 
public interface EmployeeDAO {
	
	//public abstract method takes BO class as an object
	public int insert(EmployeeBO bo) throws Exception;
}//end of DTO interface
