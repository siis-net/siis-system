/**
 * 
 */
package com.siis.nomina.service;

import org.siis.shared.dto.EmployeePersonalDataDto;

/**
 * @author admin
 *
 */
public interface EmployeeService {
	
	EmployeePersonalDataDto savePersonalData(EmployeePersonalDataDto personalDataDto);  

}
