package com.neotech.lesson03;

public class VariableValues {

	/*
	 	2. Create a Java program and name it VariableValues
		In your program create variables to store all different types of primitive data.
		Print the value of each variable.
		Update value of each variable.
		Print the value of each variable after updating. 
	 */
	
	
	public static void main(String[] args) {
		//how do I declare a variable???
		
		//Data Type			Name/Identifier
		
		//how do I declare and assign value to a variable??
		
		//Data Type			Name/Identifier   Assignment Operator (=)  	Value		;
		byte a = 10;
		short b = 250;
		int c = 2500;
		long d = 23453453L;
		
		
		float e = 23.5f;
		double f = 55.4;
		
		char g = '$';
		boolean h = false;
		
		//printing variables
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		
		//can I change the values of the parameters???
		//Yes, we call this reassigning 

		a = 25;
		b = 50;
		c = 35000;
		d = 123453434l;
		e = 3453F;
		f = 5;
		g = '5'; //this is a character (in the current state is not a numerical variable)
		h = true;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		
		
	}
	
	
	
	
}
