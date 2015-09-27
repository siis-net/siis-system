/**
 * 
 */
package com.siis.nomina.service;

import java.util.List;

import com.siis.nomina.entity.City;

/**
 * @author admin
 *
 */
public interface CityService {
	
	/**
	 * find all cities
	 * @return
	 */
	List<City> findCities();  
	
	/**
	 * find one city
	 * @param cityId
	 * @return
	 */
	City findCity(Long cityId);

}
