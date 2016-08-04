package be.ringring.message.common;

/**
 * Convertable provide contract to convert an object to json format.<br />
**/

public interface Convertable {
	
	/**
	 * Convert the object attributes in json format
	 * @return Return the json format in a String
	**/
	
	public String toJSON();
	
}
