// -----------------------------------------------------
// PART 1
// Written by: Nadia Kokoev 40118414
// -----------------------------------------------------
package thirdPackage;

import secondPackage.TelecomAddress;

public class GeneralDeliveryAddress extends GeographicAddress {
	private TelecomAddress namee;
	
	/**
	 * deafult constructor
	 */
	public GeneralDeliveryAddress() {}
	
	public GeneralDeliveryAddress(String validFrom, String validTo, String name, String addressLine, String city, String regionOrState, String zipOrPostCode, Locale locale, TelecomAddress namee) {
		super(validFrom,validTo, name,addressLine,city,regionOrState,zipOrPostCode,locale);
		this.namee = namee;
	}
	
	//we do not use getters because in the base class the attributes have package access
	/**
	 * @param generalAddress of class type TelecomeAddress. 
	 */
	public GeneralDeliveryAddress(GeneralDeliveryAddress generalAddress) {
		this.validFrom = generalAddress.validFrom;
		this.validTo = generalAddress.validTo;
		this.name = generalAddress.name;
		this.addressLine = generalAddress.addressLine;
		this.city = generalAddress.city;
		this.regionOrState = generalAddress.regionOrState;
		this.zipOrPostCode = generalAddress.zipOrPostCode;
		this.locale = generalAddress.locale;
		this.namee = generalAddress.namee;
	}

	/**
	 * @return fields that are stored in the TelecomAddress class
	 */
	public TelecomAddress getNamee() {
		return namee;
	}

	/**
	 * @param namee
	 */
	public void setNamee(TelecomAddress namee) {
		this.namee = namee;
	}
	
	@Override
	public String toString() {
		return "The general delivery address " + addressLine + " " + city + " " + regionOrState + " " + zipOrPostCode + " "
				+ locale + " with " + namee;
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
			GeneralDeliveryAddress gen = (GeneralDeliveryAddress) o;
			System.out.println("equals method inside general delivery class");
			return (this.validFrom.equals(gen.validFrom) && this.validTo.equals(gen.validTo)
					&& this.addressLine.equals(gen.addressLine) && this.city.equals(gen.city)
					&& this.regionOrState.equals(gen.regionOrState) && this.zipOrPostCode.equals(gen.zipOrPostCode)
					&& this.locale.equals(gen.locale) && this.namee == gen.namee);
		} 
	}

	
}
