<%@page import="Com.model.WishlistModel"%>
<%@page import="Com.Dao.UserDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
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
		WishlistModel m2=UserDao.getselectedwishdetail(id2);
		
	%>
	
	<center>
			
		<br>
		<br>
		
		<form action="mywishlist.jsp">
		
		
		<p>
			<input type="hidden" name="id" value="<%=m2.getId() %>">
		</p>
		
		<p>
			<h2 style="align-content: center;"><input type="text" name="product_name" value="<%=m2.getProduct_name() %>" readonly="readonly"></h2>
		</p>
		
		<p>
				 <input type="hidden" name="product_image" value="<%=m2.getProduct_image() %>"> 
				 <br>
			<img width="500px" height="200px" src="<%=m2.getProduct_image() %>">
		
		</p>
		
		<p>
				
			 <input type="text" name="email" value="<%= session.getAttribute("myemail") %>" readonly="readonly"> 
		
		</p>
		
		<p>
			
			<input class="swd-button" type="submit" value="submit">
			
		 </p>
		 </ceter>
		 </form>
	
	<jsp:include page="footer.jsp"></jsp:include>

</body>
