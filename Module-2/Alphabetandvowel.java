package Module_2;

import java.util.Scanner;
 
/* Write a Java program that takes the user to provide a single character from the 
alphabet. Print Vowel or Consonant, depending on the user input. If the user input 
is not a letter (between a and z or A and Z), or is a string of length > 1, print an error 
message. */

public class Alphabetandvowel 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the any vowel and alphabet.");
		String  value = sc.next();
		
		if( value.length() > 1)
		{
			System.out.println("error");
		}
		else if(value.equals("a")|| value.equals("e")  || value.equals("i") || value.equals("o")  || value.equals("u")  || value.equals("A")  || value.equals("E")  || value.equals("I")  || value.equals("O")  || value.equals("U") )
		{
			System.out.println("Vowel.");
		}
		else if(!(value.charAt(0) >= 65 && value.charAt(0) <= 90 || value.charAt(0) >= 97 && value.charAt(0) <= 122))
		{
			System.out.println("Error");
		}
		else
		{
			System.out.println("Alphabet.");
		}
		
	}

}
