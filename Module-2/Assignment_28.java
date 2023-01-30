package Module;

abstract class bank
{
	public abstract void getbalance();
}
class bank_A extends bank
{

	@Override
	public void getbalance() {
		// TODO Auto-generated method stub
		System.out.println("$100");
	}
	
}
class bank_B extends bank
{

	@Override
	public void getbalance() {
		// TODO Auto-generated method stub
		System.out.println("$150");
	}
	
}
class bank_C extends bank
{

	@Override
	public void getbalance() {
		// TODO Auto-generated method stub
		System.out.println("$200");
	}
	
}
public class Assignment_28 
{
	
	public static void main(String[] args) 
	{
		bank_A b1 = new bank_A();
		b1.getbalance();
		
		bank_B b2 = new bank_B();
		b2.getbalance();
		
		bank_C b3 = new bank_C();
		b3.getbalance();
		
		
	}

}
