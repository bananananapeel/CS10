/*

	Program: ${SwitchSatement}.java          Date: ${May 5 2022}


	Author: Anjali Sanjay
	School: CHHS
	Course: Computer Science 10
	 

*/
package Module5Exercises;

import java.util.Scanner;

public class SwitchStatmentExercise 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a day of the week");
		
		int day = input.nextInt();
		
		switch(day)
		{
			case 1:
			System.out.println("Sunday");
			break;
			
			case 2:
			System.out.println("Monday");
			break;
			
		}
		
		int dayy = 4;
		switch(day)
		{
			case 1:
			System.out.println("Saturday");
			break;
			case 2:
			System.out.println("Sunday");
			break;
			default:
			System.out.println("Weekend");
		}
	}

}
