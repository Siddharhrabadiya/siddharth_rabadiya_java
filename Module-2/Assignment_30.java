package Module;

import java.util.Scanner;

public class Assignment_30 
{
	static int factorial(int no)
	{
		if(no == 0)
		{
			return 1;
		}
		return no*factorial(no-1);
		
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("eneter the any numbers");
		int no = sc.nextInt();
		System.out.println("Factorial is :"+factorial(no));
		
	}
}
