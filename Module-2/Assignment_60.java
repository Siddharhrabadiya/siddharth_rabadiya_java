package Module_2;

import java.util.ArrayList;
import java.util.Collections;

public class Assignment_60 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> l = new ArrayList<>();
		l.add(23);
		l.add(1);
		l.add(67);
		l.add(89);
		l.add(55);
		l.add(3);
		l.add(0);
		l.add(8);
		System.out.println("List :"+l);
		Collections.reverse(l);
		System.out.println("Reverse elements in list : "+l);
		
	}

}
