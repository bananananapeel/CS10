/*

	Program: ${Assignment16}.java          Date: ${May 10 2022}


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
		
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.println("Please Enter your GPA: ");
		double gpa = input.nextDouble();
		
		while(gpa == -1)
		{
			System.out.println("You Have Exited the Game");
			break;
		}
		
		if(gpa >= 3.8)
		{
			System.out.println("summa cum laude");
			
		}
		
		else if(gpa > 3.65)
		{
			System.out.println("magna cum laude");
		}
		
		else if(gpa > 3.5)
		{
			System.out.println("cum laude");
		}
		else
		{
			System.out.println("Sorry, you did not qualify for an honors distinction");
		}
		
		System.out.println("Would you like to continue or quit?");
		double gpa1 = input.nextDouble();
		
		while(gpa1 == -1)
		{
			System.out.println("You Have Exited the Game");
		}
		
		if(gpa1 >= 3.8)
		{
			System.out.println("summa cum laude");
			
		}
		
		else if(gpa1 > 3.65)
		{
			System.out.println("magna cum laude");
		}
		
		else if(gpa1 > 3.5)
		{
			System.out.println("cum laude");
		}
		else
		{
			System.out.println("Sorry, you did not qualify for an honors distinction");
		}
		
		System.out.println("Thank you for using our program, have a great day!");
	}

}
