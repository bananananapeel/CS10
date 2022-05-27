/*

	Program: ${Assignment15}.java          Date: ${May 9 2022}


	Author: Anjali Sanjay
	School: CHHS
	Course: Computer Science 10
	 

*/
package Assignments;

import java.util.Scanner;

public class Assignment15 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int num1 = 1 + (int) (Math.random()*10);//random numbers are generated
		int num2 = 1 + (int) (Math.random()*10);
		
		System.out.println("What is "+ num1+" + "+ num2+"?");//asks user questions
		int rsp = input.nextInt();//records users answer
		
		int ans = num1 + num2;//computer solves question
		
		if (rsp == ans)//if answer is right this is displayed
		{
			System.out.println("You Got it Right!! Congrulations!!");
		}
		else  //if answer is wrong this gets displayed
		{
			System.out.println("Awh!! You Got it Wrong, the Answer Was: "+ ans);
		}
	
	}

}
/*
 screen dump
 
What is 7 + 5?
13
Awh!! You Got it Wrong, the Answer Was: 12
 
*/
