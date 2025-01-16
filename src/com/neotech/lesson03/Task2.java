package com.neotech.lesson03;

public class Task2 {

	public static void main(String[] args) {
		
		/*
		 Create a new class named Task2
			Write a program to print the area and perimeter of a rectangle with 
			width = 5 and height = 8. Your program should say:
			"The perimeter of a rectangle with width ___ and height ___ is equal to ___ and 
			the area is ___"
			
			Area = width * height
			Perimeter = 2 * (width + height)
		 
		 */
		int w, h, a, p;
		
		w = 5;
		h = 8;
		
		a = w * h;
		System.out.println("area --> "  + a);
		
		p = 2 * (w + h);
		System.out.println("perimeter --> " + p);
		
		System.out.println("The perimeter of a rectangle with width " + 
		w + " and height " + h + " is equal to " + p + " and the area is " + a + "!");
		
	}
	
}
