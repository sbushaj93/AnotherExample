package com.neotech.lesson06;

import java.util.Scanner;

public class NextLineDemo {

	public static void main(String[] args) {
		
		//To scan a complete line from the console, we use .nextLine() method
		
		String fullName;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter your full name: ");
		fullName = keyboard.nextLine(); 	//Takes a full line until enter is pressed
		
		System.out.println("Your full name is: " + fullName);

	}

}
