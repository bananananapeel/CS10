/*

	Program: ${Assignment11}.java          Date: ${April 27 2022}


	Author: Anjali Sanjay
	School: CHHS
	Course: Computer Science 10
	 

*/
package Module5Assignments;

import java.util.Scanner;

public class Assignment11 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter any Three Digits: ");
		
		int numbers = input.nextInt();
		
		int firstD = numbers / 10;
		
		int secondD = numbers % 10;
		
		
		
		int max = 0;
		int min = 0;
		
		if(firstD > secondD)//85
		{
			max = firstD;
			min = secondD;
			
			
			
		}
		else//58
		{
			max = secondD;
			min = firstD;
			
		
		}	
		System.out.println("Maximum: "+ max +" Minmum:"+ min );
		
		//579
		//18:43 in bongo video
	}

}
/*
screen dump

*/