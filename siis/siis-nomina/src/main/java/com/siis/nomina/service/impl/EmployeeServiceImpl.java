/**
 * 
 */
package com.siis.nomina.service.impl;

import javax.transaction.Transactional;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.siis.nomina.dto.EmployeePersonalDataDto;
import com.siis.nomina.entity.Employee;
import com.siis.nomina.repository.EmployeeRespository;
import com.siis.nomina.service.EmployeeService;

/**
 * @author admin
 *
 */
@Service
@Transactional
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class EmployeeServiceImpl implements EmployeeService{
	
	/**
	 * {@link RiskRepository}
	 */
	private @NonNull EmployeeRespository employeeRespository;

	@Override
	public EmployeePersonalDataDto savePersonalData(EmployeePersonalDataDto personalDataDto) {
		Employee employee = getEntiyConvertData(personalDataDto);
		try{
			employee = employeeRespository.save(employee);
			personalDataDto.setId(employee.getId());
		}catch(Exception ee){
			personalDataDto.setId(null);
		}
		return personalDataDto;
	}

	public Employee getEntiyConvertData(EmployeePersonalDataDto personalDataDto){
		Employee employee = new Employee();
		employee.setCodeEmployee(personalDataDto.getEmployeeCode());
		employee.setFirstName(personalDataDto.getFirstName());
		employee.setSecondName(personalDataDto.getSecondName());
		employee.setFirstSurname(personalDataDto.getFirstSurname());
		employee.setSecondSurname(personalDataDto.getSecondSurname());
		employee.setPlaqueEmployee(personalDataDto.getNumberPlaque());
		employee.setNumIdentification(personalDataDto.getIdentificationNumber());
		employee.setTypeIdentification(personalDataDto.getTypeDocument());
		return employee;
	}
}
