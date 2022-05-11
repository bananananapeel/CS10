/*

	Program: ${Assignment11}.java          Date: ${May 4 2022}


	Author: Anjali Sanjay
	School: CHHS
	Course: Computer Science 10
	 

*/
package Module5Assignments;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Assignment11 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.println("Enter any Three Digits: ");//prompts user for number
		
		int numbers = input.nextInt();//records input
		
		int firstD = numbers / 100;//calculates first digit
		
		int secondD = (numbers % 100)/10;//calculates second digit
		
		int thirdD = (numbers % 100)%10;//calculates third digit
		
		System.out.println("First: "+ firstD+" Second: "+ secondD+" Third:  "+ thirdD); //displays each digit
		
		int max = 0;
		int min = 0;
		
		
		if(secondD>firstD && thirdD>secondD && firstD<thirdD)//579
		{
			max = thirdD;//max of 579
			min = secondD;//min of 579
		}
		
		else if(firstD>secondD && thirdD<secondD && firstD>thirdD)//931
		{
			max = firstD;//max of 931
			min = thirdD;//min of 931
		}
		else if(firstD<secondD && secondD>thirdD && firstD<thirdD)//486
		{
			max = secondD;//max of 486
			min = firstD;//min of 486
		}	
		else if(secondD>firstD && secondD>thirdD && firstD>thirdD)//452
		{
			max = secondD;//max of 452
			min = thirdD;//min of 452
		}
		else if(thirdD>firstD && thirdD>secondD && secondD<thirdD)//536
		{
			max = thirdD;//max of 536
			min = secondD; //min of 536
			
		}	
		int sum = firstD + secondD + thirdD;//calculates sum
		int product = firstD * secondD * thirdD;//calculates product
		double average = ((double)(firstD + secondD + thirdD) / (double)3);//calculates average
		
			
		System.out.println("The Largest of the Three Digits is: "+ max);//displays max digit
		System.out.println("The Smallest of the Three Digits is: "+ min);//displays min digit
		System.out.println("The Sum of the Three Digits is: "+ sum);//displays sum
		System.out.println("The Product of the Three Digits is: "+ product);//displays product
		System.out.println("The Average of the Three Digits is: "+ df.format(average));//displays average
		
		
		
	}

}
/*
screen dump

Enter any Three Digits: 
579
First: 5 Second: 7 Third:  9
The Largest of the Three Digits is: 9
The Smallest of the Three Digits is: 7
The Sum of the Three Digits is: 21
The Product of the Three Digits is: 315
The Average of the Three Digits is: 7.00


*/