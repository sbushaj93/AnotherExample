package com.neotech.lesson08;

public class IntroToDoWhile {

	public static void main(String[] args) {
		
		//While loop
		//Check the condition first
		//If the condition is true, execute the loop body/block 
		//and check again until the condition becomes false
		//If the condition is false, do not enter the block
		//move to the instruction next to the loop block
		
		int num = 5;
		while (num > 10) 
		{
			System.out.print(num++ + " ");
		}
		
		//Do While loop
		//First executes the loop body/block
		//then check the condition
		//If the condition is true, repeat the process (iterate)
		//If the condition is false, exit the loop body
		
		do 
		{
			System.out.print(num + " ");
		}while (num > 10);
		
		//The main difference between while and do-while loops is that
		//do-while loop will be executed at least once not matter what!
		

	}

}
