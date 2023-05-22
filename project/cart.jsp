<%@page import="Com.Dao.UserDao"%>
<%@page import="Com.model.CartModel"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
       <jsp:useBean id="m" class="Com.model.CartModel"></jsp:useBean>
     <jsp:setProperty property="*" name="m"/> 
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>


<%
			
		String id=request.getParameter("id");
		int id2=Integer.parseInt(id);
		CartModel m2=UserDao.getselectedcartdetails(id2);
		
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
				 <input type="hidden" name="product_image" value="<%=m2.getProduct_image() %>"> 
				 <br>
			<img width="500px" height="200px" src="<%=m2.getProduct_image() %>">
		
		</p>
		<p>
			<input type="text" name="product_price" value="<%=m2.getProduct_price() %>" readonly="readonly"></h2>
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
</html>