package Module_3;

/* List the details of the emps in asc order of the Dptnos and desc of Jobs? */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Assignment_2 
{
	static final String DB_URL ="jdbc:mysql://localhost/Module_3";
	static final String USER ="root";
	static final String PASS ="";
	static final String QUERY = "SELECT * FROM EmpTable ORDER BY Job DESC,Deptno ASC";
	
	
	
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
				System.out.println("Dept no : "+rs.getString("Deptno"));
				System.out.println("Job : "+rs.getString("Job"));
			}
			
		} catch (Exception e) 
		{
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
