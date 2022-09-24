package java_programs;

import java.util.Scanner;

public class Ternary_operator
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Fiest number.");
		int First = sc.nextInt();
		System.out.println("Enter the Second number.");
		int Second =sc.nextInt();
		System.out.println("Enter the Third number.");
		int Third =sc.nextInt();
		
		int no =(First>Second) ? (First>Third ? First : Third):(Second>Third ? Second : Third);
		
		System.out.println("Maximum number is : "+no);
		
	}

}
