package com.gestion.siis.web.rest;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

import javax.validation.Valid;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityLinks;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gestion.siis.web.assemblers.EmployeeAssembler;
import com.gestion.siis.web.resources.EmployeePersonalDataResource;
import com.siis.nomina.dto.EmployeePersonalDataDto;
import com.siis.nomina.service.EmployeeService;

@Slf4j
@Controller
@RequestMapping(value = "/employee", produces = APPLICATION_JSON_VALUE)
//@ExposesResourceFor(???????)
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class EmployeeController {
	
	private final @NonNull EntityLinks entityLinks;
	
	private final @NonNull EmployeeService employeeService; 
	
	private final @NonNull EmployeeAssembler employeeAssembler;
		
	/**
	 * Save personal data for the employee
	 * @param riskResource
	 * @return
	 */
	@RequestMapping(consumes = MediaType.APPLICATION_JSON_VALUE, method = POST)
	public HttpEntity<String> saveEmployeePersonalData(@Valid @RequestBody EmployeePersonalDataResource employeePersonalDataResource) {
		log.info("Saving personal data for '" + employeePersonalDataResource.getEmployeeCode() + "' and name " + 
					employeePersonalDataResource.getNames());
		
		HttpHeaders httpHeaders = new HttpHeaders();
		//httpHeaders.set(HttpHeaders.LOCATION, );
		EmployeePersonalDataDto employeePersonalDataDto = employeeService.savePersonalData(employeeAssembler.toDto(employeePersonalDataResource));
		if (employeePersonalDataDto.getId() != null){
			return new ResponseEntity<>(httpHeaders, HttpStatus.CREATED);
		}else{
			return new ResponseEntity<>(httpHeaders, HttpStatus.METHOD_FAILURE);
		}		
	}
}


