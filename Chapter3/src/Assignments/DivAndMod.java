package Assignments;

import java.util.Scanner;

public class DivAndMod 
{
	/*

	Program: ${DivAndMod}.java          Date: ${April 13 2022}


	Author: Anjali Sanjay
	School: CHHS
	Course: Computer Science 10
	 

	*/
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an Integer: ");//asks questions
		int x = input.nextInt();//user inputs number
		
		System.out.println("Enter a Second Integer: ");//displays question
		int y = input.nextInt();//user inputs number
		
		int div = x / y;//division of number
		int r = x % y;//modulus of number
		int div2 = y / x;//division of number
		int r2 = y % x;//modulus of number
		
		System.out.println(""
				+ x +"/"+ y +"="+ div +"\r\n"
				+ x +"%"+ y +"="+ r +"\r\n"
				+ y +"/"+ x +"="+ div2 +"\r\n"
				+ y +"%"+ x +"="+ r2 +"\r\n");//displays solved questions
		

	}

}
/*
 screen dump  
 Enter an Integer: 
52
Enter a Second Integer: 
2
52/2=26
52%2=0
2/52=0
2%52=2
 
 */
