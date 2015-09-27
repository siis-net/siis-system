/**
 * 
 */
package org.siis.shared.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import org.dozer.Mapping;
import org.springframework.hateoas.core.Relation;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author admin
 *
 */
@Data
@EqualsAndHashCode(callSuper = false)
@JsonIgnoreProperties(ignoreUnknown = true)
@Relation(collectionRelation = "cityDto")
public class CityDto extends BaseDto{
	
	private static final long serialVersionUID = 1L;
	
	@Mapping("cityCode")
	private Long cityCode;
	
	@Mapping("cityName")
	private String cityName;
	
	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return cityCode;
	}
}
