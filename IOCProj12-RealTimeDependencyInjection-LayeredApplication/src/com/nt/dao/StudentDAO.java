package com.nt.dao;

import com.nt.bo.StudentBO;

/*DAO(Data Access Object) class contains only persistance logic. No other logic should be written
 * other the persistance logic.
 * If project contains less than or equal to 100 DB tables then use one DAO per one DB table.
 * and if project contains more than 100 DB tables then use 1 DAO for related DB tables.*/
public interface StudentDAO {

	public int insert(StudentBO bo) throws Exception;
}
