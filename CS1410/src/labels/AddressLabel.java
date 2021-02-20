package labels;
/**
 * Represents an address label that includes the firt and last name
 * of the addressee and his/her address.
 * @author Qi Cao
 *
 */
public class AddressLabel {
	private String firstName;
	private String lastName;
	private Address address;
	/**
	 * Constructor of class AdressLable.
	 * @param firstName first name of the address.
	 * @param lastName  last name of the address.
	 * @param address US address.
	 */
	public AddressLabel(String firstName, String lastName, Address address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}
	
	/**
	 * Print an address label in the following format:</br>
	 * {firstName} {lastName}</br>
	 * {address}</br>
	 * {city}, {state}{zip}</br>
	 */
	
	public void printLabel() {
		
		System.out.printf("%s,%s%n",firstName, lastName);
		System.out.println(address.getStreet());
		System.out.printf("%s,%s,%d%n",address.getCity(),address.getState(),
				address.getZip());
	}
	/**
	 * 
	 */
	
	@Override
	public String toString() {
		return "AddressLabel [fristName=" + firstName + ", lastName=" + lastName + ", address=" + address + "]";
	}
	


}
