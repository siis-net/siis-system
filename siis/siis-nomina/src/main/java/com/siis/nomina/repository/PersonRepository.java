/**
 * 
 */
package com.siis.nomina.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.siis.nomina.entity.Person;

/**
 * @author admin
 *
 */
public interface PersonRepository extends PagingAndSortingRepository<Person, Long> {

}
