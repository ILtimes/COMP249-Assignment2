
// -----------------------------------------------------
// PART 1
// Written by: Nadia Kokoev 40118414
// -----------------------------------------------------

package firstPackage;


public class Address {
	// attributes to specify and limit the use of an Address.
	//protected in order for every child class to access attributes by name
	protected String validFrom;
	protected String validTo;
	protected String name;
	

	/**
	 * default constructor 
	 */
	public Address() {}

	/**
	 * @param validFrom a parameter for the beginning of an address
	 * @param validTo a parameter for the end of an address
	 * @param name a parameter that helps identify each class object by name 
	 */
	public Address(String validFrom, String validTo, String name) {
		this.validFrom = validFrom;
		this.validTo = validTo;
		this.name = name;
	}
	
	/**
	 * @param address a copy constructor that makes a copy of an object of the type class
	 */
	public Address(Address address) {
		this.validFrom = address.validFrom;
		this.validTo = address.validTo;
		this.name = address.name;
	}
	
	/**
	 * @return the name field 
	 */
	public String getName() {
		return name;
	}

	/**
	 * a setter for the name field
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * a setter for the valid from field
	 * @param validFrom you pass a start date for an address
	 */
	public void setValidFrom(String validFrom) {
		this.validFrom = validFrom;
	}
	/**
	 * @return the validity date from of an address
	 */
	public String getValidFrom() {
		return this.validFrom;
	}
	
	/**
	 * @param validTo you pass an end date for an address
	 */
	public void setValidTo(String validTo) {
		this.validTo = validTo;
	}
	
	/**
	 * @return the valid to field 
	 */
	public String getValidTo() {
		return this.validTo;
	}
	@Override
	public String toString() {
		return validFrom+" "+ validTo;
	}
	
	@Override
	public boolean equals(Object o) {
		if (o == null) {
			System.out.println("the Objetc is null. Meaning empty Therefore it will return false");
			return false;
		}
		else if (this.getClass() != o.getClass())
			return false;
		else {
		Address address = (Address) o;
			System.out.println("Equals method inside address class");
			return (this.validFrom.equals(address.validFrom) && this.validTo.equals(address.validTo)
					&& this.name.equals(address.name)) ;
		} 
	}
	
}
