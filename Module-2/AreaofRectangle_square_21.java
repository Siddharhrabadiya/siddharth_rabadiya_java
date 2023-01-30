package Module;

public class AreaofRectangle_square_21 
{
		void area_rectangle(int l,int w)
		{
			
			System.out.println("Area of rectangle : "+l*w);
		}
		void area_square(int a)
		{
			System.out.println("Area of square : "+a*a);
		}
	
	public static void main(String[] args) 
	{
		
		AreaofRectangle_square_21 ob = new AreaofRectangle_square_21();
		
		ob.area_rectangle(12, 20);
		ob.area_square(20);
	}

}
