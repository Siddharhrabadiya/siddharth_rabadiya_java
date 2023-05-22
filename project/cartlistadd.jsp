<%@page import="Com.Dao.UserDao"%>
<%@page import="Com.model.CartModel"%>
<%@page import="java.util.List"%>
<%@page import="Com.model.SignupModel"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <jsp:useBean id="product12" class="Com.model.CartModel"></jsp:useBean>
<jsp:setProperty property="*" name="product12"/>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:include page="header.jsp"></jsp:include>



	<%
			
		String id=request.getParameter("id");
		int id2=Integer.parseInt(id);
		
		CartModel m2=UserDao.getselectedcartdetails(id2);
		//int status123 = UserDao.CartInsert(product12);
		//System.out.print(status123);
		
		
	%>
	
 	<center>
			
		<br>
		<br>
		
		 <form action="mycartlist.jsp">
		
		
		<p>
			<input type="hidden" name="id" value="<%=m2.getId() %>">
		</p>
		
		<p>
			<h2 style="align-content: center;"><input type="text" name="product_name" value="<%=m2.getProduct_name() %>" readonly="readonly"></h2>
		</p>
		
		<p>
			<img alt="" src="<%=m2.getProduct_image() %>" width="300px" height="200px">	
			 <input type="hidden" name="product_image" value="<%=m2.getProduct_image() %>"> 
		
		</p>
		<p>
			<input type="text" name="product_price" value="<%=m2.getProduct_price() %>"> 
			
		</p>
		<p>
				
			 <input type="text" name="email" value="<%= session.getAttribute("myemail") %>"> 
		
		</p>
		
		<p>
			
			<input class="swd-button" type="submit" value="submit">
			
		 </p>
		</form>
	 
 

<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>