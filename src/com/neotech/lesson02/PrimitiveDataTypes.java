package com.neotech.lesson02;

public class PrimitiveDataTypes {

	public static void main(String[] args) {
		
		//Data Type 	Name/Identifier 	Operator (=)	Value
		
		//Let's define an age variable 
		byte age = 30;
		
		//This causes a compiler error
		//byte age1 = 128;
		
		short citiesCount = 15000;
		
		System.out.println(age);
		System.out.println(citiesCount);
		
		int var1 = 5; //It works but with a big container for a small value
		
		//How can we decide which data type to use?
			//-> Think about the possible ranges you will have
		long var2 = 104588524456752255l;	//We also can use L
		
		System.out.println(var1);
		System.out.println(var2);
		
		//How to use decimal numbers
		double var3 = 45.25; //45.25 is a literal double
		float var4 = 45.25f;	//We also can use F
		
		System.out.println(var3);
		System.out.println(var4);
		
		char dollar = '$';
		char a = '1';
		char space = ' ';
		
		//boolean is either true or false
		boolean pass = true;
		
		System.out.println(dollar);
		System.out.println(a);
		System.out.println(space);
		System.out.println(pass);

	}

}
