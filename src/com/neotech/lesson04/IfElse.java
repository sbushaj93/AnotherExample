package com.neotech.lesson04;

public class IfElse {

	public static void main(String[] args) {

		// Let us assume I have 500$ in my account

		int myBalance = 5000;

		int myRequest = 1000;

		if (myRequest <= myBalance) // I have more money then I request
		{
			System.out.println("Cool, enjoy shopping!!!");
		} 
		else // I am requesting more than I have on balance
		{
			System.out.println("You are requesting " + myRequest + " dollars but you only have " 
			+ myBalance + " dollars!!");
		}
		System.out.println("===================");

		
		// You should practice 15 hours per week!!!
		
		int hours = 10;
		
		if (hours >= 15) //if hours is 15 or more
		{
			System.out.println("You will love Java!!!");
		}
		else // if hours is less than 15
		{
			System.out.println("You might find Java difficult!!!!");
		}
		
		System.out.println("We are done for today!!! Sorry for the overtime!!!");
		
		
	}

}
