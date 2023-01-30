package Module_2;

import java.util.Scanner;

public class countinteger_7 
{
	/* Write a Java program that reads a positive integer and count the number of digits the number. */
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int d=1;
		
		System.out.println("Input an integer number less than ten bilion ");
		
		if(sc.hasNextLong())
		{
			long a = sc.nextLong();
			
			if(a >= 1000000000)
			{
				System.out.println("number is greater then 10000000000");
			}
			else
			{
				if(a>=10 && a<100)
				{
					d=2;
				}
				else if (a>=100 && a<1000) 
				{
					d=3;
				}
				else if (a>=1000 && a<10000) 
				{
					d=4;
				}
				else if (a>=10000 && a<100000) 
				{
					d=5;
				}
				else if (a>=100000 && a<1000000) 
				{
					d=6;
				}
				else if (a>=1000000 && a<1000000) 
				{
					d=7;
				}
				else if (a>=10000000 && a<10000000) 
				{
					d=8;
				}
				else if (a>=100000000 && a<100000000) 
				{
					d=9;
				}
				else if (a>=1000000000 && a<1000000000) 
				{
					d=10;
				}
					System.out.println("digits of number"+" "+d);
		}
	}
		else
		{
			System.out.println("Number is not an integer");
		}
}

}
