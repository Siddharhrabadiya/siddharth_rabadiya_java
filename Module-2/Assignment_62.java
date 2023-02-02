package Module_2;

import java.util.ArrayList;


public class Assignment_62 
{
	public static void main(String[] args) 
	{
		
		ArrayList<String> l1 = new ArrayList<>();
		l1.add("rajkot");
		l1.add("bhuj");
		l1.add("kutch");
		l1.add("Surat");
		
		ArrayList<String> l2 = new ArrayList<>();
		l2.add("rajkot");
		l2.add("bhuj");
		l2.add("kutch");
		l2.add("Surat");
		
		boolean list =l1.equals(l2);
		
		System.out.println(list);
	}
}
