package Module_2;

import java.util.Scanner;

public class Sumandaverage_4 
{
	/* Write a program in Java to input 5 numbers from keyboard and find their sum and average using for loop.*/
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.println("enter the five numbers.");
		for(int i =1;i<=5;i++)
		{
			int no = sc.nextInt();
			 sum +=no;
		}
		
		System.out.println("Sum of five number = "+sum);
		System.out.println("Average of five number = "+sum/5);
		
	}

}
