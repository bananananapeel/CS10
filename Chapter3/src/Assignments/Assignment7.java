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
		
		System.out.println("Enter the change you have: ");
		
		int change = userinput.nextInt();
		
		int quarters = change % 25;
		
		int dimes = ((change / 25)/10); 
		
		int nickles = ((change % 25)%10)/5;
		
		System.out.println("The change you provided is: "+ change);
		
		System.out.println("Quarters: "+ quarters);
		
		System.out.println("Dimes: "+ dimes);
		
		System.out.println("Nickles: "+ nickles);

	}

}
