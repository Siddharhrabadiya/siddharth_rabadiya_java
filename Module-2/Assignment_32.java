package Module_2;

class Shape{
	  public void shape()
	  {
	    System.out.println("This is shape");
	  }
	}
	class Rectangle extends Shape
	{
	  public void rectangle()
	  {
	    System.out.println("This is rectangular shape");
	  }
	}

	
	class Circle extends Shape
	{
	  public void circle()
	  {
	    System.out.println("This is circular shape");
	  }
	}

	
	class Square extends Rectangle
	{
	  public void square()
	  {
	    System.out.println("Square is a rectangle");
	  }
	}

public class Assignment_32 
{
	public static void main(String[] args)
	{
	    Square s = new Square();  
	    s.shape();    
	    s.rectangle();   
	  }
}
