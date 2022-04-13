package Assignments;

import java.util.Scanner;

public class Assignment8 
{
	/*

	Program: ${Assignment6}.java          Date: ${April 12 2022}


	Author: Anjali Sanjay
	School: CHHS
	Course: Computer Science 10
	 

	*/
	public static void main(String[] args) 
	{
		Scanner input = new Scanner (System.in);
		System.out.println("Enter a three digit number: ");
		
		int digits = input.nextInt(); 
		
		int firstD = digits / 100;
		
		int secondD = (digits % 100) /10;
		
		int thirdD = ((digits % 100) %10);
		
		System.out.println("The hundreds-place digit is: "+ firstD);
		
		System.out.println("The tens-place digit is: "+ secondD);
		
		System.out.println("The ones-place digit is: "+ thirdD);
		

	}

}

