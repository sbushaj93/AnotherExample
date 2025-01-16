package com.neotech.lesson08;

import java.util.Scanner;

public class Recap {

	public static void main(String[] args) {
		
		// Find the largest among three different numbers 
		// Let the user to enter these numbers
		
		Scanner scan = new Scanner(System.in);
		double a, b, c;
		
		//Let's prompt the user to enter these three numbers
		
		System.out.println("Enter three different numbers:");
		
		a = scan.nextDouble();
		b = scan.nextDouble();
		c = scan.nextDouble();
		
		if (a > b)		// a > b --> true
		{
			if (a > c)	// a > c --> true --> a > b and a > c --> a is the largest
			{
				System.out.println(a + " is the largest number!");
			}
			else 	//a < c --> true --> a > b and c > a --> c is the largest
			{
				System.out.println(c + " is the largest number!");
			}
		}
		
		else  		//b > a 
		{
			if (b > c) 		// a > b --> false and b > c --> b is the largest
			{
				System.out.println(b + " is the largest number!");
			}
			
			else 		//only one possibility c > b > a
			{
				System.out.println(c + " is the largest number!");
			}
		}
		
		//Let's solve the same question with logical operators 
		
		//2nd - way
		if (a > b && a > c) 
		{
			System.out.println(a + " is the largest number!");
		}
		else if (b > a && b > c)
		{
			System.out.println(b + " is the largest number!");
		}
		else 
		{
			System.out.println(c + " is the largest number!");
		}

		
		
		
		
		scan.close(); //optional to get rid of the warning 
		
		
	}

}
