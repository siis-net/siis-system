/**
 * 
 */
package com.siis.nomina.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.siis.nomina.entity.Employee;

/**
 * @author admin
 *
 */
public interface EmployeeRespository extends PagingAndSortingRepository<Employee, Long> {
	
	
}
