/**
 * 
 */
package org.siis.shared.enums;

/**
 * @author admin
 *
 */
public enum IdentificationType {

	CC("CC"), 
	CE("CE"), 
	TI("TI");
	
	@SuppressWarnings("unused")
	private String idetificationType;
	
	private IdentificationType(String idetificationType) {
		this.idetificationType = idetificationType;
	}
}
