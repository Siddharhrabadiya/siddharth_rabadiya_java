package Module;


public class Divisble_numbers_12
{
	public static void main(String[] args) 
	{
		System.out.println("divide by 3");
		for(int i=0;i<=100;i++)
		{
			if(i%3==0)
			{
				System.out.print(i +",");
			}
		}
		
		System.out.println("\nDivide by 5");
		for(int j=0;j<=100;j++)
		{
			if(j%5==0)
			{
				System.out.print(j+",");
			}
		}
		
		System.out.println("\ndivide by 3 & 5");
		for(int k=0;k<=100;k++)
		{
			if(k%3==0 && k%5==0)
			{
				System.out.print(k +",");
			}
		}

	}

}
