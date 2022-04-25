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
		System.out.println("Enter a three digit number: "); //display question
		
		int digits = input.nextInt(); //user input numbers
		
		int firstD = digits / 100; //first digit
		
		int secondD = (digits % 100) /10; //second digit
		
		int thirdD = ((digits % 100) %10); //third digit
		
		System.out.println("The hundreds-place digit is: "+ firstD); //display digit
		
		System.out.println("The tens-place digit is: "+ secondD); //display digit
		
		System.out.println("The ones-place digit is: "+ thirdD); //display digit
		

	}

}
/*
 screen dump
 Enter a three digit number: 
123
The hundreds-place digit is: 1
The tens-place digit is: 2
The ones-place digit is: 3

*/
