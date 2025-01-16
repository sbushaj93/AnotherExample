package com.neotech.lesson08;

public class Task1 {

	public static void main(String[] args) {
		//How can I print only even numbers from 50 to 1?
		
		int x = 50;
		
		while (x > 1) 
		{
			System.out.print(x + " ");
			//We need to update the loop control variable --> x
			x = x - 2; // x -= 2;
						// x--;
						// x--;
		}
		
		System.out.println();
		
		int y = 50;
		while (y > 1) 
		{
			if (y % 2 == 0)
			{
				System.out.print(y + " ");
			}
			
			y--; //OR --y; 
		}
		
		
		
	}

}
