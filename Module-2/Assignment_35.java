package Module_2;

public class Assignment_35 
{
	public static void main(String[] args)
	{
		try 
		{
			try
			{
				int no = 10/0;
			}
			catch(ArithmeticException e)
			{
				System.out.println(e);
			}
			try
			{
				int a[] = new int[5];
				a[5]=30/0;
			}
			catch(ArrayIndexOutOfBoundsException e1)
			{
				System.out.println(e1);
			}
		}
		catch(Exception e2)
		{
			System.out.println(e2);
		}
		
	}
	

}
