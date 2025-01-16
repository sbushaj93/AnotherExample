package com.neotech.lesson06;

public class Homework3 {

	public static void main(String[] args) {
		//Write a Java Program to check whether number is Even or Odd.
		
		int number = 11;
		
		//Modulus 2 will give us either 0 or 1 
			// if the remainder is 0, then it is even (divisible by 2
			// otherwise, it is odd
		
		//Let's define the remainder
		int remainder = number % 2;
		
		
		//1st way
		if (remainder == 0)
		{
			System.out.println(number + " is even.");
		}
		else 
		{
			System.out.println(number + " is odd.");
		}
		
		//2nd way
		
		if (remainder == 1)
		{
			System.out.println(number + " is odd.");
		}
		else 
		{
			System.out.println(number + " is even.");
		}
		
		//3rd way
		if (number % 2 == 0)
		{
			System.out.println(number + " is even.");
		}
		else 
		{
			System.out.println(number + " is odd.");
		}
		
		
	}

}
