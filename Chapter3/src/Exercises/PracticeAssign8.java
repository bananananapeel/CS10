/*
	Program: JavaIf...Else.java          Date: April 22th 


	Author: Anjali Sanjay 
	School: CHHS
	Course: Computer Science 10
*/
package Exercises;

public class PracticeAssign8 
{

	public static void main(String[] args) 
	{
		int x = 50;
		int y = 10;
		if (x > y) 
		 {
			System.out.println("Hello World");
		 }
		
		int b = 50;
		int a = 50;
		if (b == a) 
		 {
			System.out.println("Hello World");
		 }
		
		int c = 50;
		int d = 50;
		if (c == d) 
		 {
			System.out.println("Hello World");
		 }
		else
		{
			System.out.println("No");
		}
		
		int e = 50;
		int f = 50;
		if (e == f)
		 {
			System.out.println("1");
		 }
		else if (x > y)
		{
			System.out.println("2");
		}
		else
		{
			System.out.println("3");
		}
		int time = 20;
		String result = (time < 18)? "Good day.":"Good evening.";
		System.out.println(result);
	}

}
/*
 screen dump
 
Hello World
Hello World
Hello World
1
Good evening.
 */
