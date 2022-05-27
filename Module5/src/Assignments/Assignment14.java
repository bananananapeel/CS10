/*

	Program: ${Assignment14}.java          Date: ${May 9 2022}


	Author: Anjali Sanjay
	School: CHHS
	Course: Computer Science 10
	 

*/
package Assignments;

import java.util.Scanner;

public class Assignment14 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please Enter Your Age: ");//asks users age
		int age = input.nextInt();//records answer
		
		if(age > 18)//if age is 18+ this is displayed
		{
			System.out.println("Adult");
		}
		else if(age <= 5)//if age is 5 and below this is displayed
		{
			System.out.println("Toddler");
		}
		else if(age <= 10)//if age is 10 and below this is displayed
		{
			System.out.println("Child");
		}
		else if(age <= 12)//if age is 12 and below this is displayed
		{
			System.out.println("PreTeen");
		}
		else if(age > 12)//if age is above 12 this is displayed
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