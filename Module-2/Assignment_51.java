package Module_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Assignment_51 
{
	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);
		ArrayList<String> l = new ArrayList<>();
		
		l.add("red");
		l.add("Orange");
		l.add("Blue");
		l.add("White");
		l.add("Black");
		l.add("yellow");
		System.out.println(l);
		
		System.out.println("enter the element");
		String a = sc.next();
		
				
		if(l.contains(a))
		{
			System.out.println("search element is : "+a);
		}
		else
		{
			System.out.println("not found");
		}
		
		
	}

}
