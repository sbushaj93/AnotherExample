package com.neotech.lesson05;

public class ElseIfCondition {

	public static void main(String[] args) {
		
		double d1 = 50.5;
		double d2 = 50;
		
		if (d1 > d2)	//Chain if-else-if statement 
		{
			System.out.println(d1 + " is greater than " + d2);
		}
		else if (d2 > d1)
		{
			System.out.println(d2 + " is greater than " + d1);
		}
		else // d1 == d2
		{
			System.out.println(d1 + " is equal to " + d2);
		}
		
	}

}
