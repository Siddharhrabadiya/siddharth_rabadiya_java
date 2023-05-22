package Com.Dao;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;



import Com.model.CartModel;
import Com.model.ContactUsModel;
import Com.model.ProductModel;
import Com.model.SendEmailModel;
import Com.model.SignupModel;
import Com.model.WishlistModel;






public class UserDao 
{
	public static Connection getconnect()
	{
		Connection con = null;
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/easyphotography","root","");
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
		
	}

	public static int SignupUser(SignupModel m)
	{
		
		int status = 0;
		
		Connection con = UserDao.getconnect();
		
		String sql ="insert into signup (name,email,password) values (?,?,?)";
		try 
		{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,m.getName());
			ps.setString(2,m.getEmail());
			ps.setString(3,m.getPassword());
			
			
			status = ps.executeUpdate();
		}
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return status;
		
		
		
	}
	
	public static SignupModel LoginCheck(SignupModel m)
	{
		boolean flag = false;
		SignupModel obj = null;
		
		try
		{
			
			Connection con = UserDao.getconnect();
			PreparedStatement ps = con.prepareStatement("select * from signup where email=? and password=?");
			ps.setString(1, m.getEmail());
			ps.setString(2, m.getPassword());
			
			ResultSet rs = ps.executeQuery();
			
			if (rs.next()) {
				obj = new SignupModel();
				obj.setName(rs.getString("name"));
				obj.setEmail(rs.getString("email"));
				obj.setPassword(rs.getString("password"));

			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return obj;
	}
	
	public static int SendEmail(SendEmailModel m)
	{
		
		int status = 0;
		
		Connection con = UserDao.getconnect();
		
		String sql ="insert into emailsending (email) values (?)";
		try 
		{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,m.getEmail());
		
			
			
			status = ps.executeUpdate();
		}
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return status;
		
		
		
	}
	
	public static List<ProductModel>productview()
	{
		
		List<ProductModel>list = new ArrayList<ProductModel>();
		
		Connection con = UserDao.getconnect();
		
		
		
		try 
		{
			String sql="select * from product";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet set =ps.executeQuery();
			
			while(set.next())
			{
				
				ProductModel m =new ProductModel();
				m.setId(set.getInt(1));
				m.setProduct_name(set.getString(2));
				m.setProduct_price(set.getString(3));
				m.setProduct_description(set.getString(4));
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
	
	
	public static List<ProductModel>getallproducts()
	{
		List<ProductModel>productlist = new ArrayList<ProductModel>();
	
				
		Connection con = UserDao.getconnect();
		try 
		{
			PreparedStatement ps = con.prepareStatement("select * from product");
			ResultSet rs = (ResultSet) ps.executeQuery();
			
			while(rs.next())
			{
				ProductModel pm = new ProductModel();
				
				pm.setId(rs.getInt(1));
				pm.setProduct_name(rs.getString(2));
				pm.setProduct_price(rs.getString(3));
				pm.setProduct_description(rs.getString(4));
				pm.setProduct_image(rs.getString(5));
				productlist.add(pm);
			}
			
		}
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return productlist;
	
	}
	public static CartModel getselectedcartdetails(int id)
	{
		CartModel m= new CartModel();
		Connection con = UserDao.getconnect();
		
		try 
		{
			PreparedStatement ps =(PreparedStatement) con.prepareStatement("select id,product_name,product_image,product_price from product where id=?");
			ps.setInt(1,id);
			ResultSet set=ps.executeQuery();
			if(set.next())
			{
				
				m.setId(set.getInt(1));
				m.setProduct_name(set.getString(2));
				m.setProduct_image(set.getString(3));
				m.setProduct_price(set.getString(4));
				m.setEmail(set.getString(4));
				
				
				
			}
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return m;
	}

	
	public static int CartInsert(CartModel m)
	{
		int status = 0;

		Connection con = UserDao.getconnect();

		try {
			PreparedStatement ps = con.prepareStatement("insert into cart(id,product_name,product_image,email,product_price) values(?,?,?,?,?)");

			ps.setInt(1, m.getId());
			ps.setString(2, m.getProduct_name());
			ps.setString(3, m.getProduct_image());
			ps.setString(4, m.getEmail());
			ps.setString(5, m.getProduct_price());
		

			status = ps.executeUpdate();
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return status;
	}
	
	public static CartModel getCARTproductdetail(int id)
	{
		
		CartModel m =new CartModel();
		
			Connection con =UserDao.getconnect();
			
			try 
			{
				PreparedStatement ps =(PreparedStatement) con.prepareStatement("select * from product where id=?");
				ps.setInt(1,id);
				ResultSet set=ps.executeQuery();
				
				if(set.next())
				{
					
					m.setId(set.getInt(1));
					m.setProduct_name(set.getString(2));
					m.setProduct_image(set.getString(3));
					m.setEmail(set.getString(4));
					m.setProduct_price(set.getString(5));
					
					
					
				}
				
			} 
			catch (SQLException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		return m;
		
	}
		
		public static List<CartModel>cartlistview()
		{
			
			List<CartModel>list = new ArrayList<CartModel>();
			
			Connection con = UserDao.getconnect();
			
			
			
			try 
			{
				String sql="select * from cart where email=?";
				PreparedStatement ps = con.prepareStatement(sql);
				ResultSet set =ps.executeQuery();
				
				while(set.next())
				{
					
					CartModel m =new CartModel();
					m.setId(set.getInt(1));
					m.setProduct_name(set.getString(2));
					m.setProduct_image(set.getString(3));
					m.setEmail(set.getString(4));
					m.setProduct_price(set.getString(5));
					
					
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
		public static List<CartModel> getallcartdetail(SignupModel m2)
		{
			List<CartModel> i2 = new ArrayList<CartModel>();
			
			HttpServletRequest request = null;
			
			try {
				
				
				SignupModel s=new SignupModel();
				Connection con = UserDao.getconnect();
				PreparedStatement ps= con.prepareStatement("Select * from cart where email=? ");
				//System.out.println(m2.getEmail());
				ps.setString(1, m2.getEmail());
				ResultSet rs = (ResultSet) ps.executeQuery();
				
				while(rs.next())
				{
					CartModel d1 = new CartModel();
					//d1 = new ImageModel();
					d1.setId(rs.getInt(1));
					d1.setProduct_name(rs.getString(2));
					d1.setProduct_image(rs.getString(3));
					d1.setEmail(rs.getString(4));
					d1.setProduct_price(rs.getString(5));

					i2.add(d1);
					
				}
				
			} catch (Exception e)
			{
				// TODO: handle exception
				e.printStackTrace();
			}
			
			return i2;
		}

		public static WishlistModel getselectedwishdetail(int id)
		{
			WishlistModel m= new WishlistModel();
			Connection con = UserDao.getconnect();
			
			try 
			{
				PreparedStatement ps =(PreparedStatement) con.prepareStatement("select id,product_name,product_image from product where id=?");
				ps.setInt(1,id);
				ResultSet set=ps.executeQuery();
				if(set.next())
				{
					
					m.setId(set.getInt(1));
					m.setProduct_name(set.getString(2));
					m.setProduct_image(set.getString(3));
					//m.setEmail(set.getString(4));
					
					
					
				}
			}
			catch (Exception e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			return m;
			
		}
		

		
		
		
		
		public static int WishInsert(WishlistModel m) {
			int status = 0;

			Connection con = UserDao.getconnect();

			try {
				PreparedStatement ps = con.prepareStatement("insert into wishlist(id,product_name,product_image,email) values(?,?,?,?)");

				ps.setInt(1, m.getId());
				ps.setString(2, m.getProduct_name());
				ps.setString(3, m.getProduct_image());
				ps.setString(4, m.getEmail());
			

				status = ps.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			return status;
		}	
		
		public static WishlistModel getproductdetail(int id)
		{
			
			WishlistModel m =new WishlistModel();
			
				Connection con =UserDao.getconnect();
				
				try 
				{
					PreparedStatement ps =(PreparedStatement) con.prepareStatement("select * from product where id=?");
					ps.setInt(1,id);
					ResultSet set=ps.executeQuery();
					
					if(set.next())
					{
						
						m.setId(set.getInt(1));
						m.setProduct_name(set.getString(2));
						m.setProduct_image(set.getString(3));
						m.setEmail(set.getString(4));
						
						
						
					}
					
				} 
				catch (SQLException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			
			return m;
			
		}
		
		
		
		public static List<WishlistModel>wishlistview()
		{
			
			List<WishlistModel>list = new ArrayList<WishlistModel>();
			
			Connection con = UserDao.getconnect();
			
			
			
			try 
			{
				String sql="select * from wishlist where email=?";
				PreparedStatement ps = con.prepareStatement(sql);
				ResultSet set =ps.executeQuery();
				
				while(set.next())
				{
					
					WishlistModel m =new WishlistModel();
					m.setId(set.getInt(1));
					m.setProduct_name(set.getString(2));
					m.setProduct_image(set.getString(3));
					m.setEmail(set.getString(4));
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
		
		public static List<WishlistModel> getallwishdetail(SignupModel m2)
		{
			List<WishlistModel> i2 = new ArrayList<WishlistModel>();
			
			HttpServletRequest request = null;
			
			try {
				
				
				SignupModel s=new SignupModel();
				Connection con = UserDao.getconnect();
				PreparedStatement ps= con.prepareStatement("Select * from wishlist where email=? ");
				//System.out.println(m2.getEmail());
				ps.setString(1, m2.getEmail());
				ResultSet rs = (ResultSet) ps.executeQuery();
				
				while(rs.next())
				{
					WishlistModel d1 = new WishlistModel();
					//d1 = new ImageModel();
					d1.setId(rs.getInt(1));
					d1.setProduct_name(rs.getString(2));
					d1.setProduct_image(rs.getString(3));
					d1.setEmail(rs.getString(4));
					i2.add(d1);
					
				}
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			return i2;
		}
		public static int contactus(ContactUsModel m)
		{
			
			int status = 0;
			
			Connection con = UserDao.getconnect();
			
			String sql ="insert into contactus (fullname,email,phone,message) values (?,?,?,?)";
			try 
			{
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1,m.getFullname());
				ps.setString(2,m.getEmail());
				ps.setString(3, m.getPhone());
				ps.setString(4, m.getMessage());
				
				
				
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
