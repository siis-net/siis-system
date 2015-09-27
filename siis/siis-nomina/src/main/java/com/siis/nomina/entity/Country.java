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
@Table(name="country", indexes = { @Index(columnList = "id")})
public class Country {

	@Id	
	@SequenceGenerator(name="country_seq",
     		sequenceName="country_seq",   allocationSize=1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="country_seq")
	@Column(name="id")
	private Long id;
	
	@Column(name="name")
	private String name;
	
}
