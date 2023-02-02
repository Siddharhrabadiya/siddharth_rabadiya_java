package Module_2;


import java.util.HashSet;

public class Assignment_65 
{ public static void main(String[] args)
{
    HashSet<String> s = new HashSet<String>();
    s.add("1");
    s.add("13");
    s.add("27");
    s.add("87");
    s.add("19");

    System.out.println("Hash Set Contains :" + s);
    String arry[] = new String[s.size()];
    
  
    s.toArray(arry);

    for (String n : arry)
        System.out.println(n);
}
}
