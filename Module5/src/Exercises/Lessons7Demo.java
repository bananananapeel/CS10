/*

	Program: ${SwitchSatement}.java          Date: ${May 5 2022}


	Author: Anjali Sanjay
	School: CHHS
	Course: Computer Science 10
	 

*/
package Exercises;

import java.util.Scanner;

public class Lessons7Demo 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a day of the week");
		
		int day = input.nextInt();
		
		switch(day)
		{
			case 1:
			
			{
			System.out.println("Sunday");
			break;
			}
			
			case 2:
			{
			System.out.println("Monday");
			break;
			}
			
			case 3:
			{
			System.out.println("Tuesday");
			break;
			}
			
			case 4:
			{
			System.out.println("Wednesday");
			break;
			}
			
			case 5:
			{
			System.out.println("Thursday");
			break;
			}
			
			case 6:
			{
			System.out.println("Friday");
			break;
			}
			
			case 7:
			{
			System.out.println("Saturday");
			break;
			}
			
			default:
			{
				System.out.println("Please enter an integer that is in between 1-9");
			}
		}

	}

}
