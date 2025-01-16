package com.neotech.lesson03;

public class ArithmeticOperators {

	public static void main(String[] args) {
		
		//declaring
		int num1, num2; //both of those are integers
		
		//initialize them
		num1 = 24;
		num2 = 5;
		

		int add = num1 + num2; //addition
		int sub = num1 - num2; //subtraction
		int mult = num1 * num2; //multiplication
		int div = num1 / num2; //division, lost the decimal part
		
		System.out.println("add --> " + add);
		System.out.println("subtract --> " + sub);
		System.out.println("multiple --> " + mult);
		System.out.println("divide --> " + div);
		
		
		double d1, d2;
		d1 = 24;
		d2 = 5;
		
		double division = d1/d2;
		System.out.println("double division --> "  + division);
		
		//dividing two integers, the result is 4
		//storing 4 in a double type ---> 4.0
		double intResult = num1/num2;  //num1/num2 ---> 4 --> storing 4 in a double makes it 4.0
		System.out.println("intResult --> " + intResult);
	}
	
}
