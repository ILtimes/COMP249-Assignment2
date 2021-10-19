// -----------------------------------------------------
// PART 1
// Written by: Nadia Kokoev 40118414
// -----------------------------------------------------
package thirdPackage;

public class Locale {
private String countryCode1;
private int countryCode2;
private String engLangName;

/**
 * default constructor 
 */
public Locale() {
	//this.countryCode1 = "CA";
	//this.countryCode2 = 124;
	//this.engLangName = "Canada";
}

/**
 * @param countryCode1 government code of 2 letters
 * @param countryCode2 government code of 3 integers
 * @param engLangName government name for the country 
 */
public Locale(String countryCode1, int countryCode2, String engLangName) {
	this.countryCode1 = countryCode1;
	this.countryCode2 = countryCode2;
	this.engLangName = engLangName;
}

/**
 * @param local copy constructor
 */
public Locale(Locale local) {
	this.countryCode1 = local.countryCode1;
	this.countryCode2 = local.countryCode2;
	this.engLangName = local.engLangName;
}

/**
 * @return country code string 
 */
public String getCountryCode1() {
	return countryCode1;
}

/**
 * @param countryCode1
 */
public void setCountryCode1(String countryCode1) {
	this.countryCode1 = countryCode1;
}

/**
 * @return country code int
 */
public int getCountryCode2() {
	return countryCode2;
}

/**
 * @param countryCode2
 */
public void setCountryCode2(int countryCode2) {
	this.countryCode2 = countryCode2;
}

/**
 * @return english country name
 */
public String getEngLangName() {
	return engLangName;
}

/**
 * @param engLangName
 */
public void setEngLangName(String engLangName) {
	this.engLangName = engLangName;
}

@Override
public String toString() {
	return countryCode1+" "+ countryCode2+" "+engLangName;
}
}
