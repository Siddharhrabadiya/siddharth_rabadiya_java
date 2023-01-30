package Module;

public class Class_program_20 
{
	public static void main(String[] args) 
	{
		Class_program_20 obj = new Class_program_20();
		obj.print('a', 10);
		obj.print(10, 'a');
	}
		
		void print(int n,char c)
		{
			System.out.println("integer is :"+n+"\t"+"character is : "+c);
		}
		void print(char c,int n)
		{
			System.out.println("character is : "+c+"\t"+"integer is :"+n);
		}
		
		
	

}
