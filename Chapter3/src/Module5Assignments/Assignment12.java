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
	       
        System.out.println("Enter Your Grade Percentage: ");//prompts user for their grade
       
        int grade = input.nextInt();//records grade
       
        if (grade >= 90)
        {
            System.out.println("A+");//if grade is above or equal 90 they get displayed this
        }
       
        else if (grade >= 80)
        {
            System.out.println("A");//if grade is above or equal to 80 they get displayed this
        }
       
        else if (grade >= 75)
        {
            System.out.println("B+");//if grade is above or equal to 75 they get displayed this
        }
       
        else if (grade >= 70)
        {
            System.out.println("B");//if grade is above or equal to 70 they get displayed this
        }
       
        else if (grade >= 65)
        {
            System.out.println("C+");//if grade is above or equal to 65 they get displayed this
        }
       
        else if (grade >= 60)
        {
            System.out.println("C");//if grade is above or equal to 60 they get displayed this
        }
       
        else if (grade >= 55)
        {
            System.out.println("D+");//if grade is above or equal to 55 they get displayed this
        }
       
        else if (grade >= 50)
        {
            System.out.println("D");//if grade is above or equal to 50 they get displayed this
        }
       
        else if (grade < 50)
        {
            System.out.println("F");//if grade is less than 50 they get displayed this
        }
       
        System.out.println("Your Corresponding Letter Grade is: "+ grade);//displays the letter grade they got
     }
}
/*
Screen Dump

Enter Your Grade Percentage: 
47
F
Your Corresponding Letter Grade is: 47

*/