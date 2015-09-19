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

import com.gestion.siis.web.resources.EmployeePersonalDataResource;

@Slf4j
@Controller
@RequestMapping(value = "/employee", produces = APPLICATION_JSON_VALUE)
//@ExposesResourceFor(???????)
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class EmployeeController {
	
	private final @NonNull EntityLinks entityLinks;	
		
	/**
	 * Save personal data for the employee
	 * @param riskResource
	 * @return
	 */
	@RequestMapping(consumes = MediaType.APPLICATION_JSON_VALUE, method = POST)
	public HttpEntity<String> save(@Valid @RequestBody EmployeePersonalDataResource employeePersonalDataResource) {
		log.info("Saving personal data for '" + employeePersonalDataResource.getEmployeeId() + "' and name " + 
					employeePersonalDataResource.getNames());
		
		HttpHeaders httpHeaders = new HttpHeaders();
		//httpHeaders.set(HttpHeaders.LOCATION, );
		return new ResponseEntity<>(httpHeaders, HttpStatus.CREATED);
	}
}


