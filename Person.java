
/** The Person class is used to define and create Person objects
 *  that represent people involved in the project, e.g. customers. */
public class Person {
	
	/** Create personal attributes of the Person class
	 * to create person objects (customer, architect, etc.)
	 * <p>
	 * String value for name 
	 */
	String name;
	/** 
	 * String value for surname 
	 */
	String surname;
	/** 
	 * int value for phoneNumber 
	 */
	int phoneNumber;
	/** 
	 * String value for emailAddress 
	 */
	String emailAddress;
	/** 
	 * String value for physicalAddress 
	 */
	String physicalAddress;
	
	/** Creating constructor
	 *  @param name value
	 *  @param surname value
	 *  @param phone number value
	 *  @param email address value
	 *  @param physical address value */
	public Person(String name, String surname, int phoneNumber, String emailAddress,
	String physicalAddress) {
		
		this.name = name;
		this.surname = surname;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
		this.physicalAddress = physicalAddress;
	}
	
	/** Create setters to edit various Person attributes */
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber; /** edit phoneNumber */
	}
	
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress; /** edit emailAddress */
	}
	
	/** Create toString() method to display attributes of the Person class */
	public String toString() {
		String output = "\nName: " + name;
		output += "\nSurname: " + surname;
		output += "\nContact number: 0" + phoneNumber;
		output += "\nEmail address: " + emailAddress;
		output += "\nPhysical address: " + physicalAddress + "\n";
		
		return output;
	}
}