package Exercises;

import java.util.Scanner;

public class ClassDemo 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your full name: ");
		String fullName = input.nextLine();
		
		System.out.println("What grade are you in: ");
		int grade = input.nextInt(); 
		
		if(fullName.equalsIgnoreCase("Kitchen"))
		{
			if(grade == 10)	
			{
			System.out.println("You are in grade 10");
		}
		else
		{
			System.out.println("Sorry we are looking for grade 10s");
		}
		}
		System.out.println("You must be AP Tim Kitchen");
		}
		else
		{
			System.out.println("Sorry, we are looking for Tim");
		}
	}
}

