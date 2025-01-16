package com.neotech.lesson05;

public class Task1 {
	
	/*
	 * Write a program. Create a variable day (1 - 7). For every weekday, print
	 * "Today is Monday and we are working." For weekend, print
	 * "We are on a break on Weekend."
	 */


	public static void main(String[] args) {
		
		byte day = 6;	//day variable 
		
		// if day == 1 --> Today is Monday and we are working
		// else if day == 2 --> Today is Tuesday and we are working
		// else if day == 3 --> Today is Wednesday and we are working
		//..
		
		//Chain if-else-if statement 
		
		if (day == 1)
		{
			System.out.println("Today is Monday and we are working!");
		}
		else if (day == 2)
		{
			System.out.println("Today is Tuesday and we are working!");
		}
		else if (day == 3)
		{
			System.out.println("Today is Wedensday and we are working!");
		}
		else if (day == 4) 
		{
			System.out.println("Today is Thursday and we are working!");
		}
		else if (day == 5)
		{
			System.out.println("Today is Friday and we are working");
		}
		else 
		{
			System.out.println("We are on a break on Weekend!");
		}
		
		// Let's modify the task a bit
		// Print if it is weekday or weekend
		//[1-5] -> weekday
		//[6-7] -> weekend
		
		
		if (day < 1)
		{
			System.out.println("Wrong day value!!!");
		}
		else if (day < 6)
		{
			System.out.println("Today is a weekday and we are working!");
		}
		else if (day < 8)
		{
			System.out.println("Today is a weekend and we are on a break!");
		}
		else 
		{
			System.out.println("Wrong day value!!!");
		}

	}

}
