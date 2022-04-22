package Assignments;
import java.util.Scanner;
public class EvenorOdd 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in); 
		
		System.out.print("Enter an Integer: ");
		int n1 = input.nextInt();
		int rem = n1%2;
		if(rem==1)
		{
			System.out.println("The integer "+n1 +" is odd.");
		}
		else
		{	
			System.out.println("The integer "+n1 +" is even");
		}
	}

}
