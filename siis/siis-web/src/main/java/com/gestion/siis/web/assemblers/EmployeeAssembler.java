package com.gestion.siis.web.assemblers;

import org.siis.shared.dto.EmployeePersonalDataDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityLinks;
import org.springframework.hateoas.ResourceAssembler;
import org.springframework.stereotype.Component;

import com.gestion.siis.web.resources.EmployeePersonalDataResource;

/**
 * 
 * @author admin
 *
 */
@Component
public class EmployeeAssembler implements ResourceAssembler<EmployeePersonalDataDto, EmployeePersonalDataResource>{

	@Autowired
	private EntityLinks entityLinks;
	
	public String getEntityUri(EmployeePersonalDataDto employeePersonalDataDto) {
		return entityLinks.linkForSingleResource(employeePersonalDataDto).toUri().toString();
	}

	@Override
	public EmployeePersonalDataResource toResource(EmployeePersonalDataDto employeePersonalDataDto) {
		return null;
	}
	
	public EmployeePersonalDataDto toDto(EmployeePersonalDataResource employeePersonalDataResource) {
		EmployeePersonalDataDto employeePersonalDataDto = new EmployeePersonalDataDto();
		employeePersonalDataDto.setEmployeeCode(employeePersonalDataResource.getEmployeeCode());
		employeePersonalDataDto.setFirstName(employeePersonalDataResource.getFirstName());
		employeePersonalDataDto.setSecondName(employeePersonalDataResource.getSecondName());
		employeePersonalDataDto.setFirstSurname(employeePersonalDataResource.getFirstSurname());
		employeePersonalDataDto.setSecondSurname(employeePersonalDataResource.getSecondSurname());
		employeePersonalDataDto.setIdentificationNumber(employeePersonalDataResource.getIdentificationNumber());
		employeePersonalDataDto.setTypeDocument("CC");
		
		return employeePersonalDataDto;
	}

}
