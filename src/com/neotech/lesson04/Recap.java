package com.neotech.lesson04;

public class Recap {

	public static void main(String[] args) {

		//arithmetic operators
		
		//PEMDAS --> Parenthesis, Exp, Multiplication, Division, Addition, Subtraction
		
		
		
		int num1 = 5 + 5 + 5;
		System.out.println(num1);

		int num2 = 5 + 5 * 5;
		System.out.println(num2);
		
		int num3 = (5 + 5) * 5;
		System.out.println(num3);
		
		//we can directly print into console as well
		System.out.println( 5 * 5 + 5/5);
		
		
		int number1 = 15; 
		int number2 = 2;
		
		//if we are using int to divide, then the decimal will be lost
		int div = number1/number2;
		System.out.println("div -> " + div);
		
		
		
		//12 % 2  ---> 12 is fully divisible by 2, so 0 remainder
		//15 % 2  ---> largest number in 15 fully divisible by 2 --> 14 --> remainder 15-14
		
		int rem = number1 % number2;
		System.out.println("rem --> " + rem);
		
		System.out.println("Addition vs Concatenation");
		
		
		int a = 10; 
		int b = 10;
		
		String x = "Java";
		String y = "Tuesday";
		
		System.out.println(x + " " + y); //Java Tuesday
		System.out.println(x + y + a); //JavaTuesday10 (String + String + int)--> String
		
		System.out.println(x + a + b); //Java1010	(String + int --> String + int --> String)
		System.out.println(x + (a + b)); //Java20 (int + int) --> int + String --> String
		
		// "" --> is an empty String
		System.out.println("" + a + b); //1010
		//first step:  "" + 10  --> 10 (String)
		//second step: 10 (String) + 10 ---> 1010
		
		System.out.println(a + b); //20
		System.out.println(a + b + x + y);//
		//a (int) + b (int) ===> 20
		//20 (int) + x (String) ===> 20Java (String)
		//20Java  + y (String)	===> 20JavaTuesday (String)
		
		
		System.out.println(x + y + a * b); //JavaTuesday100
		System.out.println(x + y + a + b); //JavaTuesday1010
		
		//Compiler Error
		//System.out.println(a * x);// 10 * Tuesday
		
		
		
		//Soooooo
		
		//String + int -----> String (Concatenation)
		//int + String -----> String (Concatenation)
		//int + int --------> int	 (Addition)
		//String * int -----> not allowed

		
		
		// int + int + int + int + String ----> String - all addition will happen then concatenation with String
		// String + int + int + int + int ----> String - all concatenations
		
		
		String emptyStr = ""; //It is a string, but its empty
		String spaceStr = " "; //It is a string, but it has only a space, still NOT empty!
		
		
		
	}

}
