package com.neotech.lesson07;

import java.util.Scanner;

public class RecapScanner {

	public static void main(String[] args) {
		
		//Formula to declare a variable (Primitive Data Types)
		
		//DataType name/identifier assignment Op (=)		value  ; 
		//int a	= 5;
		
		//ClassName		name/identifier		assignment OP (=)	NEW		ClassName();

		//Import: CTRL + SHIFT + O
		Scanner scanner = new Scanner(System.in);
		/*
		
		System.out.println("Enter a sentence: ");
		String next1 = scanner.next(); //read the input until the next space and save it as a String
		System.out.println(next1);
		
		String next2 = scanner.next();
		System.out.println(next2);
		
		
		String next3 = scanner.nextLine(); // it reads the input until the \n (new line)
		System.out.println(next3);
		
		//difference between next() and nextLine():
			// - next() will read from the starting position until it sees a space
			// - nextLine() will read from the starting position until the end of line (eol)

		 
		int x = 2;
		String a = "2";
		System.out.println(x + 5);  //addition
		System.out.println(a + 5475675); //concatenation
		
		
		System.out.println("Enter your age: " );
		//String age = scanner.next(); //whenever I use next() it will read it as a String
		int age = scanner.nextInt();
		System.out.println(age);
		
		System.out.println("Enter the current year: ");
		int year = scanner.nextInt();
		System.out.println(year);
		
		System.out.println("Enter the salary: ");
		double salary = scanner.nextDouble();
		System.out.println(salary);
		
		System.out.println("Is it snowing?");
		boolean isSnowing = scanner.nextBoolean();
		System.out.println(isSnowing);
		
		System.out.println("Enter your gender: ");
		char g = scanner.next().charAt(0); //scanner.next() --> Male, charAt(0) --> get the first letter
		System.out.println(g);
		*/
		
		System.out.println("Enter you name, age, salary, and gender: ");
		String name = scanner.next();
		int age = scanner.nextInt();
		double salary = scanner.nextDouble();
		char gender = scanner.next().charAt(0);
		
		System.out.println("You info is: " + name + " " + age + " " + salary + " " + gender + "!");
		
		//InputMismatchException - you said you will enter a int but you passed a string (or something else).

		
	}

}
