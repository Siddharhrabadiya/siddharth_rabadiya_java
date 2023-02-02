package Module_2;

import java.util.ArrayList;

public class Assignment_64 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		
		System.out.println("List 1 : "+l);
		ArrayList<Integer> l1 = new ArrayList<>();
		l1.add(60);
		l1.add(70);
		l1.add(80);
		l1.add(90);
		l1.add(100);
		
		System.out.println("List 2 : "+l1);
		
		ArrayList<Integer> list = new ArrayList<>();
		list.addAll(l);
		list.addAll(l1);
		System.out.println("New List : "+list);
		
		
	}

}
