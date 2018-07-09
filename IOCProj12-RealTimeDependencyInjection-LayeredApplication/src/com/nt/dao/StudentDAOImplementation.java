package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.nt.bo.StudentBO;

public class StudentDAOImplementation implements StudentDAO {

	// Defining the QUERY to insert the data into the database table
	private static final String STUDENT_INSERT_QUERY="INSERT INTO SPRING_STUDENT VALUES(?,?,?,?,?)";
	
	//Dependent object
	private DataSource ds;
	

	//Constructor injecting the DataSource object
	public StudentDAOImplementation(DataSource ds) {
		this.ds = ds;
	}
	
	@Override
	public int insert(StudentBO bo) throws Exception {
		//Creating the Connection and PrepareStatement reference
		Connection con=null;
		PreparedStatement ps=null;
		
		int count=0;
		
		//get JDBC connection object from pooled connection
		con=ds.getConnection();
		
		//create PreparedStatement object
		ps=con.prepareStatement(STUDENT_INSERT_QUERY);
		
		//set BO data as the query parameter value
		ps.setInt(1, bo.getSno());
		ps.setString(2, bo.getSname());
		ps.setInt(3, bo.getTotal());
		ps.setFloat(4, bo.getAvg());
		ps.setString(5, bo.getResult());
		
		//execute the query
		count=ps.executeUpdate();
		
		//close the connection
		ps.close();
		con.close();
		
		//function returns 1 when insert into the table is successful and 0 when not inserted.
		return count;
	}//insert(-) ends
}//DAO ends
