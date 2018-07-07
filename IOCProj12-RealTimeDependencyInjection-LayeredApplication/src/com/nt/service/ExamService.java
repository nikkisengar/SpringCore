package com.nt.service;

import com.nt.dto.StudentDTO;

/*Service Class or Business Delegate class contains only Business logic /service logic.
 * It can be taken one per module.
 * Gets input from controller as DTO and passes inputs to DAO as BO
 * Gets output from DAO and passes output to controller as DTO
 */
public interface ExamService {
	
	//declaring the method
	public String generateResult(StudentDTO dto) throws Exception;

}
