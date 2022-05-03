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
		
		System.out.println("First: "+ firstD+" Second: "+ secondD+" Third:  "+ thirdD);
		
		int max = 0;
		int min = 0;
		
		
		if(secondD>firstD && thirdD>secondD)//85
		{
			max = thirdD;
			min = secondD;
			//579
		}
		else if(firstD>secondD && thirdD>secondD)//58
		{
			max = secondD;
			min = firstD;
		}
		else
		{
			min = thirdD;
		}	
		if(secondD>firstD && secondD<thirdD)
		{
			max = secondD;
		}
		else if(thirdD>firstD && thirdD>secondD)
		{
			max = thirdD;
		}	
		else 
		{
			max = firstD; 
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