/**
 * 
 */
package org.siis.shared.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import org.siis.shared.enums.IdentificationType;
import org.siis.shared.enums.PersonType;
import org.springframework.hateoas.core.Relation;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author admin
 *
 */
@Data
@EqualsAndHashCode(callSuper = false)
@JsonIgnoreProperties(ignoreUnknown = true)
@Relation(collectionRelation = "personDto")
public class PersonDto extends BaseDto{
	
	private Long id;
	private String identificationNumber;
	private IdentificationType identificationType;
	private PersonType personType;
	private String address;
	private String name;
	private String surname;
	private String socialName;
	private String email;
	private String economicActivity;
}
