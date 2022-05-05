/*

	Program: ${Assignment12}.java          Date: ${May 5 2022}


	Author: Anjali Sanjay
	School: CHHS
	Course: Computer Science 10
	 

*/
package Module5Assignments;

import java.util.Scanner;

public class Assignment12 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your school  Grade: ");
		
		int grade = input.nextInt();
		
		switch(grade)
		{
			case 1:
			{
				System.out.println("A+");
				break;
			}
			
			case 2:
			{
				System.out.println("A");
				break;
			}
			
			case 3:
			{
				System.out.println("B+");
				break;
			}
			
			case 4:
			{
				System.out.println("B");
				break;
			}
			
			case 5:
			{
				System.out.println("C+");
				break;
			}
			
			case 6:
			{
				System.out.println("C");
				break;
			}
			
			case 7:
			{
				System.out.println("D+");
				break;
			}
		}

	}

}
