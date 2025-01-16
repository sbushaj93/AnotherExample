package com.neotech.lesson08;

public class IncrementAndDecrement {

	public static void main(String[] args) {
		
		int x = 5;
		
		x = x + 1;	// update the value of x by adding 1 to it
		
		System.out.println(x);
		
		x += 1;		// += shorthand operator --> x = x + 1
		
		System.out.println(x);
		
		x++;		//post-increment process --> add one to x and update its value
					//the new value of x is x+1
		System.out.println(x);
		
		//Let's check decrement --> subtracting one from the variable 
		int y = 10;
		System.out.println(y);
		
		System.out.println(y--);	//Display y first (y=10) then decrement it
									//The order of operation matter
									//for post-increment and decrement 
									//First do the operation, then increment or decrement 
									//For this case display the value of y (10)
									//Then, decrement y by 1 (y = 9)
		System.out.println(y);
		
		int z = 10;
		int w = z++;		//The order (1) Take the value of (z=10) and assign to w
							//			(2)	After that increment z by 1
		
		System.out.println(z);
		System.out.println(w);
		
		int var1 = 5;
		int var2;
		
		System.out.println(var1);
		
		var2 = var1--;
		//This is equivalent to the following:
		//1- var2 = var1; --> 5
		//2- var1 = var1 - 1; --> 4
		
		System.out.println(var1);
		System.out.println(var2);
		
		
		

	}

}
