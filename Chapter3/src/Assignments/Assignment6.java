package Assignments;
import java.util.*;
public class Assignment6 
{
	/*

	Program: ${Assignment6}.java          Date: ${April 11 2022}


	Author: Anjali Sanjay
	School: CHHS
	Course: Computer Science 10
	 

	*/
	public static void main(String[] args) 
	{
		Scanner input = new Scanner (System.in);
		
		System.out.println("What is Your First Name?");
		String firstName = input.nextLine();
				
		System.out.println("What is Your Last Name?");
		String lastName = input.nextLine();
		
		System.out.println("What Grade are You in?");
		int grade = input.nextInt();
		input.nextLine();
		System.out.println("What School do You Go To?");
		String school = input.nextLine();
		
		System.out.println("What is Your Favourite Hobby?");
		String hobby = input.nextLine();
		
		System.out.print("Hello, your name is "+firstName +lastName + ", you are currently in grade "+grade +" at "+school +". Your favourite hobby is "+hobby +"." );
		
	}

}
/*
 Screen dump
 
 What is Your First Name?
anjali
What is Your Last Name?
sanjay
What Grade are You in?
10
What School do You Go To?
CHHS
What is Your Favourite Hobby?
baking
Hello, your name is anjalisanjay, you are currently in grade 10 at CHHS. Your favourite hobby is baking.
 
 */
