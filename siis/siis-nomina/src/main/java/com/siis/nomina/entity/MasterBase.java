/**
 * 
 */
package com.siis.nomina.entity;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import org.springframework.hateoas.Identifiable;

/**
 * @author admin
 *
 */
@Data
@ToString
@MappedSuperclass
@EqualsAndHashCode
public abstract class MasterBase implements Identifiable<Integer>{
	
	@Column(name = "name", unique = false)
	private String name;
	
	@Column(name = "description", unique = false)
	private String description;	
}
