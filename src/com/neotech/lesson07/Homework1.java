package com.neotech.lesson07;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		/*
		 1. Ask the user to enter the height in inches. 
		 Person should be classified as one of the following:
			• short (under 60 inch)
			• medium (between 60 -72 inch)
			• tall (over 72 inch) 
				 
		 */
		
		/*
		 	How to do it: 
		 		1. we need a scanner (to scan the height
		 		2. scan the height as double
		 		3. write the if condition
		 	*/

			//1. we need a scanner (to scan the height
			Scanner scan = new Scanner(System.in);
			//2. scan the height as double
			System.out.println("Enter your height: ");
			double height = scan.nextDouble();
			
			//3. write the if condition
				// Option 1: height > 0 and height < 60
				// Option 2: height >= 60 and height <= 72
				// Option 3: height > 72
			
			if (height > 0 && height < 60)	//]0,60[
			{
				System.out.println("You are classified as short!");
			}
			else if (height >= 60 && height <= 72)
			{
				System.out.println("You are classified as medium!");
			}
			else if (height > 72)
			{
				System.out.println("You are classified as tall!");
			}
			else
			{
				System.out.println("Invalid Input!");
			}
			
			

	}

}
