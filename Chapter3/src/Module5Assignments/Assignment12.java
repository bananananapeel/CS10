/*

	Program: ${Assignment12}.java          Date: ${May 5 2022}


	Author: Anjali Sanjay
	School: CHHS
	Course: Computer Science 10
	 

*/
package Module5Assignments;

import java.util.Scanner;

public class Assignment12 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
	       
        System.out.println("Enter Your Grade Percentage: ");
       
        int grade = input.nextInt();
       
        if (grade >= 90)
        {
            System.out.println("A+");
        }
       
        else if (grade >= 80)
        {
            System.out.println("A");
        }
       
        else if (grade >= 75)
        {
            System.out.println("B+");
        }
       
        else if (grade >= 70)
        {
            System.out.println("B");
        }
       
        else if (grade >= 65)
        {
            System.out.println("C+");
        }
       
        else if (grade >= 60)
        {
            System.out.println("C");
        }
       
        else if (grade >= 55)
        {
            System.out.println("D+");
        }
       
        else if (grade >= 50)
        {
            System.out.println("D");
        }
       
        else if (grade < 50)
        {
            System.out.println("F");
        }
       
        System.out.println("Your Corresponding Letter Grade is: "+ grade);
     }
}
/*
Screen Dump

Enter Your Grade Percentage: 
47
F
Your Corresponding Letter Grade is: 47

*/