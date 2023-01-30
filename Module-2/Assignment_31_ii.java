package Module_2;

import java.util.Scanner;

public class Assignment_31_ii 
{
	public static void main(String[] args) 
	{
		 Scanner sc = new Scanner(System.in);
		 
		System.out.println("Enter the marks");
		float marks = sc.nextFloat();
		
		if(marks>=91 && marks<100)
		{
			System.out.println("Grade is A");
		}
		else if(marks>=81 && marks<=90)
		{
			System.out.println("B");
		}
		else if(marks>=71 && marks<=80)
		{
			System.out.println("B");
		}
		else if(marks>=61 && marks<70)
		{
			System.out.println("C");
		}
		else if(marks>=51 && marks<60)
		{
			System.out.println("D");
		}
		else if(marks>=41 && marks<50)
		{
			System.out.println("B");
		}
		else if (marks<=40)
		{
			System.out.println("Fail");
		}
			
	}

}
