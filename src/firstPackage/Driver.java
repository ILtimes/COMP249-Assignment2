
// -----------------------------------------------------
// PART 1 and 2
// Written by: Nadia Kokoev 40118414
// -----------------------------------------------------
package firstPackage;

import thirdPackage.*;

import secondPackage.*;

public class Driver {
	// PART2
	/*
	 * it wont work because Copy constructors are not polymorphic because constructors do not get inherited by 
	 * the child class from the parent class. If we try to refer a child object from a parent class reference, 
	 * we will face problems cloning it using the copy constructor.
	 * And if we try clone "address" using the copy constructor of Address,
	 * we will get an Address object instead of the child class, but "address[]" is the one 
	 * holding the object of the child class
	 */
	public static Address[] copyAddresses(Address[] address) {
		int i;
		Address[] addressCopy = new Address[address.length];
		for (i = 0; i < address.length; i++) {
			addressCopy[i] = new Address(address[i]);
		}
		return addressCopy;
	}


	public static void main(String[] args) {

		/*------------------------------------------------------------------------
		   1)Create various objects from the 6 classes, and display all their
		 * information
		 * -----------------------------------------------------------------------
		 */
		WebPageAddress web = new WebPageAddress("2002-01-01", "2004-01-01", "Bella", "www.bella.com");
		EmailAddress email = new EmailAddress("1996-02-02", "1997-04-01", "Bobby", "bobby", "gmail", "com");
		GeneralDeliveryAddress gen = new GeneralDeliveryAddress("2020-12-03", "2050-03-03", "Hanna home", "97 Lincoln",
				"someCity", "Ontario", "123h3h", new Locale("CA", 124, "Canada"),
				new TelecomAddress("2020-12-03", "2050-03-03", "Book Store", "+1", "(0)", 415, 2543516, 788, "pager"));
		TelecomAddress tel = new TelecomAddress("2020-01-01", "2028-01-12", "Ice Cream", "+1", "(0)", 438, 6664567, 789,
				"phone");
		System.out.println(web);
		System.out.println(email);
		System.out.println(gen);
		System.out.println(tel);

		/*---------------------------------------------------------------------------
		 *3) Create an array of 15 to 20 of these address objects
		 *---------------------------------------------------------------------------
		 */
		Address[] address = new Address[15];
		address[0] = new WebPageAddress("2014-02-01", "2018-02-01", "Julien", "www.julien.com/jewls");// not valid
		address[1] = new WebPageAddress("2010-02-12", "2024-04-16", "Tipo", "www.tipo.com/il");// valid
		address[2] = new EmailAddress("2021-03-09", "2030-01-01", "Allie", "allie", "gmail", "org");// not valid
		address[3] = new EmailAddress("2010-02-02", "2021-04-01", "Andy", "andy", "gmail", "com");// valid
		address[4] = new TelecomAddress("2000-03-03", "2001-03-09", "HerbalBuissnes", "+1", "(0)", 438, 1234567, 789,
				"phone");// not
		// valid
		address[5] = new TelecomAddress("2020-01-01", "2022-01-01", "sephore", "+1", "(0)", 438, 1234567, 789, "phone");// valid
		address[6] = new GeographicAddress("2014-02-01", "2018-02-01", "zoo", "705 griffintown", "Montreal", "Quebec", // not
				// valid
				"H2V4S8", new Locale("CA", 124, "Canada"));
		address[7] = new PostOfficeBoxAddress("2010-02-02", "2021-04-01", "office", "215 Avenue Querbes", "Outremont",
				"Quebec", "h5j6gt", new Locale("CA", 124, "Canada"), 1234);// valid
		address[8] = new GeneralDeliveryAddress("2025-03-03", "2026-03-03", "home bob", "100 lourier", "Toronto",
				"Ontario", "1h2h3h", new Locale("CA", 124, "Canada"),
				new TelecomAddress("2025-03-03", "2026-03-03", "lemonbuisness", "+1", "(0)", 415, 2504516, 788, "fax"));
		address[9] = new PostOfficeBoxAddress("2010-04-01", "2021-03-07", "canadapost", "50 saint luke", "Quebec",
				"Quebec", "dat4j5", new Locale("CA", 124, "Canada"), 1222);// not valid
		address[10] = new WebPageAddress("2010-02-12", "2024-04-16", "Tipo", "www.tipo.com/il");// same as address 1
		address[11] = web;
		address[12] = email;
		address[13] = gen;
		address[14] = tel;
		System.out.println("");
		System.out.println("");
		/*--------------------------------------------------------------------------
		 * 4)Call the traceObsoleteAddresses() method with the array created above,
		 * -------------------------------------------------------------------------
		 */
		System.out.println("--------------The traceObsoleteAddresses Method--------------");
		Driver.traceObsoleteAddresses(address, 2021, 03, 07);

		/*------------------------------------------------------------------------
		   2)Test the equality of some of the created objects using the equals() method.
		 * -----------------------------------------------------------------------
		 */
		System.out.println("");
		System.out.println("--------------The equals() Method--------------");
		// example for identical classes
		if (address[10].equals(address[1])) {
			System.out.println(
					address[10].getName() + " and the other " + address[1].getName() + " are identical classes");
		} else
			System.out.println(address[10].getName() + " and " + address[1].getName() + " are not identical classes");
		// another example for classes that are not identical
		if (address[6].equals(address[8])) {
			System.out.println(
					address[6].getName() + " and the other " + address[8].getName() + " are identical classes");
		} else
			System.out.println(address[6].getName() + " and " + address[8].getName() + " are not identical classes");
        
		System.out.println("");
		System.out.println("");
		//-----------PART 2--------------
		System.out.println("----------------------THE COPY ARRAY-----------------------");
		Address[] addressCopy= Driver.copyAddresses(address);
		int i;
		for (i = 0; i < addressCopy.length; i++) {
			System.out.println(addressCopy[i]);
		}
		System.out.println("");
		System.out.println("");
		
		//printing original array:
		System.out.println("----------------------THE ORIGINAL ARRAY-----------------------");
		System.out.println("");
		int d;
		for (d = 0; d < address.length; d++) {
			System.out.println(address[d]);
		}
		
	}

	private static void traceObsoleteAddresses(Address[] address, int year, int month, int day) {
		System.out.println("THIS ARE THE OBSOLETE ADDRESSES AND THEIR FROM AND TO DATES:");
		System.out.println("-------------------------------------------------------------");
		for (int i = 0; i < address.length; i++) {
			String splitFrom[] = address[i].validFrom.split("-");
			String splitTo[] = address[i].validTo.split("-");
			int yFrom = Integer.parseInt(splitFrom[0]);
			int mFrom = Integer.parseInt(splitFrom[1]);
			int dFrom = Integer.parseInt(splitFrom[2]);
			int yTo = Integer.parseInt(splitTo[0]);
			int mTo = Integer.parseInt(splitTo[1]);
			int dTo = Integer.parseInt(splitTo[2]);
			if (year < yFrom || year > yTo)
				System.out.println(address[i]);
			else if (year == yFrom || year == yTo) {
				if (year == yFrom) {
					if (month < mFrom)
						System.out.println(address[i]);
					else if (month == mFrom && day < dFrom)
						System.out.println(address[i]);
				} else if (year == yTo)
					if (month > mTo)
						System.out.println(address[i]);
					else if (month == mTo && day > dTo)
						System.out.println(address[i]);
			}
		}

	}

}
