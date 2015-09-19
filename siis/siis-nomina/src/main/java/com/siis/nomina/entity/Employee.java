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

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author admin
 *
 */
@Data
@Entity
@EqualsAndHashCode(callSuper = false)
@Table(name="employee", indexes = { @Index(columnList = "id")})
public class Employee {

	@Id	
	@SequenceGenerator(name="employee_seq",
     		sequenceName="employee_seq",   allocationSize=1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="employee_seq")
	@Column(name="id")
	private Long id;
	
	@Column(name="codeemployee")
	private String codeEmployee;
	
	@Column(name="plaqueemployee")
	private String plaqueEmployee;
	
	@Column(name="typeidentification")
	private String typeIdentification;
	
	@Column(name="numidentification")
	private String numIdentification;
	
	@Column(name="firstname")
	private String firstName;
	
	@Column(name="secondname")
	private String secondName;
	
	@Column(name="firstsurname")
	private String firstSurname;
	
	@Column(name="secondsurname")
	private String secondSurname;
}
