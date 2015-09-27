package com.gestion.siis.web.rest;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

import javax.validation.Valid;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.siis.shared.dto.EmployeePersonalDataDto;
import org.siis.shared.dto.PersonDto;
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

import com.gestion.siis.web.assemblers.PersonAssembler;
import com.gestion.siis.web.resources.EmployeePersonalDataResource;
import com.gestion.siis.web.resources.PersonResource;
import com.siis.nomina.facades.PersonFacade;

@Slf4j
@Controller
@RequestMapping(value = "/person", produces = APPLICATION_JSON_VALUE)
//@ExposesResourceFor(???????)
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class PersonController {
	
	private final @NonNull EntityLinks entityLinks;
	
	private final @NonNull PersonFacade personFacade; 
	
	private final @NonNull PersonAssembler personAssembler;
		
	/**
	 * Save person
	 * @param riskResource
	 * @return
	 */
	@RequestMapping(consumes = MediaType.APPLICATION_JSON_VALUE, method = POST)
	public HttpEntity<String> savePerson(@Valid @RequestBody PersonResource personResource) {
		log.info("Saving person for '" + personResource.getName() + "' and surname " + 
				personResource.getSurname());
		
		HttpHeaders httpHeaders = new HttpHeaders();
		//httpHeaders.set(HttpHeaders.LOCATION, );
		PersonDto personDto = personFacade.savePerson(personAssembler.toPersonDto(personResource));
		if (personDto.getId() != null){
			return new ResponseEntity<>(httpHeaders, HttpStatus.CREATED);
		}else{
			return new ResponseEntity<>(httpHeaders, HttpStatus.METHOD_FAILURE);
		}		
	}
}


