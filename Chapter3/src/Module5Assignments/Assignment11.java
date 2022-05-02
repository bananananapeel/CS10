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
		
		int firstD = numbers / 100;
		
		int secondD = (numbers % 100)/10;
		
		int thirdD = (numbers % 100)%10;
		
		//System.out.println("First: "+ firstD+" Second: "+ secondD+" Third:  "+ thirdD);
		
		int max = 0;
		int min = 0;
		
		/*
		if(firstD > secondD)//85
		{
			max = firstD;
			min = secondD;
			//579
			
			
		}
		else//58
		{
			max = secondD;
			min = firstD;
			
		
		}
		*/	
		System.out.println("Maximum: "+ max +" Minmum: "+ min );
		
		if(secondD > firstD && thirdD > secondD && firstD < thirdD)
		{
			max = thirdD;
			min = firstD;
		}
		
	}

}
/*
screen dump

*/