package Module;

import java.util.Scanner;

class complex
{
	int real ,imaginary;
	
 complex(int tempreal ,int tempimaginary)
	{
		real = tempreal;
		imaginary = tempimaginary;
	}
  public complex() {
	// TODO Auto-generated constructor stub
}
complex addition(complex c1,complex c2)
{
	  complex temp = new complex();
	  
	  temp.real = c1.real +c2.real;
	  temp.imaginary = c1.imaginary+c2.imaginary;
	  
	return temp;
	
}
  
  complex subtraction(complex c1,complex c2)
  {
	  complex temp = new complex();
	  
	  temp.real = c1.real - c2.real;
	  temp.imaginary = c1.imaginary - c2.imaginary;
	  return temp;
  }
  
  void complexNumber()
  {
	  System.out.println("Complex Number : "+ real +" + "+imaginary+"i");
  }
}
 
 
public class Assignment_26 
{
	public static void main(String[] args) 
	
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the First two complex number");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("Enter the second two complex number");
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		complex c1 =new complex(a,b);
		c1.complexNumber();
		
		complex c2 =new complex(c,d);
		c2.complexNumber();
		
		complex c3 =new complex();
		c3 = c3.addition(c1, c2);
		
		System.out.println("sum of complex number.");
		c3.complexNumber();
		
		
		c3 = c3.subtraction(c1, c2);
		
		System.out.println("subtration of complex number.");
		c3.complexNumber();
		
	}

}
