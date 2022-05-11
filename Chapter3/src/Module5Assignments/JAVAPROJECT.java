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
		
		System.out.print("Are You Tall Enough but not Too Tall to Ride the Kingda Ka, the Tallest Rollercoaster in the World?!\r\n"
				+ "Enter Your Height Here in Centimeters to Find Out: ");
		double h = input.nextDouble();
		
		if(h > 137.16 && h < 195.58)
		{
			System.out.println("CONGRATS!!! You are the Right Height to be able to ride the Kingda Ka!");
		}
		else
		{
			
		}
	}

}
