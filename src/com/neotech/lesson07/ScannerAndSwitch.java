package com.neotech.lesson07;

import java.util.Scanner;

public class ScannerAndSwitch {

	public static void main(String[] args) {
		// Ask the user to enter their country
		// then print the language they speak
		
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("Where are you from: ");
		String country = myScanner.nextLine();
		
		//using switch
		switch(country)
		{
		case "Albania":
		case "Kosova":
			System.out.println("You speak Albanian!");
			break;
		case "India":
			System.out.println("You speak Hindi");
			break;
		case "Turkiye":
			System.out.println("You speak Turkish");
			break;
		case "Russia":
			System.out.println("You speak Russian");
			break;
		case "USA":
		case "UK":
		case "Australia":
		case "Canada":
			System.out.println("You speak English!");
			break;
		default: 
			System.out.println("I will have to add that to the cases!");
			break;
		}
		
		//We do not use == to check Strings for equality. Strings are not primitive data types.
		//We use .equals() or .equalsIgnoreCase() to check Strings for equality. 
		
		
		
		//how to handle case differences. Ex: uk - UK - Uk - uK
			// for the switch case, I could convert the country to lowercase 
									//and then have all the cases as lowercase
			
			//.equals() it is used to compare the contents of the Strings!!!
			if (country.equals("Albania") || country.equals("Kosova"))
			{
				System.out.println("You speak Albanian!");	
			}
			else if (country.equals("India"))
			{
				System.out.println("You speak Hindi!");
			}
			else if (country.equals("Turkiye"))
			{
				System.out.println("You speak Turkish!");
			}
			else if (country.equals("Russia"))
			{
				System.out.println("You speak Russian!");
			}
			else if (country.equalsIgnoreCase("USA") || country.equalsIgnoreCase("UK") 
					|| country.equals("Australia") || country.equals("Canada"))
			{
				System.out.println("You speak English!");
			}
			else
			{
				System.out.println("I will have to add that to the conditions!");
			}
	}

}
