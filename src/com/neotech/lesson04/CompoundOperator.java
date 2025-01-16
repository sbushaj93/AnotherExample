package com.neotech.lesson04;

public class CompoundOperator {

	public static void main(String[] args) {

		// aka shorthand operator
		
		int num = 100; //we are creating a code word with java and that points to the value 100
		
		System.out.println(num);
		
		//reassigned the value
		num = 150;  //still the same code word, but now pointing to the value 150 
		
		System.out.println(num);
		
		num = num + 150; // we are adding, and reassigning (it adds 150 to the current value of num)
		System.out.println(num);
		
		
		//we have a shorter way to do this operation -- we call this compound/shorthand operator
		num += 50;  //num = num + 50 ---> +=
		System.out.println(num);
		
		//how can I do this: num = num - 100;
		num -= 100; //-=  --> means reduce and reassign
		
		System.out.println(num);
		
		num /= 5; //num = num / 5;
		System.out.println(num);
		
		num *= 6; // num = num * 6;
		System.out.println(num);
			//30 % 8 ---> 24 is the largest fully divisible number by 8 ---> remainder is 6
		// 300 % 8 --->  296/8 ---> 4
		num %= 8;
		System.out.println(num);
		
		//   			/ vs %
		//they are not used one instead of the other. 
		//they are two different operators that produce different results
		
		//ex: 10/3 ---> 3.33333		--> with this I get the division
		//	  10%3 -->  1
		
		
	}

}
