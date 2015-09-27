/**
 * 
 */
package com.siis.nomina.facades.impl;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import org.siis.shared.dto.PersonDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.siis.nomina.entity.Person;
import com.siis.nomina.facades.PersonFacade;
import com.siis.nomina.service.PersonService;

/**
 * @author admin
 *
 */
@Component
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class PersonFacadeImpl implements PersonFacade {
	
	/**
	 * {@link RiskRepository}
	 */
	private @NonNull PersonService personService;

	/* (non-Javadoc)
	 * @see com.siis.nomina.facades.PersonFacade#savePerson(com.siis.nomina.entity.Person)
	 */
	@Override
	public PersonDto savePerson(PersonDto personDto) {		
		Person person =  personService.savePerson(convertDtoToEntity(personDto));
		personDto.setId(person.getId());
		return personDto;
	}
	
	private Person convertDtoToEntity(PersonDto personDto){
		Person person = new Person();		
		person.setAddress(personDto.getAddress());
		person.setEconomicActivity(personDto.getEconomicActivity());
		person.setEmail(personDto.getEmail());
		person.setIdentificationNumber(personDto.getIdentificationNumber());
		person.setIdentificationType(personDto.getIdentificationType());
		person.setName(personDto.getName());
		person.setSurname(personDto.getSurname());
		person.setSocialName(personDto.getSocialName());
		return person;
	}

}
