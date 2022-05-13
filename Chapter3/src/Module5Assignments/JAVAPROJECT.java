/*

	Program: ${JAVAPROJECT}.java          Date: ${May 11 2022}


	Author: Anjali Sanjay
	School: CHHS
	Course: Computer Science 10
	 

*/
package Module5Assignments;

import java.text.DecimalFormat;
import java.util.Scanner;

public class JAVAPROJECT 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.println("Please Enter Your Name Fellow Thrill Seeker!");//prompts user for name
		String name = input.nextLine();//stores input
		
		System.out.println("Welcome "+ name+ " to the Tallest Rollercoaster in the World!\r\n"
						 + "Are You Tall Enough but not Too Tall to Ride the Kingda Ka?!\r\n"
						 + "Enter Your Height Here in Centimeters to Find Out: ");//prompts user for height
		double h = input.nextDouble();//stores height
		
		if(h > 137.16 && h < 195.58)//if it is in requirements display this
		{
			System.out.print("CONGRATS!!! You are the Right Height to be able to ride the Kingda Ka!");
		}
		else if(h> 195.58)//if it is above this number it displays this
		{
			System.out.print("Sorry, You are too Tall to Ride the Kingda Ka :(");
		}
		else//if it is below the requirements it displays this
		{
			System.out.print("Sorry, You are too Short to Ride the Kingda Ka :(");
		}
	}

}
/*
screen dump

Please Enter Your Name Fellow Thrill Seeker!
Anjali
Welcome Anjali to the Tallest Rollercoaster in the World!
Are You Tall Enough but not Too Tall to Ride the Kingda Ka?!
Enter Your Height Here in Centimeters to Find Out: 
170
CONGRATS!!! You are the Right Height to be able to ride the Kingda Ka!

*/