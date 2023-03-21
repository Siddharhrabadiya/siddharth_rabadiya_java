package Module_3;

/*List the emps who joined before 1981.*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Assignment_4 
{
	static final String DB_URL ="jdbc:mysql://localhost/Module_3";
	static final String USER ="root";
	static final String PASS ="";
	static final String QUERY = "select empno ,ename ,sal,sal/30,12*sal annsal from EmpTable order by annsal asc";

	public static void main(String[] args) 
	{
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =DriverManager.getConnection(DB_URL,USER,PASS);
			Statement st =con.createStatement();
			ResultSet rs =st.executeQuery(QUERY);
			
			while(rs.next())
			{
				System.out.println(rs.getInt("Empno"));
				System.out.println(rs.getString("Ename"));
				System.out.println(rs.getInt("Sal"));
				System.out.println("---------------------");
				
			}
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}