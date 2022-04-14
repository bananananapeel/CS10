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
		
		System.out.println("Enter an Integer: ");
		int x = input.nextInt();
		
		System.out.println("Enter a Second Integer: ");
		int y = input.nextInt();
		
		int div = x / y;
		int r = x % y;
		int div2 = y / x;
		int r2 = y % x;
		
		System.out.println(""
				+ x +"/"+ y +"="+ div +"\r\n"
				+ x +"%"+ y +"="+ r +"\r\n"
				+ y +"/"+ x +"="+ div2 +"\r\n"
				+ y +"%"+ x +"="+ r2 +"\r\n");
		

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
