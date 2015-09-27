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

import org.dozer.Mapping;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author admin
 *
 */
@Data
@Entity
@EqualsAndHashCode(callSuper = false)
@Table(name="citiy", indexes = { @Index(columnList = "id")})
public class City {

	@Id	
	@SequenceGenerator(name="city_seq",
     		sequenceName="city_seq",   allocationSize=1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="city_seq")
	@Column(name="id")
	@Mapping("cityCode")
	private Long id;
	
	@Mapping("cityName")
	@Column(name="name")
	private String name;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "state_id")
	private State state;
	
}
