package Module_2;

import java.util.HashSet;

public class Assignment_71 
{
	public static void main(String[] args) 
	{
     HashSet<String> h = new HashSet<>();
		
		h.add("raj");
		h.add("neel");
		h.add("sanjay");
		h.add("yash");
		h.add("shyam");
		
		System.out.println("First Hash set : "+h);
		
		HashSet<String> h1 = new HashSet<>();
		
		h1.add("raj");
		h1.add("neel");
		h1.add("om");
		h1.add("jeel");
		h1.add("john");
		
		System.out.println("First Hash set : "+h1);
		h.retainAll(h1);
		System.out.println("retain elements : "+h);
	}

}
