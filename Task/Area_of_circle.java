package java_programs;

import java.util.Scanner;

public class Area_of_circle 
{
	public static void main(String[] args) 
	{
		Scanner a = new Scanner(System.in);
		
		System.out.println("Enter the radious :");
		int radious = a.nextInt();
		
		System.out.println("arae of circle.");
		System.out.println(3.14*radious*radious);
	}
}
