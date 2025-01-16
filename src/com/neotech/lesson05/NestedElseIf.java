package com.neotech.lesson05;

public class NestedElseIf {
	
//	Write a Java program to check if a student has done the
//	Quiz. If the student did the Quiz, then check the score and
//	give the following evaluations:
//	◆ If the score is 90 or greater, print “A, Great job!”.
//	◆ If the score is 80 or greater but less than 90, print “B, Well done!”.
//	◆ If the score is 70 or greater but less than 80, print “C, You passed!”.
//	◆ Otherwise, print “F, You failed”
//	If the student did not do the Quiz, print "You did not do the quiz, so you failed!"


	public static void main(String[] args) {
		
		//Let's arrange out selections
		//What are the possibilities?
		
			//--> The student did the quiz
				//-->if the score is >= 90 --> "A, Great job!"
				//-->else if the score is >= 80 --> "B, Well done!"
				//else if the score is >= 70 --> "C, You passed!"
				//else --> "F, You failed!"
			//--> else (The student did NOT do the quiz) --> "You did not do the quiz, so you failed!"
		
		boolean isDone = false;
		double score = 60;
		
		if (isDone)
		{
			if (score >= 90)
			{
				System.out.println("A, Great job!");
			}
			else if (score >= 80)
			{
				System.out.println("B, Well done!");
			}
			else if (score >= 70)
			{
				System.out.println("C, You passed!");
			}
			else 
			{
				System.out.println("F, you failed!");
			}
		}
		else
		{
			System.out.println("You did not do the quiz, so you failed!");
		}
	

	}

}
