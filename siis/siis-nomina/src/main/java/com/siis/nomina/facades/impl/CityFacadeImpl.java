/**
 * 
 */
package com.siis.nomina.facades.impl;

import java.util.List;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.siis.nomina.entity.City;
import com.siis.nomina.facades.CityFacade;
import com.siis.nomina.service.CityService;

/**
 * @author admin
 *
 */
@Component
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class CityFacadeImpl implements CityFacade {
	
	/**
	 * {@link CityService}
	 */
	private @NonNull CityService cityService;
	
	/**
	 * get all the cities and map to return
	 */
	@Override
	public List<City> findCities() {	
		return cityService.findCities();
	}

	@Override
	public City findCity(Long cityId) {
		return cityService.findCity(cityId);
	}

}
