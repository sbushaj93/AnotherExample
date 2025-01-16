package com.neotech.lesson02;

public class Variables {

	public static void main(String[] args) {
		
		//Data Type			Name/Identifier 			operator 			value
		int					someNumber					=					15;
		
		//Can I display a literal integer? -> Yes!
		System.out.println(15);	// This is a int literal 
		System.out.println("15"); //This is a string literal 
		
		//If I want to display/use someNumber, I use directly by its name
		System.out.println(someNumber); //This is a variable defined value
		System.out.println(someNumber);
		
		
		//This is will cause a compiler error -> var is not defined a variable 
		//System.out.println(var); //var does exist in my code
									//That means it's not define/declared and assigned a value
		
		
	}

}
