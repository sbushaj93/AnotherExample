package com.neotech.lesson06;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		
//		Write a program that asks user to enter two numbers and prints which one is larger.
		
		//We need to have a Scanner object
		//We also need to have two (let say) int numbers
		//Finally, we should write an if or if-else or if-else-if statement structure 
		
		//Let's declare two int(s)
		int num1, num2;
		
		Scanner scan;	//declared a Scanner object --> scan
		//To initialize it
		scan = new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		num1 = scan.nextInt();
		
		System.out.println("Enter the second number: ");
		num2 = scan.nextInt();
		
		System.out.println("Your numbers are " + num1 + " and " + num2);
		
		if (num1 > num2)
		{
			System.out.println(num1 + " is greater than " + num2);
		}
		else if (num2 > num1)
		{
			System.out.println(num2 + " is greater than " + num1);
		}
		else
		{
			System.out.println(num1 + " is equal to " + num2);
		}
		
		//optional --> you can ignore it if you like!
		scan.close();
	}
	
}
