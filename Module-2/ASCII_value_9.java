package Module;

import java.util.Scanner;

public class ASCII_value_9 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Character");
		char a = sc.next().charAt(0);
		
		int value = a;
		
		System.out.println("ASCII value of character is :"+value);
		
	}

}
