package Assignments;

import java.util.Scanner;

public class PizzaCost 
{
	/*

	Program: ${PizzaCost}.java          Date: ${April 6 2022}


	Author: Anjali Sanjay
	School: CHHS
	Course: Computer Science 10
	 

	*/
	public static void main(String[] args) 
	{
	    Scanner myObj = new Scanner(System.in);  
	    System.out.println("Enter the Diameter of the Pizza in Whole Inches");
	    int size = myObj.nextInt();
	    		
	    double cost = (size * size * 0.05) + 0.75 + 1.00;
	    
	    System.out.println("It costs $ " + cost); 
	}

}

/* Screen Dump

Enter the Diameter of the Pizza in Whole Inches
10
It costs $ 6.75


 */