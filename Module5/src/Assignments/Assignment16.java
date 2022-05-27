/*

	Program: ${Assignment16}.java          Date: ${May 10 2022}


	Author: Anjali Sanjay
	School: CHHS
	Course: Computer Science 10
	 

*/
package Assignments;

import java.util.Scanner;

public class Assignment16 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number between 1 and 20: ");//user gets asked to input number
		int pnum = input.nextInt();//answer gets recorded
		
		int comnum = 1 + (int) (Math.random()*20);//random number
		
		if(comnum == pnum)//if players response is the same as the computers this gets displayed
		{
			System.out.println("Computer's Number is: "+ comnum);
			System.out.println("Player's Number is: "+ pnum);
			System.out.println("Good Job!!! You got it Right!");	
		}
		else//if both numbers aren't the same this gets displayed
		{
			System.out.println("Computer's Number is: "+ comnum);
			System.out.println("Player's Number is: "+ pnum);
			System.out.println("Better luck next time.");
		}

	}

}
/*
screen dump

Enter a number between 1 and 20: 
6
Computer's Number is: 0
Player's Number is: 6
Better luck next time.

*/