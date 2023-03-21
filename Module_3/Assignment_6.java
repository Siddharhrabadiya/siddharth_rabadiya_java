package Module_3;
/*Display all the details of the emps who’s Comm. Is more than their Sal?*/
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Assignment_6 
{
	static final String DB_URL ="jdbc:mysql://localhost/Module_3";
	static final String USER ="root";
	static final String PASS ="";
	static final String QUERY = "select * from EmpTable where comm>sal";

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
				System.err.println(rs.getString("Ename"));
				System.out.println(rs.getString("Job"));
				System.out.println(rs.getInt("Mgr"));
				System.out.println(rs.getDate("Hiredate"));
				System.out.println(rs.getInt("Sal"));
				System.out.println(rs.getInt("Comm"));
				System.out.println(rs.getInt("Deptno"));
				System.out.println("-----------------------");
			}
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
