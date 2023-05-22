<%@page import="Com.Dao.UserDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
   <jsp:useBean id="product" class="Com.model.CartModel"></jsp:useBean>
    <jsp:setProperty property="*" name="product"/>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<jsp:include page="header.jsp"></jsp:include>
</head>
<body>

			<h1>CartList</h1>


		<%
		
		int status = UserDao.CartInsert(product);
		
		//out.println(status);
		
		if (status > 0) 
		{
			
			out.print("<a href='cartlistview.jsp'>Items Added Succesfully for View Cartist detail CLick here </a>");
		}
		else 
		{
			out.print("fail");
		}
		%>



</body>
<jsp:include page="footer.jsp"></jsp:include>
</html>