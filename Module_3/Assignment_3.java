package Module_3;

/* Display all the unique job groups in the descending order? */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Assignment_3 
{
	static final String DB_URL ="jdbc:mysql://localhost/Module_3";
	static final String USER ="root";
	static final String PASS ="";
	static final String QUERY = "SELECT * FROM `EmpTable` WHERE Hiredate<('1981-1-1')";
	
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
				System.out.println(rs.getString("Job"));
				System.out.println(rs.getInt("Mgr"));
				System.out.println(rs.getDate("Hiredate"));
				System.out.println(rs.getInt("Sal"));
				System.out.println(rs.getInt("Deptno"));
				
			}
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
