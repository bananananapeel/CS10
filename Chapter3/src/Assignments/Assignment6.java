package Assignments;
import java.util.*;
public class Assignment6 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner (System.in);
		
		System.out.println("What is Your First Name?");
		String firstName = input.nextLine();
				
		System.out.println("What is Your Last Name?");
		String lastName = input.nextLine();
		
		System.out.println("What Grade are You in?");
		int grade = input.nextInt();
		input.nextLine();
		System.out.println("What School do You Go To?");
		String school = input.nextLine();
		
		System.out.println("What is Your Favourite Hobby?");
		String hobby = input.nextLine();
		
		System.out.print("Hello, your name is "+firstName +lastName + ", you are currently in grade "+grade +" at "+school +". Your favourite hobby is"+hobby +"." );
		
	}

}
