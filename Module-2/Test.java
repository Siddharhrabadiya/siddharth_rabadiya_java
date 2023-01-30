import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Test implements ActionListener
{
	JFrame frame1;
	JButton b1,b2,b3,b4;
	String name;
	
	

	public Test() 
	{
		frame1 = new JFrame();
		
		b1 = new JButton("Insert");
		b1.addActionListener(this);
		
		b2 = new JButton("Update");
		
		b3 = new JButton("View");
		
		b4 = new JButton("Delete");
		
		frame1.add(b1);
		frame1.add(b2);	
		frame1.add(b3);
		frame1.add(b4);
		frame1.setLayout(new FlowLayout());
		frame1.setVisible(true);
		frame1.setSize(500, 500);
		
		
	}
	public static void main(String[] args) 
	{
		new Test();
		
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		alloperations a = new alloperations();
		
		// TODO Auto-generated method stub
		if(e.getSource()==b1)
		{
			a.insertdata();
		}
		if(e.getSource()==b2)
		{
			a.viewdata();
		}
		if(e.getSource()==b3)
		{
			a.deletedata();
		}
		if(e.getSource()==b4)
		{
			a.updatedata();
		}
	}

}
class alloperations
{
	JFrame insertframe,deleteframe,updateframe;
	JTextField tf1,tf2,tf3;
	JButton b5,b6,b7,b8;
	JPanel jp1,jp2;
	
	public void insertdata()
	{
		insertframe = new JFrame();
		
		tf1 = new  JTextField(20);
		
		tf2 = new JTextField(20);
		
		b5 = new JButton("Add");
		b5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String name = tf1.getText().toString();
				String surname = tf2.getText().toString();
				
				String host = "jdbc:mysql://localhost:3306/";
				String db ="detail";
				String url = host+db;
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection(url,"root","");
					
					String sql = "Insert into details values(null,'"+name+"','"+surname+"')";
					
					Statement s = con.createStatement();
					
					int status = s.executeUpdate(sql);
					
					if (status>0)
					{
				
						insertframe.setVisible(false);
					}
					else
					{
						System.out.println("Error");
					}
					
					
				} catch (Exception e1) 
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
		
		
		insertframe.add(tf1);
		insertframe.add(tf2);
		insertframe.add(b5);
		insertframe.setLayout(new FlowLayout());
		insertframe.setVisible(true);
		insertframe.setSize(500,500);
	}
	public void viewdata()
	{
		String name = tf1.getText().toString();
		String surname = tf2.getText().toString();
		
		String host = "jdbc:mysql://localhost:3306/";
		String db ="detail";
		String url = host+db;
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,"root","");
			String sql = "select * from details";
			
			Statement s = con.createStatement();
			ResultSet set = s.executeQuery(sql);
			System.out.println("ID NAME SURNAME");
			
			while (set.next()) 
			{
				int id =set.getInt(1);
				name = set.getString(2);
				surname = set.getString(3);
				
				System.out.println(id+""+name+""+surname);
	
			}
			
			
		} catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
public void deletedata()
{
	deleteframe = new JFrame();
	
	tf3 = new JTextField(15);
	
	b6 = new JButton();
	b6.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			// TODO Auto-generated method stub

			String host="jdbc:mysql://localhost:3306/";
			String db="details";
			String url =host+db;
			
			String id2 = tf3.getText().toString();
			try 
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con= DriverManager.getConnection(url,"root","");
				
				String sql ="delete from details where id = '"+id2+"'";
						
				Statement s =con.createStatement();
				
				int delete =s.executeUpdate(sql);
				
				if(delete>0)
				{
					deleteframe.setVisible(false);
				}
				else
				{
					System.out.println("error");
				}
			} catch (Exception e1) 
			{
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
	});
	
	deleteframe.add(tf3);
	deleteframe.add(b6);
	deleteframe.setLayout(new FlowLayout());
	deleteframe.setVisible(true);
	deleteframe.setSize(500,500);
	
}
public void updatedata()
{
	updateframe = new JFrame();
	
	tf3 = new JTextField(15);
	b7 = new JButton();
	b7.addActionListener(new ActionListener() 
	{
		
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			// TODO Auto-generated method stub
			String host="jdbc:mysql://localhost:3306/";
			String db="details";
			String url =host+db;
			
			try 
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con= DriverManager.getConnection(url,"root","");
				
				String id = tf3.getText().toString();
				int id2 = Integer.parseInt(id);
				
				String sql = "select * from details where id ='"+id2+"'";
				
				Statement s=con.createStatement();
				ResultSet set =s.executeQuery(sql);
				
				if(set.next())
				{
					int id3 =set.getInt(1);
					String name =set.getString(2);
					String surname =set.getString(3);
					
					jp2.setVisible(true);
					jp1.setVisible(false);
					
					tf1.setText(name);
					tf2.setText(surname);
					
					b8.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							String name = tf1.getText().toString();
							String surname =tf2.getText().toString();
							
							String host="jdbc:mysql://localhost:3306/";
							String db="details";
							String url =host+db;
							
							try 
							{
								Class.forName("com.mysql.jdbc.Driver");
								Connection con= DriverManager.getConnection(url,"root","");
								
								String sql="Update info set name = '"+name+"' , surname ='"+surname+"' where id='"+id3+"'";
								
								Statement s =con.createStatement();
								
								int status = s.executeUpdate(sql);
								
								if(status>0)
								{
									updateframe.setVisible(false);
								}
								else
								{
									System.out.println("Errror");
								}
								
								
							} 
							catch (Exception e1)
							{
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							
						}
					});
				}
			} 
			catch (Exception e1) 
			{
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		
		}
		
	});
	
	jp1 = new JPanel();
	jp2 = new JPanel();
	
	tf1 = new JTextField(20);
	tf2 = new JTextField(20);
	b8 = new JButton("Update");
	
	jp2.add(tf1);
	jp2.add(tf2);
	jp2.add(b8);
	jp1.add(tf3);
	jp1.add(b7);
	jp1.add(jp2);
	jp2.setVisible(false);
	updateframe.add(jp1);
	updateframe.add(jp2);
	updateframe.setVisible(true);
	updateframe.setLayout(new FlowLayout());
	updateframe.setSize(500, 500);
	
	
	
}
}

