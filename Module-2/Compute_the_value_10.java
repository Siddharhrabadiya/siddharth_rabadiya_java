package Module;

import java.util.Scanner;

public class Compute_the_value_10 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int no = sc.nextInt();
		String n = String.valueOf(no);
		
		System.out.println(n+" + "+n+n+ " + "+n+n+n);
	}

}
