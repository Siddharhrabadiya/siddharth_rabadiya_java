package java_programs;

import java.util.Scanner;

public class Simple_calculator 
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
				
				System.out.println("Enter the number1 : ");
		   		int number1 = sc.nextInt();
		   		System.out.println("Enter the number2 : ");
		   		int number2 =sc.nextInt();
		   		System.out.println("addition is.");
		   		System.out.println(number1+number2);
		   		System.out.println("Subtraction is.");
		   		System.out.println(number1-number2);
		   		System.out.println("Multiplication is.");
		   		System.out.println(number1*number2);
		   		System.out.println("Divison is.");
		   		System.out.println(number1/number2);
	}
}
