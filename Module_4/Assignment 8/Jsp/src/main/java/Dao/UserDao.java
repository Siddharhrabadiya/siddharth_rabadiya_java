package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;


import model.Model;


public class UserDao 
{
	public static Connection getconnect()
	{
		Connection con = null;
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jspcrud","root","");
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
		
	}

	public static int savedata(Model m)
	{
		int status = 0;
		
		Connection con = UserDao.getconnect();
		String sql = "insert into info (fname,lname,email,phone,gender,password) values (?,?,?,?,?,?)";
		
		
		  try
		  {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, m.getFname());
			ps.setString(2, m.getLname());
			ps.setString(3, m.getEmail());
			ps.setString(4, m.getPhone());
			ps.setString(5, m.getGender());
			ps.setString(6, m.getPassword());
			
			
			status = ps.executeUpdate();
		  } 
		 catch (Exception e) 
		  {
			// TODO Auto-generated catch block
			e.printStackTrace();
		  }
		
		return status;
		
	}
	public static List<Model>viewdata()
	{
		List<Model>list = new ArrayList<Model>();
		
		Connection con =UserDao.getconnect();
	
		try 
		{
			String sql = "select * from info";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet set = ps.executeQuery();
			
			while(set.next())
			{
				
				Model m =new Model();
				m.setId(set.getInt(1));
				m.setFname(set.getString(2));
				m.setLname(set.getString(3));
				m.setEmail(set.getString(4));
				m.setPhone(set.getString(5));
				m.setGender(set.getString(6));
				m.setPassword(set.getString(7));
				list.add(m);
			}
			
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}

	public static int deletedata(int id)
	{
		int status =0;
		
		Connection con = UserDao.getconnect();
		
		String sql = "delete from info where id =?";
		try 
		{
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setInt(1, id);
			
			status = ps.executeUpdate();
			
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return status;
	}
	
	public static Model getemployeebyid(int id)
	{
		Connection con = UserDao.getconnect();
		Model m =new Model();
		
		try
		{
			PreparedStatement ps =con.prepareStatement("select * from info where id=?");
			ps.setInt(1, id);
			
			ResultSet set = ps.executeQuery();
			
			if(set.next())
			{
				int id2 = set.getInt(1);
				String fname = set.getString(2);
				String lname = set.getString(3);
				String email = set.getString(4);
				String phone = set.getString(5);
				String gender = set.getString(6);
				String password = set.getString(7);
				
				m.setId(id2);
				m.setFname(fname);
				m.setLname(lname);
				m.setEmail(email);
				m.setPhone(phone);
				m.setGender(gender);
				m.setPassword(password);
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	
		
		
		return m;
	}
	
	public static int updatedata(Model m)
	{
		int status =0;
		
		Connection con = UserDao.getconnect();
		
		String sql = "update info set fname=?,lname=?, email=?, phone=?, gender=?, password=? where id =?";
		try 
		{
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setString(1,m.getFname());
			ps.setString(2,m.getLname());
			ps.setString(3,m.getEmail());
			ps.setString(4,m.getPhone());
			ps.setString(5,m.getGender());
			ps.setString(6,m.getPassword());
			ps.setInt(7,m.getId());
			
			status = ps.executeUpdate();
			
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return status;
	}
	
}
