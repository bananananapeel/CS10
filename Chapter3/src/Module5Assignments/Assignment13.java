/*

	Program: ${Assignment13}.java          Date: ${May 9 2022}


	Author: Anjali Sanjay
	School: CHHS
	Course: Computer Science 10
	 

*/
package Module5Assignments;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Assignment13 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.println("Enter the Number of Copies to be Printed: ");
		int copy = input.nextInt();
		
		
		
		if (copy <= 99)
		{
			double price = 0.30;
			System.out.println("Price Per Copy is: $"+ df.format(price));
			double total = price*copy;
			System.out.println("Total Cost is: $"+ total);
		}
		else if (copy <= 499)
		{
			double price = 0.28;
			System.out.println("Price Per Copy is: $"+ df.format(price));
			double total = price*copy;
			System.out.println("Total Cost is: $"+ total);
		}
		else if (copy <= 749)
		{
			double price = 0.27;
			System.out.println("Price Per Copy is: $"+ df.format(price));
			double total = price*copy;
			System.out.println("Total Cost is: $"+ total);
		}
		else if (copy <= 1000)
		{
			double price = 0.26;
			System.out.println("Price Per Copy is: $"+ df.format(price));
			double total = price*copy;
			System.out.println("Total Cost is: $"+ total);
		}
		else if (copy < 1000)
		{
			double price = 0.25;
			System.out.println("Price Per Copy is: $"+ df.format(price));
			double total = price*copy;
			System.out.println("Total Cost is: $"+ total);
		}

	}

}
/*
 screen dump
 
 Enter the Number of Copies to be Printed: 
450
Price Per Copy is: $0.28
Total Cost is: $126.00000000000001
 
*/
