package Module_2;

import java.util.ArrayList;
import java.util.Collections;

public class Assignment_54 
{
	public static void main(String[] args) 
	{
		ArrayList<String> l = new ArrayList<>();
		l.add("gujarat");
		l.add("rajasthan");
		l.add("mumbai");
		l.add("kashmir");
		l.add("chennai");
		System.out.println("LIST : "+l);
		Collections.shuffle(l);
		System.out.println("shuffle array : "+l);
	}

}
