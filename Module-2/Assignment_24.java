package Module;

class rectangle
{
	int length;
	int breadth;
	
	public rectangle(int l, int b) {
		// TODO Auto-generated constructor stub
		 length = l;
		 breadth = b;
	}
	void rectang_area()
	{
		System.out.println(length*breadth);
	}
	void perimeter()
	{
		System.out.println(2*(length+breadth));
	}
}
class square extends rectangle
{
	public square(int s)
	{
		super (s,s);
	}
}

public class Assignment_24 
{
public static void main(String[] args)
{
	rectangle r = new rectangle(2,5);
	square s = new square(5);
	r.rectang_area();
	r.perimeter();
	s.rectang_area();
	s.perimeter();
	
}
}
