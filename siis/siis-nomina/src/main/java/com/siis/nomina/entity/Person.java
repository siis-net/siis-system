/**
 * 
 */
package com.siis.nomina.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.siis.shared.enums.IdentificationType;
import org.siis.shared.enums.PersonType;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author admin
 *
 */
@Data
@Entity
@EqualsAndHashCode(callSuper = false)
@Table(name="person", indexes = { @Index(columnList = "id")})
public class Person {

	@Id	
	@SequenceGenerator(name="person_seq",
     		sequenceName="person_seq",   allocationSize=1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="person_seq")
	@Column(name="id")
	private Long id;
	
	@Column(name="identificationnumber")
	private String identificationNumber;
	
	@Column(name="identificationtype")
	private IdentificationType identificationType;
	
	@Column(name="persontype")
	private PersonType personType;
	
	@Column(name="address")
	private String address;
	
	@Column(name="name")
	private String name;
	
	@Column(name="surname")
	private String surname;
	
	/*name for Solcial Razon*/
	@Column(name="socialname")
	private String socialName;
	
	@Column(name="email")
	private String email;
	
	@Column(name="economicactivity")
	private String economicActivity;
}
