package com.neotech.lesson05;

public class Homework2 {
	
	/*
	 * 2. Create a Java program and name it Temperature Check. Create variable 
	 * to store temperature. Your program should check if temperature is below 32 
	 * If temperature is below then it should print “Water will freeze with temperature__”,
	 * otherwise “Water will NOT freeze with temperature __”.
	 */


	public static void main(String[] args) {
		
		double temp = 31; //Widening int --> double 
		
		//if temp < 32 
			//--> someCode
		//else
			//--> someOtherCode
		
		
		if (temp < 32) //if-else (two-way if statement)
		{
			System.out.println("Water will freeze with temperature " + temp);
		}
		else
		{
			System.out.println("Water will NOT freeze with temperature " + temp);
		}

	}

}
