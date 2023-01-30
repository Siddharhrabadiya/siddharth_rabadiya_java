package Module_2;

import java.util.Scanner;
/*  Write a Java program that takes a year from user and print whether that year is a leap year or not */
public class Leapyear_3a 
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
