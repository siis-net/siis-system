/**
 * 
 */
package com.gestion.siis.web.resources;

import lombok.Data;
import lombok.EqualsAndHashCode;

import org.springframework.hateoas.ResourceSupport;
import org.springframework.hateoas.core.Relation;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.gestion.siis.web.enums.TypeDocument;

/**
 * @author admin
 *
 */
@Data
@EqualsAndHashCode(callSuper = false)
@JsonIgnoreProperties(ignoreUnknown = true)
@Relation(collectionRelation = "personalData")
public class EmployeePersonalDataResource extends ResourceSupport {

	private Long idEmployee;
	//this represents the code
	private String employeeCode;
	
	//names
	private String numberPlaque;
	private String names;
	private String firstName;
	private String secondName;
	private String firstSurname;
	private String secondSurname;
	
	//Identification
	private String identificationNumber;
	private TypeDocument typeDocument;	
}
