/**
 * 
 */
package com.siis.nomina.facades;

import java.util.List;

import com.siis.nomina.entity.City;

/**
 * @author admin
 *
 */
public interface CityFacade {

	/**
	 * Allows get All cities
	 * @param person
	 * @return
	 */
	List<City> findCities();
	
	
	/**
	 * find one city
	 * @param person
	 * @return
	 */
	City findCity(Long cityId);
}
