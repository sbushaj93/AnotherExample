package com.neotech.lesson05;

public class NestedIf {

	public static void main(String[] args) 
	{
		
		//If it is morning -> say good morning    			<-- out if
			//if it is school day -> you are at school		<-- inner if
			//else you are at home							<-- inner else 
		//else (not morning) -> say good afternoon 			<-- out else 
		
		boolean isMorning = false;
		boolean isSchoolDay = false;
		
		if (isMorning) 				//outer if
		{
			System.out.println("Good morning!");
			
			if (isSchoolDay) 	//inner if
			{
				System.out.println("You're at school.");
			}
			else 				//inner else 
			{
				System.out.println("You're at home.");
			}
		}
		else 					//outer else
		{
			System.out.println("Good afternoon!");
		}
		
		
	}

}
