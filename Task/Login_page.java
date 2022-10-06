package java_programs;

import java.util.Scanner;

import javax.swing.text.PasswordView;

public class Login_page {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1) Sign Up");
		System.out.println("2) Sign In");
		
		int no = sc.nextInt();
		switch(no)
		{
		case 1:
			System.out.println("Enter the First name.");
			String Fname = sc.next();
			System.out.println("Enter the Last name.");
			String Lname = sc.next();
			System.out.println("Enter the City.");
			String City = sc.next();
			System.out.println("Enter the gender.");
			String Gender = sc.next();
			System.out.println("Enter the password");
			String Password = sc.next();
			
			System.out.println("Your Details are Saved.");
			
			System.out.println("if you wnt to login Please enter 3 and Exit 0.");
			
			Model m = new Model();
			m.setFirstname(Fname);
			m.setLastname(Lname);
			m.setCity(City);
			m.setGender(Gender);
			m.setPass(Password);
			 
			 int number = sc.nextInt(); 
			 switch(number)
			 {
			 case 3:
				 System.out.println("Enter the password");
				 int pass = sc.nextInt();
				
				 if(Password.equals("1234"))
				 {
					 System.out.println(m.getFirstname());
					 System.out.println(m.getLastname());
					 System.out.println(m.getCity());
					 System.out.println(m.getGender());
				 }
				 else
				 {
					 System.out.println("Your password is Wrong.");
				 }
				 break;
			 case 0:
				 System.out.println("Exit.");
				 break;
			 }
			 break;
		case 2:
				System.out.println("Enter the username.");
				String uname = sc.next();
				System.out.println("Enter the password.");
				String pass = sc.next();
				if(pass.equals("1234"))
				{
					System.out.println("Siddharth");
					System.out.println("Rabadiya");
					System.out.println("Male");
					System.out.println("Rajkot");
				}
				else if(pass.equals("5678"))
				{
					System.out.println("Johnson");
					System.out.println("Sojitra");
					System.out.println("Male");
					System.out.println("Ahemdabad");
				}
				else
				{
					System.out.println("Passsword is Wrong.");
				}
				break;
		}
		
	}

}
