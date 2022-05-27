package Assignments;

import java.util.Scanner;

public class Assignment7 
{
	/*

	Program: ${Assignment7}.java          Date: ${April 12 2022}


	Author: Anjali Sanjay
	School: CHHS
	Course: Computer Science 10
	 

	*/
	public static void main(String[] args) 
	{
		Scanner userinput = new Scanner (System.in);
		
		System.out.println("Enter the change you have: "); //asks how much change user has
		
		int change = userinput.nextInt();
		
		int quarters = change % 25; //calculate quarters in change
		
		int dimes = ((change / 25)/10);  //calculate dimes
		
		int nickles = ((change % 25)%10)/5; //calculate nickels
		
		System.out.println("The change you provided is: "+ change); //displays change
		
		System.out.println("Quarters: "+ quarters); //displays change
		
		System.out.println("Dimes: "+ dimes); //displays change
		
		System.out.println("Nickles: "+ nickles); //displays change

	}

}
/*
screen dump
Enter the change you have: 
555
The change you provided is: 555
Quarters: 5
Dimes: 2
Nickles: 1
*/