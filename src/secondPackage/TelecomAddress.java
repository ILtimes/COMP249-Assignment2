// -----------------------------------------------------
// PART 1
// Written by: Nadia Kokoev 40118414
// -----------------------------------------------------
package secondPackage;

import firstPackage.Address;

//+1 (0)208 1234567 ext. 789 mobile
public class TelecomAddress extends Address {
	private String countryCode;
	private String ndd;
	private int areaCode;
	private int number;
	private int extension;
	private String physicalType;

	/**
	 * default constructor
	 */
	public TelecomAddress() {}

	/**
	 * @param validFrom
	 * @param validTo
	 * @param name
	 * @param countryCode the number you must use to direct dial a particular country
	 * @param ndd  national Direct Dialing Prefix- the prefix to make a call within a country between different cities or areas,
	 * @param areaCode the code for an area or city
	 * @param number the telephone number
	 * @param extension accessible via the number
	 * @param physicalType  the type of device,

	 */ 
	public TelecomAddress(String validFrom, String validTo, String name, String countryCode, String ndd, int areaCode, int number,
			int extension, String physicalType) {
		super(validFrom, validTo, name);
		this.countryCode = countryCode;
		this.ndd = ndd;
		this.areaCode = areaCode;
		this.number = number;
		this.extension = extension;
		this.physicalType = physicalType;
	}

	//we do not use getters because the base class has protected attributes
	/**
	 * @param telAddress copy constructor
	 */
	public TelecomAddress(TelecomAddress telAddress) {
		this.validFrom = telAddress.validFrom;
		this.validTo = telAddress.validTo;
		this.name = telAddress.name;
		this.countryCode = telAddress.countryCode;
		this.ndd = telAddress.ndd;
		this.areaCode = telAddress.areaCode;
		this.number = telAddress.number;
		this.extension = telAddress.extension;
		this.physicalType = telAddress.physicalType;
	}

	/**
	 * @return country code
	 */
	public String getCountryCode() {
		return countryCode;
	}

	/**
	 * @param countryCode
	 */
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	/**
 	 * @return national Direct Dialing Prefix
	 */
	public String getNdd() {
		return ndd;
	}

	/**
	 * @param ndd
	 */
	public void setNdd(String ndd) {
		this.ndd = ndd;
	}

	/**
	 * @return area code
	 */
	public int getAreaCode() {
		return areaCode;
	}

	/**
	 * @param areaCode
	 */
	public void setAreaCode(int areaCode) {
		this.areaCode = areaCode;
	}

	/**
	 * @return phone number
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * @param number
	 */
	public void setNumber(int number) {
		this.number = number;
	}

	/**
	 * @return extension
	 */
	public int getExtension() {
		return extension;
	}

	/**
	 * @param extension
	 */
	public void setExtension(int extension) {
		this.extension = extension;
	}

	/**
	 * @return physical type like phone or fax
	 */
	public String getPhysicalType() {
		return physicalType;
	}

	/**
	 * @param physicalType
	 */
	public void setPhysicalType(String physicalType) {
		this.physicalType = physicalType;
	}

	@Override
	public String toString() {
		return "The telecom address " + countryCode + ndd + areaCode + " " + number + " ext. " + extension
				+ " of type " + physicalType + " is valid from " + validFrom + " to " + validTo;
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
			TelecomAddress tel = (TelecomAddress) o;
			System.out.println("equals method inside telecom address class");
			return (this.validFrom.equals(tel.validFrom) && this.validTo.equals(tel.validTo)
					&& this.countryCode.equals(tel.countryCode) && this.ndd.equals(tel.ndd)
					&& this.areaCode == tel.areaCode && this.number == tel.number && this.extension == tel.extension
					&& this.physicalType.equals(tel.physicalType));
		} 
	}

}
