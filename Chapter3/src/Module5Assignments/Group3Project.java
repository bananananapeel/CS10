package Module5Assignments;

import java.util.Scanner;

public class Group3Project 
{

	public static void main(String[] args) 
	{
		Scanner userinput = new Scanner(System.in);
		
		System.out.println("Enter a Multiplication Statement for the Computer to Solve: "); 
	
		int dig = userinput.nextInt();
		
		int dig1 = dig / 100;
		
				
				
		int dig2 = (dig % 100) / 10;
		
		
		int dig3 = dig % 10;

	}

}
