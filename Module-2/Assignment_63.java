package Module_2;

import java.util.ArrayList;
import java.util.Collections;

public class Assignment_63 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		
		System.out.println("Before swap : "+l);
		
		Collections.swap(l, 3, 4);
		System.out.println("After swap : "+l);
		
	}

}
