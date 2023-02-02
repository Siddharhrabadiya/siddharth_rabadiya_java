package Module_2;

import java.util.HashSet;
import java.util.Iterator;

public class Assignment_56 
{
	public static void main(String[] args) 
	{
		HashSet< String> h = new HashSet<>();
		
		h.add("raj");
		h.add("neel");
		h.add("sanjay");
		h.add("yash");
		h.add("dhaval");
		
		Iterator i = h.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	}

}
