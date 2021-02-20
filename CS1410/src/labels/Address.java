package labels;
/**
 * US address that is not a PO box.
 * @author Qi Cao
 *
 */


public class Address {
	private String street;
	private String city;
	private State state;
	private int zip;
	
	/**
	 * Constructor initialized the fields.
	 * @param street street address
	 * @param city
	 * @param state US State
	 * @param zip 5-digit zip code
	 */
	public Address(String street, String city, State state, int zip) {
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}

	/**
	 * Returns the street address.
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * Returns the city or town.
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * Returns the two letter abbrevation of the state.
	 * @return the state
	 */
	public State getState() {
		return state;
	}

	/**
	 * Returns the zip code.
	 * @return the zip
	 */
	public int getZip() {
		return zip;
	}
	
	
	

}
