package com.neotech.lesson04;

public class IfCondition {

	public static void main(String[] args) {

		//selective execution - depending on a condition a certain code block will get executed
		
		//structure of ---- if condition -----
		
	//	if (condition)
	//	{
	//		//execute these codes here, only if the condition is trueee
	//	}
		
		
		
		
		int num = 150;
		
		if (num > 200)
		{
			System.out.println("Today is Tuesday!!!");
		}
		
		System.out.println("Will this be printed???"); //YES, it is outside of the IF body
		
		
		
		
		int num2 = 2000;
		
		if (num2 < 3000)
		{
			System.out.println("Yes you can withdaw " + num2 + " dollars!");
		}
		
		System.out.println("End of code!"); //we can see the code finished running
		
		
		
		
		

		
		
	}

}
