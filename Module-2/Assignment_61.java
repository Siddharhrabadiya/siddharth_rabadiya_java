package Module_2;

import java.util.ArrayList;
import java.util.List;

public class Assignment_61 
{
	public static void main(String[] args) 
	{
		ArrayList<String> l = new ArrayList<>();
		l.add("Vadodra");
		l.add("Gandhinagar");
		l.add("Bhuj");
		l.add("Amreli");
		l.add("rajkot");
		
		
		System.out.println("list : "+l);
		List<String> l1 =l.subList(0, 3);
		System.out.println("Extract list is :"+l1);
		
	}

}
