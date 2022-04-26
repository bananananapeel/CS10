package Assignments;
import java.util.Scanner;
public class EvenorOdd 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in); 
		
		System.out.print("Enter an Integer: ");//asks to enter question
		int n1 = input.nextInt();//user inputs number
		int rem = n1%2;
		if(rem==1)//does math to see if number is even or odd
		{
			System.out.println("The integer "+n1 +" is odd.");//the number is displayed as odd
		}
		else
		{	
			System.out.println("The integer "+n1 +" is even");//the number is displayed as even
		}
	}

}
