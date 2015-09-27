/**
 * 
 */
package com.siis.nomina.service.impl;

import javax.transaction.Transactional;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.siis.nomina.entity.Person;
import com.siis.nomina.repository.PersonRepository;
import com.siis.nomina.service.PersonService;

/**
 * @author admin
 *
 */
@Service
@Transactional
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class PersonServiceImpl implements PersonService {
	
	/**
	 * {@link RiskRepository}
	 */
	private @NonNull PersonRepository personRespository;

	@Override
	public Person savePerson(Person person) {		
		return personRespository.save(person);
	}

}
