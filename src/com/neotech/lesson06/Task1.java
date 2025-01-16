package com.neotech.lesson06;

import java.util.Scanner;

import javax.security.auth.callback.LanguageCallback;

public class Task1 {

	public static void main(String[] args) {
		
		//	Write a program that asks the user to enter first name and 
		//	then last name. At the end, the system should display the user's full name.
		
		String fName, lName;
		
		Scanner scan = new Scanner(System.in);
		
		//I need to prompt the user to enter the first name
		System.out.println("Enter your first name: ");
		fName = scan.next();
		
		//I need to prompt the user to enter the last name
		System.out.println("Enter your last name: ");
		lName = scan.next();
		
		System.out.println("My full name is: " + fName + " " + lName);
		
		
		//If you want to get rid of the warning for Scanner object, then we can use
		//.close() to close the resource 
		scan.close();

	}

}
