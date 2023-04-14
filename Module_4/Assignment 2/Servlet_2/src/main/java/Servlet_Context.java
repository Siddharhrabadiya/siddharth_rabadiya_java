import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.ServerException;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet_Context extends HttpServlet
{
public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServerException,IOException
{
	res.setContentType("text/html");  
	PrintWriter pw=res.getWriter();  
	
	ServletContext context=getServletContext();  
	
	
	 String s1=context.getInitParameter("n1");
     String s2=context.getInitParameter("n2");

     pw.println("My name is " +s1+ " I am " +s2);
	
	pw.close();  
}



}
