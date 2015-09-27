/**
 * 
 */
package com.siis.nomina.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name="state", indexes = { @Index(columnList = "id")})
public class State {

	@Id	
	@SequenceGenerator(name="state_seq",
     		sequenceName="state_seq",   allocationSize=1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="state_seq")
	@Column(name="id")
	private Long id;
	
	@Column(name="name")
	private String name;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "country_id")
	private Country country;
	
}
