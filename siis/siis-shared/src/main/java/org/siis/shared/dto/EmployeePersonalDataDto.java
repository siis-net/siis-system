/**
 * 
 */
package org.siis.shared.dto;

import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;

import org.springframework.hateoas.Identifiable;
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
public class EmployeePersonalDataDto extends BaseDto{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String employeeCode;
	private String numberPlaque;
	private String firstName;
	private String secondName;
	private String firstSurname;
	private String secondSurname;
	private String identificationNumber;
	private String typeDocument;
}
