package com.neotech.lesson07;

import java.util.Scanner;

public class HomeworkExtra {

	public static void main(String[] args) {
		/*
		 3. Create a Java program that will ask user to input city and temperature.
    		Your program should convert Fahrenheit into Celsius and print 
    		"The temperature is the city __ is __"
		 */
		
		String city;
		double f, c;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the city: ");
		city = input.nextLine();
		
		System.out.println("Now enter the temperature in Fahrenheit: ");
		f = input.nextDouble();
		
		//converting f --> c  : c = (f-32) * 5/9
		c = (f - 32) * 5/9;
		
		System.out.println("The temperature in the " + city + " is " + c + " celcius!!");
		//9:00
		
	}

}
