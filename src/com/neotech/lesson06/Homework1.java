package com.neotech.lesson06;

public class Homework1 {
	
	/*
	 * Write a java program to check if a patient has allergies. 
	 * If the patient does not have allergies print "You’re healthy!". 
	 * If the patient has allergies, check if it is a peanut allergy, lactose allergy, 
	 * bee allergy or seafood allergy and print a statement telling the patient 
	 * "Don’t eat ___". (fill the line with the food names – peanut, seafood etc.)
	 */


	public static void main(String[] args) {
		
		boolean hasAllergy = true;
		boolean peanut = true;
		boolean lactose = false;
		boolean bee = true;
		boolean seafood = true;
		
		if (hasAllergy) //outer if for inspecting hasAllergy 
		{
			if (peanut) //inner if for inspecting if there peanut allergy 
			{
				System.out.println("Do not eat peanut!");
			}
			
			if (lactose) //inner if for inspecting if there latose allergy 
			{
				System.out.println("Do not eat dairy products!");
			}
			
			if (bee) //inner if for inspecting if there bee allergy 
			{
				System.out.println("Stay away from bees!");
			}
			
			if (seafood) //inner if for inspecting if there seafood allergy 
			{
				System.out.println("Do not eat seafood!");
			}
			
		}
		else 
		{
			System.out.println("You're healthy!");
		}
		
	}

}
