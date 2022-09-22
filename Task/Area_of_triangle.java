package java_programs;

import java.util.Scanner;

public class Area_of_triangle 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the height.");
		int height = sc.nextInt();
		System.out.println("Enter the base.");
		int base = sc.nextInt();
		System.out.println("Area of triangle.");
		System.out.println((height*base)/2);
	}
}
