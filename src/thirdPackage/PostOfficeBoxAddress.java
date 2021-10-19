// -----------------------------------------------------
// PART 1
// Written by: Nadia Kokoev 40118414
// -----------------------------------------------------
package thirdPackage;

public class PostOfficeBoxAddress extends GeographicAddress {
	private int boxLobbyDoorCode;

	/**
	 * default constructor
	 */
	public PostOfficeBoxAddress() {	}

	public PostOfficeBoxAddress(String validFrom, String validTo, String name, String addressLine, String city, String regionOrState,
			String zipOrPostCode, Locale locale, int boxLobbyDoorCode) {
		super(validFrom, validTo, name, addressLine, city, regionOrState, zipOrPostCode, locale);
		this.boxLobbyDoorCode = boxLobbyDoorCode;
	}
	
	//we do not need getters because Address class has protected attributes and
	//the GeographicAddress class has package access for attributes 
	/**
	 * @param box a unique number for every box
	 */
	public PostOfficeBoxAddress(PostOfficeBoxAddress box) {
		this.validFrom = box.validFrom;
		this.validTo = box.validTo;
		this.name = box.name;
		this.addressLine = box.addressLine;
		this.city = box.city;
		this.regionOrState = box.regionOrState;
		this.zipOrPostCode = box.zipOrPostCode;
		this.locale = box.locale;
		this.boxLobbyDoorCode = box.boxLobbyDoorCode;
	}

	/**
	 * @return the box number
	 */
	public int getBoxLobbyDoorCode() {
		return boxLobbyDoorCode;
	}

	/**
	 * @param boxLobbyDoorCode
	 */
	public void setBoxLobbyDoorCode(int boxLobbyDoorCode) {
		this.boxLobbyDoorCode = boxLobbyDoorCode;
	}
	@Override
	public String toString() {
		return "The post office address " + addressLine + " " + city + " " + regionOrState + " " + zipOrPostCode + " "
				+ locale + " with code " + boxLobbyDoorCode + " is valid from " + validFrom + " to " + validTo;
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
			PostOfficeBoxAddress box = (PostOfficeBoxAddress) o;
			System.out.println("equals method inside post office box class");
			return (this.validFrom.equals(box.validFrom) && this.validTo.equals(box.validTo)
					&& this.addressLine.equals(box.addressLine) && this.city.equals(box.city)
					&& this.regionOrState.equals(box.regionOrState) && this.zipOrPostCode.equals(box.zipOrPostCode)
					&& this.locale.equals(box.locale) && this.boxLobbyDoorCode == box.boxLobbyDoorCode);
		} 
	}

}
