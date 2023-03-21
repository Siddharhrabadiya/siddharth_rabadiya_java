package Module_3;

/*Select unique job from EMP table.*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Assignment_1 
{
	static final String DB_URL ="jdbc:mysql://localhost/Module_3";
	static final String USER ="root";
	static final String PASS ="";
	static final String QUERY = "select * from EmpTable";
	
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
				System.out.println("Job : "+rs.getString("Job"));
			}
			
		} 
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
