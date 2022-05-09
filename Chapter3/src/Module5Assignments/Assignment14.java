/*

	Program: ${Assignment14}.java          Date: ${May 9 2022}


	Author: Anjali Sanjay
	School: CHHS
	Course: Computer Science 10
	 

*/
package Module5Assignments;

import java.util.Scanner;

public class Assignment14 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please Enter Your Age: ");
		int age = input.nextInt();
		
		if(age > 18)
		{
			System.out.println("Adult");
		}
		else if(age <= 5)
		{
			System.out.println("Toddler");
		}
		else if(age <= 10)
		{
			System.out.println("Child");
		}
		else if(age <= 12)
		{
			System.out.println("PreTeen");
		}
		else if(age > 12)
		{
			System.out.println("Teen");
		}
		
	}

}
/*
screen dump

Please Enter Your Age: 
11
PreTeen


*/