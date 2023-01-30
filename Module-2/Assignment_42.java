package Module_2;
class sender
{
	public void send(String msg)
	{
		System.out.println("sending "+msg);
		
		try 
		{
			Thread.sleep(2000);
		} 
		
		catch (InterruptedException e) 
		{
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println(msg+" sent");
	}
}
class threadsend extends Thread
{
	sender sender;
	String msg;
	
	public threadsend(sender sender,String msg)
	{
		this.sender =sender;
		this.msg=msg;
	}
	public void run()
	{
		synchronized (sender)
		{
			sender.send(msg);
		}
	}
}
public class Assignment_42 
{
	public static void main(String[] args) 
	{
		sender s = new sender();
		threadsend t1 = new threadsend(s, "welcome");
		t1.start();
		
	}

}
