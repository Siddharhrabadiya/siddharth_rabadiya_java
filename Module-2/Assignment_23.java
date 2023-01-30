package Module;

 class member
{
	int age,mobileno;
	String name,address;
	int salary;
	
	void salary()
	{
		System.out.println(salary);
	}
}
class function extends member
{
	function(String name,String address,int age,int mobileno,int salary)
	{
		this.name = name;
		this.address =address;
		this.age = age;
		this.mobileno = mobileno;
		this.salary = salary;
		
	}
}
public class Assignment_23 
{
	public static void main(String[] args)
	{
		function f = new function("siddharth", "Rajkot", 21, 376181, 40000);
		
		f.salary();
		
	}

}
