package com.gestion.siis.web.rest.geo;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

import java.util.ArrayList;
import java.util.List;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityLinks;
import org.springframework.hateoas.ExposesResourceFor;
import org.springframework.hateoas.PagedResources;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gestion.siis.constants.Constants;
import com.gestion.siis.web.assemblers.CityAssembler;
import com.gestion.siis.web.resources.CityResource;
import com.siis.nomina.entity.City;
import com.siis.nomina.facades.CityFacade;

@Slf4j
@Controller
@RequestMapping(value = Constants.GEO_RESOURCE_LINK, produces = APPLICATION_JSON_VALUE)
@ExposesResourceFor(City.class)
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class GeoLocationController {
	
	private final @NonNull EntityLinks entityLinks;
	
	private final @NonNull CityFacade cityFacade; 
	
	private final @NonNull CityAssembler cityAssembler;
		
	/**
	 * get Cities saved in the database
	 * @param 
	 * @return
	 */
	@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE, method = GET)
	public HttpEntity<List<CityResource>> getAllCities() {
		log.info("Getting all Cities ");
		List<City> listCities = cityFacade.findCities();		
		if (listCities != null && listCities.size() > 0){
			return new ResponseEntity<>(cityAssembler.toResourceList(listCities), HttpStatus.OK);
		}else{
			return null;//new ResponseEntity<>(new ArrayList<CityResource>(), HttpStatus.NOT_FOUND);
		}		
	}
	
	/**
	 * find a city
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE, method = GET)
	public HttpEntity<CityResource> findById(@PathVariable Long id) {
		log.info("Searching Risk with Id '" + id + "'");
		City city = cityFacade.findCity(id);
		if (city == null) {
			log.warn("the Risk with id {} is not found", id);
			return new ResponseEntity<>(new CityResource(), HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(cityAssembler.toResource(city),HttpStatus.OK);
	}
}


