package com.neotech.lesson04;

public class PrimitiveCasting {

	public static void main(String[] args) {

		//type casting
		
		//byte   --> 	short 	--> 	int		-->		long  	--> 	float 	--> 	double 		
		
		
		
		
		double d1 = 3.7;		//a double is assigned to a double type
		//no casting happened
		System.out.println(d1);

		double d2 = 5; //casting happened - an int was assigned to a double type
		System.out.println(d2);
		
		//compiler error: Type mismatch: cannot convert from double to int
		//int num = 5.5;
		
		
		
		// widening --> implicit casting --> automatic casting
		
		float num = 4; //this casting happens automatically, because the value we are casting
					//can easily fit in the bigger data type.
		
		System.out.println(num);
		
		
		// narrowing --> explicit casting --> manual casting
		
		//if I do this, I am telling Java: I am sure, I want this to be stored in an int
		int num2 = (int) 6.5;
		System.out.println(num2);
		
		
		//Can you think of a situation that I can do this action and not lose anything???
		int num3 = (int) 6.0; //here it would make sense since I dont lose anything
		
		
		
		//you definitely are loosing data!!!!
		//an example that you 
		byte b1 = (byte) 4579;
		System.out.println(b1);
		
		//int has 32 bits: 0000000000000000000000000000000000001
		//byte has 8 bits: 								00000001
		
		int num4 = 50;
		byte b2 = (byte) num4;
		System.out.println(b2);
		
		
		
		
		//another narrowing example
		long L1 = 17L;
		int num5 = (int) L1;  //am I losing anything ??? NO
		System.out.println(num5);
		
		long L2 = 4353464574576586787L;
		int num6 = (int) L2;
		System.out.println(num6);
		
		//another widening example
		int num7 = 250;
		float f1 = (float) num7; //automatic casting. I can add (float), but it is not necessary
		float f2 = num7;
		System.out.println(f1);
		System.out.println(f2);
		
		
	}

}
