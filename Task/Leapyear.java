package java_programs;

import java.util.Scanner;

public class Leapyear
{
	
			 public static void main(String[] args)
	{
				 Scanner sc = new Scanner(System.in);
				 
		System.out.println("Enter the  year number.");
		int number = sc.nextInt();
		 int year=number%4;
		if(year==0)
		{
			System.out.println("Year is Leap Year.");
		}
		else
		{
			System.out.println("Year is not Leap Year");
		}
	}
}
