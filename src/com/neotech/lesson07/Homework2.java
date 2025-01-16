package com.neotech.lesson07;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		
		/*
		 2. Write a program that will ask for the day (a number from 1-7). 
		 Print whether it is a weekend or weekday.
			If any day from 1-5 → output "It is a weekday"
			Any day from 6-7 → output "It is a weekend",
			Any other day → output "Invalid day"
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number from 1 to 7: ");
		int day = scan.nextInt();
		
		//&, ||, !      >, >=, <, <=, ==, !=
		
		//using && operator
		if (day >= 1 && day <= 5) //[1,5]
		{
			System.out.println("It is a weekday!");
		}
		else if (day >= 6 && day <= 7)
		{
			System.out.println("It is a weekend!");
		}
		else
		{
			System.out.println("Invalid Input!");
		}
		
		//Using || operator
		
		if (day == 1 || day == 2 || day == 3 || day == 4 || day == 5)
		{
			System.out.println("It is a weekday!");
		}
		else if (day == 6 || day == 7)
		{
			System.out.println("It is a weekend!");
		}
		else
		{
			System.out.println("Invalid day!");
		}
		
		//there is nothing preventing us from using however we see it logical
		//Using || and &&
		
		if (day >= 1 && day <= 5)
		{
			System.out.println("It is a weekday!");
		}
		else if (day == 6 || day == 7)
		{
			System.out.println("It is a weekend!");
		}
		else
		{
			System.out.println("Invalid input!");
		}

	}

}
