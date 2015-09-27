/**
 * 
 */
package org.siis.shared.enums;

/**
 * @author admin
 *
 */
public enum PersonType {

	N("Natural"),
	J("Juridica");
	
	private String personType;
	
	private PersonType(String personType) {
		this.personType = personType;
	}
}
