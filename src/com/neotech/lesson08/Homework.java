package com.neotech.lesson08;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		// Allow the user to enter a grade and then provide explanation: A-Excellent,
		// B-Good,
		// C-Average, D-Bad, and any other grade --> Not Acceptable.
		// At the end, your program should print which grade was entered by the user
		// with its explanation.

		Scanner input = new Scanner(System.in);

		System.out.print("Enter your grade: ");
		char grade = input.next().charAt(0);

		System.out.println(); // Insert a new line
								// To avoid crowded display
		switch (grade) 
		{
		case 'A':
			System.out.println("A-Excellent");
			break;

		case 'B':
			System.out.println("B-Good");
			break;

		case 'C':
		case 'c': // To include lowercase c --> we can do for all cases
			System.out.println("C-Average");
			break;

		case 'D':
			System.out.println("D-Bad");
			break;

		default:
			System.out.println("Not Acceptable");
			break;
		}

		if (grade == 'A' || grade == 'a') 
		{
			System.out.println("A-Excellent");
		} 
		else if (grade == 'B' || grade == 'b') 
		{
			System.out.println("B-Good");
		} 
		else if (grade == 'C' || grade == 'c') 
		{
			System.out.println("C-Average");
		} 
		else if (grade == 'D' || grade == 'd') 
		{
			System.out.println("D-Bad");
		} 
		else 
		{
			System.out.println("Not Acceptable!");
		}

	}
}
