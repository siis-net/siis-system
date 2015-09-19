/**
 * 
 */
package com.gestion.siis.web.resources;

import java.util.Date;

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

	//this represents the code
	private Long employeeId;
	
	//names
	private String numberPlate;
	private String names;
	private String firstSurname;
	private String secondSurname;
	
	//Identification
	private String identificationNumber;
	private TypeDocument typeDocument;
	private Date expeditionDate;
	private String expeditionCity;
	private String expeditionCountry;
}
