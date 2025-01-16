package com.neotech.lesson08;

public class PreAndPostIncrement {

	public static void main(String[] args) {
		
		//++ increment --> add 1 to the variable 
		//-- decrement --> subtract 1 from the variable 
		
		int x;
		int y = 20;
		
		x = y++;
		//post-increment 
		//(1) x = y (y = 20)
		//(2) y = y + 1 --> 21
		
		System.out.println(x);
		System.out.println(y);
		
		int a; 
		int b = 20;
		
		a = ++b;
		//pre-increment 
		//First increment, then do the operation
				//(1) b = b + 1 --> 21
				//(2) a = b --> 21
		
		int c;
		int d = 5;
		
		System.out.println(--d);
		//(1) decrement --> d = d - 1 = 4
		//(2) do the operation  --> display 
		
		System.out.println(d);
				
		
		//At this point, d = 4
		c = --d; 
		//(1) d = d - 1 = 3
		//(2) c = d = 3
		
		System.out.println(c);
		System.out.println(d);
				
	}

}
