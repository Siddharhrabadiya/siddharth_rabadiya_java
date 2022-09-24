package java_programs;

import java.util.Scanner;

public class Calculator 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Enter the First number.");
		int First = sc.nextInt();
		System.out.println("enter the Second number.");
		int Second = sc.nextInt();
		System.out.println("1)Addition.\n2)Subtraction.\n3)Multiplication.\n4)Division. ");
		
		System.out.println("Enter the number.");
		int number = sc.nextInt();
		
		switch(number)
		{
		case 1:
			System.out.println("Addition is : "+(First+Second));
			break;
		case 2:
			System.out.println("Subtraction is : "+(First-Second));
			break;
		case 3:
			System.out.println("Multiplication is : "+First*Second);
			break;
		case 4:
			System.out.println("Division is : "+First/Second);
			break;
			default:
				System.out.println("Enter the valid choice.");
		}
		
		
	}

}
