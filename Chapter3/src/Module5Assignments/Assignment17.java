/*

	Program: ${Assignment17}.java          Date: ${May 10 2022}


	Author: Anjali Sanjay
	School: CHHS
	Course: Computer Science 10
	 

*/
package Module5Assignments;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Assignment17 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		DecimalFormat df = new DecimalFormat("0.00");//allows decimals to the hundreths place be kept
	
		System.out.println("Please Enter your GPA: ");//prompts user for their gpa
		double gpa = input.nextDouble();//stores users gpa
		
		while(gpa != -1)//check if gpa doesn't equal to -1
		{
		
		while(gpa == -1)//if user enters -1 they exit the game
		{
			System.out.println("You Have Exited the Game");
			gpa++;
		}
		
		if(gpa >= 3.8)//if gpa is above or equal to 3.8 they get displayed this
		{
			System.out.println("summa cum laude");
			
		}
		
		else if(gpa > 3.65)//if gpa is above to 3.65 they get displayed this
		{
			System.out.println("magna cum laude");
		}
		
		else if(gpa > 3.5)//if gpa is above to 3.5 they get displayed this
		{
			System.out.println("cum laude");
		}
		else if (gpa <= 3.5 && gpa > 0)//if gpa is less than 3.5 and more than 0 they get displayed this
		{
			System.out.println("Sorry, you did not qualify for an honors distinction");
		}
		
		System.out.println("Please Enter Another GPA or Enter -1 to Exit the Game");//prompts user to enter another gpa or exit the game
		gpa = input.nextDouble();
		
		}
		
		System.out.println("Thank you for using our program, have a great day!");//displays this
		
	}

}
/*
screen dump

Please Enter your GPA: 
4.00
summa cum laude
Please Enter Another GPA or Enter -1 to Exit the Game
-1
Thank you for using our program, have a great day!



*/
