// -----------------------------------------------------
// PART 1
// Written by: Nadia Kokoev 40118414
// -----------------------------------------------------
package thirdPackage;

import firstPackage.Address;


public class GeographicAddress extends Address {
	String addressLine;
	String city;
	String regionOrState;
	String zipOrPostCode;
	Locale locale;

	/**
	 * default constructor
	 */
	public GeographicAddress() {}

	/**
	 * @param validFrom
	 * @param validTo
	 * @param name
	 * @param addressLine the address of the party
	 * @param city city whre party is located
	 * @param regionOrState what province?
	 * @param zipOrPostCode postal code
	 * @param locale goverment code
	 */
	public GeographicAddress(String validFrom, String validTo, String name, String addressLine, String city, String regionOrState,
			String zipOrPostCode, Locale locale) {
		super(validFrom, validTo, name);
		this.addressLine = addressLine;
		this.city = city;
		this.regionOrState = regionOrState;
		this.zipOrPostCode = zipOrPostCode;
		this.locale = locale;
	}

	/**
	 * @param geoAddress copy constructor
	 */
	public GeographicAddress(GeographicAddress geoAddress) {
		this.validFrom = geoAddress.validFrom;
		this.validTo = geoAddress.validTo;
		this.name = geoAddress.name;
		this.addressLine = geoAddress.addressLine;
		this.city = geoAddress.city;
		this.regionOrState = geoAddress.regionOrState;
		this.zipOrPostCode = geoAddress.zipOrPostCode;
		this.locale = geoAddress.locale;
	}

	/**
	 * @return address line 
	 */
	public String getAddressLine() {
		return addressLine;
	}

	/**
	 * @param addressLine
	 */
	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}

	/**
	 * @return city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return province
	 */
	public String getRegionOrState() {
		return regionOrState;
	}

	/**
	 * @param regionOrState
	 */
	public void setRegionOrState(String regionOrState) {
		this.regionOrState = regionOrState;
	}

	/**
	 * @return postal code
	 */
	public String getZipOrPostCode() {
		return zipOrPostCode;
	}

	/**
	 * @param zipOrPostCode
	 */
	public void setZipOrPostCode(String zipOrPostCode) {
		this.zipOrPostCode = zipOrPostCode;
	}

	/**
	 * @return class locale 
	 */
	public Locale getLocale() {
		return locale;
	}

	/**
	 * @param locale
	 */
	public void setLocale(Locale locale) {
		this.locale = locale;
	}
	@Override
	public String toString() {
		return "The geographic address " + addressLine + " " + city + ", " + regionOrState + ", " + zipOrPostCode + " "
				+ locale + " is valid from " + validFrom + " to " + validTo;
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
			GeographicAddress geo = (GeographicAddress) o;
			System.out.println("equals method inside geographic address class");
			return (this.validFrom.equals(geo.validFrom) && this.validTo.equals(geo.validTo)
					&& this.addressLine.equals(geo.addressLine) && this.city.equals(geo.city)
					&& this.regionOrState.equals(geo.regionOrState) && this.zipOrPostCode.equals(geo.zipOrPostCode)
					&& this.locale.equals(geo.locale)) ;
		} 
	}

}
