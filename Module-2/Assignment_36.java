package Module_2;

import java.util.Scanner;

public class Assignment_36 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		try
		{
			System.out.println("Enter the first number.");
			int no1 = sc.nextInt();
			System.out.println("Enter the second number.");
			int no2 = sc.nextInt();
			
			int division = no1/no2;
			System.out.println(division);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		
	}

}
