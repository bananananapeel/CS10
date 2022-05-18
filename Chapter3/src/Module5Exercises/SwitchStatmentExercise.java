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
		
		System.out.println("Please enter a day of the week");//prompts user for a day of the week 
		
		int day = input.nextInt();//records answer
		
		switch(day)
		{
			case 1://if user inputs 1 then this displays
			System.out.println("Sunday");
			break;
			
			case 2://if user inputs 2 this displays
			System.out.println("Monday");
			break;
			
		}
		
		int dayy = 4;
		switch(dayy)
		{
			case 1://if user inputs 1 then this displays
			System.out.println("Saturday");
			break;
			case 2://if user inputs 2 this displays
			System.out.println("Sunday");
			break;
			default://this is if they didn't enter either number
			System.out.println("Weekend");
		}
	}

}
