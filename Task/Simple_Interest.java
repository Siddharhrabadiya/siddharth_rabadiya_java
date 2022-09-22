package java_programs;

import java.util.Scanner;

public class Simple_Interest 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the balance :");
		int balance = sc.nextInt();
		System.out.println("Enter the rate :");
		int rate = sc.nextInt();
		System.out.println("Enter the time :");
		int time = sc.nextInt();
		System.out.println("Simple Interest is :");
		System.out.println(balance*(1+(rate*time)));
	}
}
