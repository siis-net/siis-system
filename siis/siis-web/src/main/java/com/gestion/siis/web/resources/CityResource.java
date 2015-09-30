/**
 * 
 */
package com.gestion.siis.web.resources;

import lombok.Data;
import lombok.EqualsAndHashCode;

import org.springframework.hateoas.ResourceSupport;
import org.springframework.hateoas.core.Relation;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author admin
 *
 */
@Data
@EqualsAndHashCode(callSuper = false)
@JsonIgnoreProperties(ignoreUnknown = true)
@Relation(collectionRelation = "personalData")
public class CityResource extends ResourceSupport {

	private Long cityCode;
	private String cityName;
	private String stateName;
	private String countryName;
}
