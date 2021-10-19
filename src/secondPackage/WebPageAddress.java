// -----------------------------------------------------
// PART 1
// Written by: Nadia Kokoev 40118414
// -----------------------------------------------------
package secondPackage;

import firstPackage.Address;

public class WebPageAddress extends Address {
	private String url; // "www.domainName/resourceName".resourceName is optional.


	/**
	 * default constructor
	 */
	public WebPageAddress() {
	}

	/**
	 * @param validFrom
	 * @param validTo
	 * @param name
	 * @param url the entire url 
	 */
	public WebPageAddress(String validFrom, String validTo, String name, String url) {
		super(validFrom, validTo, name);
		this.url = url;
	}

	/**
	 * @param webAddress copy constructor
	 */
	public WebPageAddress(WebPageAddress webAddress) {
		System.out.println("THIS HAS BEEN ACCESSED");
		this.validFrom = webAddress.validFrom;
		this.validTo = webAddress.validTo;
		this.name = webAddress.name;
		this.url = webAddress.url;
	}


	/**
	 * @param url
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * @return url
	 */
	public String getUrl() {
		return this.url;
	}
	@Override
	public String toString() {
		return "The website " + url + " is valid from " + validFrom + " to " + validTo;
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
		WebPageAddress web1 = (WebPageAddress) o;
			System.out.println("equals method inside web page class");
			return (this.validFrom.equals(web1.validFrom) && this.validTo.equals(web1.validTo)
					&& this.url.equals(web1.url) && this.name.equals(web1.name)) ;
		} 
	}

}
