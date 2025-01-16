package com.neotech.lesson06;

public class LogicalOR {

	public static void main(String[] args) {
		// Define an exam score and check if it's not within 0-100 inclusive, 
			//print __ is out of range
			// Otherwise, print __ is within range.
		
		int score = -50;
		
		//for score = 50 --> false || fasle --> false 
		if (score < 0 || score > 100)
		{
			System.out.println(score + " is out of range.");
		}
		else 
		{
			System.out.println(score + " is within range.");
		}

	}

}
