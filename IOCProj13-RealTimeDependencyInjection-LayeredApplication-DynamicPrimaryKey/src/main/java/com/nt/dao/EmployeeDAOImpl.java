package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.nt.bo.EmployeeBO;

public class EmployeeDAOImpl implements EmployeeDAO {

	// Defining the QUERY to insert the data into the database table
	private static final String EMPLOYEE_INSERT_QUERY="INSERT INTO SPRING_EMP VALUES(EMP_SEQ.NEXTVAL,?,?,?,?,?)";
			
	//DataSource Object
	private DataSource ds;
	
	
	//Constructor injection
	public EmployeeDAOImpl(DataSource ds) {
		System.out.println("...................");
		System.out.println("Inside DAO class...");
		System.out.println("...................");
		this.ds = ds;
	}
	
	
	public int insert(EmployeeBO bo) throws Exception {
	
		//Creating connection and PreparedStatement object
		Connection con=null;
		PreparedStatement ps=null;
		
		int count=0;
		
		//get JDBC connection object from pooled connection
		con=ds.getConnection();
		
		//create PreparedStatement object
		ps=con.prepareStatement(EMPLOYEE_INSERT_QUERY);
		
		//Setting the BO data as the query parameter values
		ps.setString(1, bo.getEmpName());
		ps.setString(2, bo.getEmpJobTitle());
		ps.setFloat(3, bo.getEmpBasicSalary());
		ps.setFloat(4, bo.getEmpGrossSalary());
		ps.setFloat(5, bo.getEmpNetSalary());
		
		//execute the query
		count=ps.executeUpdate();
		
		//close the connection
		con.close();
		ps.close();
		
		//function returns 1 when insert into the table is successful and 0 when not inserted.
		return count;
	}//method ends
}//end of DAOImpl
