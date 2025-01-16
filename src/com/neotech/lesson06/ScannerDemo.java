package com.neotech.lesson06;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		
		//data type 		identifier/name 	operator (=) 	value;
		
		//Ctrl + Shift + O  -- For Mac CMD + Shift + O
		
		//we create input object from Scanner class
		Scanner input = new Scanner(System.in);
		//int x = 10;
		
		//We do not need to do this, but it's fine to use it
		Scanner kavya =  new Scanner(System.in);
		
		//In coding, we prompt the user before receiving an user-entry
		//Tell the user what to enter
		System.out.println("Enter your name: ");
		String name = input.next();// scans only one word --> until space/enter is met 
		
		System.out.println("Your name is " + name);
		
		System.out.println("Enter your age: ");
		int age = input.nextInt();	//.nextInt() scans int values
		
		System.out.println("Your age is " + age);
		
		System.out.println("Enter your salary: ");
		double salary = input.nextDouble();
		System.out.println("Your salary is " + salary);
		
		System.out.println("Are you happy? true/false");
		boolean happy = kavya.nextBoolean();
		System.out.println("Happy? " + happy);
	}

}
