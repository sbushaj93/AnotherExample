package com.neotech.lesson06;

public class LogicalNOT {

	public static void main(String[] args) {

		// ! (NOT) --> it will negate/invert the value of boolean expression or variable
		// Recall != (not equal)

		boolean var1 = !true; // What is assigned is false

		System.out.println(var1);

		var1 = !false;
		System.out.println(var1);

		// Let's use our LogicalOR example
		int score = 50;

		if (!(score < 0 || score > 100))
		{
			System.out.println(score + " is within range.");
		}
		else 
		{
			System.out.println(score + " is out of range.");
		}
		
		boolean loveJava = false;
		System.out.println("Do you love Java? " + !loveJava);
	}

}
