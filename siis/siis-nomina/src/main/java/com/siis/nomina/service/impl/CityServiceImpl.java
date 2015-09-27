/**
 * 
 */
package com.siis.nomina.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.siis.nomina.entity.City;
import com.siis.nomina.repository.CityRespository;
import com.siis.nomina.repository.EmployeeRespository;
import com.siis.nomina.service.CityService;

/**
 * @author admin
 *
 */
@Service
@Transactional
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class CityServiceImpl implements CityService {
	
	/**
	 * {@link EmployeeRespository}
	 */
	private @NonNull CityRespository cityRespository;

	public List<City> findCities() {		
		return (List<City>) cityRespository.findAll();
	}

	@Override
	public City findCity(Long cityId) {		
		return cityRespository.findOne(cityId);
	}	
	
}
