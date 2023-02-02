package Module_2;

import java.util.ArrayList;
import java.util.HashSet;

public class Assignment_66 
{
	public static void main(String[] args) 
	{
		HashSet<String> h = new HashSet<>();
		
		h.add("raj");
		h.add("neel");
		h.add("sanjay");
		h.add("yash");
		
		System.out.println("Hash set : "+h);
		
		ArrayList<String> l = new ArrayList<>(h);
		
		System.out.println("Arraylist is : "+l);
		
	}

}
