/**
 * 
 */
package com.gestion.siis.web.assemblers;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;

import java.util.ArrayList;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.springframework.hateoas.ResourceAssembler;
import org.springframework.stereotype.Component;

import com.gestion.siis.web.resources.CityResource;
import com.gestion.siis.web.rest.geo.GeoLocationController;
import com.siis.nomina.entity.City;

/**
 * @author admin
 *
 */
@Component
public class CityAssembler implements ResourceAssembler<City, CityResource>{
	
	private Mapper mapper = new DozerBeanMapper();

	@Override
	public CityResource toResource(City entity) {
		return mapper.map(entity, CityResource.class);
	}
	
	public List<CityResource> toResourceList(List<City> entity) {
		CityResource cityResource = null;
		List<CityResource> listResources = new ArrayList<CityResource>();
		for (City city : entity){
			cityResource = mapper.map(city, CityResource.class);
			cityResource.add(linkTo(methodOn(GeoLocationController.class).findById(city.getId())).withSelfRel());
			listResources.add(cityResource);
		}
		return null;
	}

}
