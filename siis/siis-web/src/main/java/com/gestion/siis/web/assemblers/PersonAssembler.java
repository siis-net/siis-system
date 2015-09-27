/**
 * 
 */
package com.gestion.siis.web.assemblers;

import org.siis.shared.dto.PersonDto;
import org.springframework.hateoas.ResourceAssembler;
import org.springframework.hateoas.ResourceSupport;
import org.springframework.stereotype.Component;

import com.gestion.siis.web.resources.PersonResource;

/**
 * @author admin
 *
 */
@Component
public class PersonAssembler implements ResourceAssembler<PersonDto, ResourceSupport>{

	@Override
	public PersonResource toResource(PersonDto entity) {
		PersonResource personResource = new PersonResource();
		personResource.setAddress(entity.getAddress());
		personResource.setEconomicActivity(entity.getEconomicActivity());
		personResource.setEmail(entity.getEmail());
		personResource.setIdentificationNumber(entity.getIdentificationNumber());
		personResource.setIdentificationType(entity.getIdentificationType());
		personResource.setName(entity.getName());
		personResource.setSurname(entity.getSurname());
		personResource.setPersonId(entity.getId());
		personResource.setSocialName(entity.getSocialName());
		return personResource;
	}
	
	public PersonDto toPersonDto(PersonResource resource) {
		PersonDto personDto = new PersonDto();
		personDto.setAddress(resource.getAddress());
		personDto.setEconomicActivity(resource.getEconomicActivity());
		personDto.setEmail(resource.getEmail());
		personDto.setIdentificationNumber(resource.getIdentificationNumber());
		personDto.setIdentificationType(resource.getIdentificationType());
		personDto.setName(resource.getName());
		personDto.setSurname(resource.getSurname());
		personDto.setSocialName(resource.getSocialName());
		return personDto;
	}

}
