// -----------------------------------------------------
// PART 1
// Written by: Nadia Kokoev 40118414
// -----------------------------------------------------
package secondPackage;

import firstPackage.Address;

public class EmailAddress extends Address {
	private String userName;
	private String domainName;
	private String tld; // Top Level Domain (TLD) can be com, org, gov, etc

	/**
	 * default constructor 
	 */
	public EmailAddress() {
	}

	/**
	 * @param validFrom
	 * @param validTo
	 * @param name
	 * @param userName the first part of the email before @
	 * @param domainName the part of the email after the @
	 * @param tld the part in the email after the dot 
	 */
	public EmailAddress(String validFrom, String validTo, String name, String userName, String domainName, String tld) {
		super(validFrom, validTo, name);
		this.userName = userName;
		this.domainName = domainName;
		this.tld = tld;
	}

	/**
	 * @param email copy constructor 
	 */
	public EmailAddress(EmailAddress email) {
		this.validFrom = email.validFrom;
		this.validTo = email.validTo;
		this.name = email.name;
		this.userName = email.userName;
		this.domainName = email.domainName;
		this.tld = email.tld;
	}

	/**
	 * @return user name field 
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return domain name 
	 */
	public String getDomainName() {
		return domainName;
	}

	/**
	 * @param domainName
	 */
	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}

	/**
	 * @return the tld
	 */
	public String getTld() {
		return tld;
	}

	/**
	 * @param tld
	 */
	public void setTld(String tld) {
		this.tld = tld;
	}
	/**
	 *prints the information of the address
	 */
	@Override
	public String toString() {
		return "The Email " + userName + "@" + domainName + "." + tld + " is valid from " + validFrom + " to "
				+ validTo;
	}

	/**
	 *checks first of all if the object passed is empty. if not empty then it checks if it is identical 
	 *to the calling object, returns true if so.
	 */
	@Override
	public boolean equals(Object o) {
		if (o == null)
			return false;
		else if (this.getClass() != o.getClass())
			return false;
		else {
			EmailAddress email = (EmailAddress) o;
			System.out.println("equals method inside email class");
			return (this.validFrom.equals(email.validFrom) && this.validTo.equals(email.validTo)
					&& this.userName.equals(email.userName) && this.domainName.equals(email.domainName)
					&& this.tld.equals(email.tld));
		} 
	}
}
