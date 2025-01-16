package com.neotech.lesson08;

import java.util.Scanner;

public class IntroToWhileLoop {

	public static void main(String[] args) {
		
		int num = 1;
		
		//The execution of while-loop follows these steps:
			//1. Check the loop condition --> true or false 
				//--> if it is false (same like if-statement) skip the entire block
				//--> if it is true, go inside the scope/block and execute the statements 
					//--> get back to the condition and check if it is still true
			
		
		while (num < 11)	//Loop header
		{ 					//Loop body
			System.out.print(num + " ");
			//We must have an update to get out of infinite loop situation
			num++;
		}					//End of Loop body
		
		System.out.println(); //Just to get the displays separated, we insert a new line 
		
		num = 1;
		
		//2nd way of the same display
		while (num < 11)
		{
			System.out.print(num++ + " "); //display num then increment it
		}
		
		System.out.println();
		
		// How can I enter 5 numbers from the console 
		// using while-loop
		
		int var;
		Scanner scan = new Scanner(System.in);
		int count = 5;
		
		while (count > 0)
		{
			System.out.println("Enter a number:");
			var = scan.nextInt();
			System.out.println(var); //Simple display of the entered number
			
			
			count--;
		}
		
		
		//2nd way 
		count = 1;
		
		while (count <= 5)
		{
			System.out.println("Enter a number:");
			var = scan.nextInt();
			System.out.println(var); //Simple display of the entered number
			
			count++;
		}
		
		
	}

}
