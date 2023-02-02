package Module_2;

import java.util.ArrayList;
import java.util.Collections;

public class Assignment_53 
{
	public static void main(String[] args) 
	{
		ArrayList<String> l = new ArrayList<>();
		
		l.add("Rajkot");
		l.add("Bhavnagar");
		l.add("Surat");
		l.add("Ahmedavad");
		
		System.out.println("First list : "+l);
		
		ArrayList<String> l1 = new ArrayList<>();
		l1.add("Vadodra");
		l1.add("Gandhinagar");
		l1.add("Bhuj");
		l1.add("Amreli");
		
		System.out.println("Second list : "+l1);
		
		  Collections.copy(l,l1);
		  
		  System.out.println("First list : "+l);
		
		  System.out.println("Second list : "+l1);
	}
	
	
	

}
