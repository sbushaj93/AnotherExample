package com.neotech.lesson02;

public class PrintLine {

	public static void main(String[] args) {
		
		System.out.println("What's up?!");
		//println() -> prints the whole statement and them moves the cursor to the next line
		
		System.out.println("How are you doing?");
		
		System.out.print("1");
		//print() -> prints the whole statement but it doesn't move the cursor to the next line
		
		System.out.print("2");
		System.out.print("3");
		System.out.print("4");
		
		System.out.println();//This code inserts a new line
		
		//We can also use \n to insert a new line
		
		System.out.println("Do you like Java?\nYes, I do");
		
		System.out.print("\n"); //This code will just move the cursor to the next line
		System.out.print("\n"); 
		System.out.print("\n"); 
		System.out.print("\n"); 
		System.out.print("\n"); 
		
		System.out.println("\n\n\n\n");
		
		System.out.println("Let's display this line!");
	}

}
