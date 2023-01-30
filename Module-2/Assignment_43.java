package Module_2;
public class Assignment_43 implements Runnable
{

	@Override
	public void run() 
	{
		// TODO Auto-generated method stub
		
		System.out.println("running.....");
	}
	public static void main(String[] args) 
	{
		Thread t1 =new Thread(new Assignment_43());
		t1.start();
		t1.start();
		
	}

}
