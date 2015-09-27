/**
 * 
 */
package com.siis.nomina.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.siis.nomina.entity.City;

/**
 * @author admin
 *
 */
public interface CityRespository extends PagingAndSortingRepository<City, Long> {
	
	
}
