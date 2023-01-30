package Module;
class a
{
	void a()
	{
	System.out.println("This is a parent class");
	}
}
class b extends a
{
	void b()
	{
		System.out.println("this is child class");
	}
}
public class inheritance_22 
{
	
	public static void main(String[] args) 
	{
		b B = new b();
		B.a();
		B.b();
		
	}

}
