package Module_3;

/* List the emps who are either ‘CLERK’ or ‘ANALYST’ in the Desc order.*/
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Assignment_7 
{
	static final String DB_URL ="jdbc:mysql://localhost/Module_3";
	static final String USER ="root";
	static final String PASS ="";
	static final String QUERY = "select * from EmpTable where Job='clerk' or Job='analyst' order by Job desc";

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
				System.out.println(rs.getString("Ename"));
				System.out.println(rs.getString("Job"));
				System.out.println("---------------------------");
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
