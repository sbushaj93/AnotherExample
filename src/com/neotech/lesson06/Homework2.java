package com.neotech.lesson06;

public class Homework2 {
	/*
	 * Write a program to implement following logic using 
	 * if - else if - else statement:
	 * if hour is less than 12 noon, greet with Good Morning 
	 * if hour is greater than or equal 12 noon but less than 3 pm, greet with Good Afternoon 
	 * if hour is greater than or equal to 3 pm, greet with Good Evening
	 */


	public static void main(String[] args) {
		
		int time = 20;
		
		//Option 1: hour is less than 12
		//Option 2: hour is greater than or equal 12 but less than 15
		//Option 3: hour is greater than or equal 15
		
		if (time < 12)
		{
			System.out.println("Good moring!");
		}
		else if (time < 15)
		{
			System.out.println("Good afternoon!");
		}
		else 
		{
			System.out.println("Good everning!");
		}
	}

}
