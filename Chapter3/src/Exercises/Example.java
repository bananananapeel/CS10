package Exercises;
import java.util.*;
public class Example 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in); 

		System.out.println("Hello, What is your name?");
		String fullName =  input.nextLine();
		
		System.out.println("How old are you?");
		int age = input.nextInt();
		
		System.out.print("Your name is: "+fullName + " and your age is: "+ age);
		
	}

}

/* Screen Dump

Your name is: Mr. Kitchen and your age is 66

 */