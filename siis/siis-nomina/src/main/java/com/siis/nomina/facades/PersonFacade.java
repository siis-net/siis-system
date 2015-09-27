/**
 * 
 */
package com.siis.nomina.facades;

import org.siis.shared.dto.PersonDto;

import com.siis.nomina.entity.Person;

/**
 * @author admin
 *
 */
public interface PersonFacade {

	/**
	 * Allows save a person
	 * @param person
	 * @return
	 */
	PersonDto savePerson(PersonDto personDto);
}
