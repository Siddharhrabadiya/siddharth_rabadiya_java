package Module_2;

import java.util.ArrayList;
import java.util.Collections;


public class Assignment_52 
{
	public static void main(String[] args)
	{
		ArrayList<Integer> l = new ArrayList<>();
		
		l.add(24);
		l.add(1);
		l.add(98);
		l.add(45);
		l.add(56);
		l.add(22);
		l.add(78);
		l.add(66);
		System.out.println("Before sorting : "+l);
		Collections.sort(l, Collections.reverseOrder());
		 
		System.out.println("After sorting : "+l);
		
		
		
		
		
	}

}
