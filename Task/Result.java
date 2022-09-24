package java_programs;

import java.util.Scanner;

public class Result 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first subject mark1 : ");
		int mark1 = sc.nextInt();
		System.out.println("Enter the second subject mark2 : ");
		int mark2 = sc.nextInt();
		System.out.println("Enter the third subject mark3 : ");
		int mark3 = sc.nextInt();
		System.out.println("Enter the fourth subject mark4 : ");
		int mark4 = sc.nextInt();
		System.out.println("Enter the fifth subject mark5 : ");
		int mark5 = sc.nextInt();
		int m=mark1+mark2+mark3+mark4+mark5;
		int a=500;
		System.out.println("Total marks : "+" "+m);
		float percentage =(m*100)/a;
		System.out.println("Percentage : "+" "+percentage);
		if(percentage>75)
		{
			System.out.println("Distinction");
		}
		if(percentage>60 && percentage<=75)
		{
			System.out.println("First class.");
		}
		if(percentage>50 && percentage<=60)
		{
			System.out.println("Second class.");
		}
		if(percentage>35 && percentage<=50)
		{
			System.out.println("Pass class");
		}
		else
		{
				System.out.println("Failed");
		}
		
		
	}
	
	

}
