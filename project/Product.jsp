<%@page import="Com.Dao.UserDao"%>
<%@page import="java.util.List"%>
<%@page import="Com.model.ProductModel"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:useBean id="m" class="Com.model.ProductModel"></jsp:useBean>
   <jsp:setProperty property="*" name="m"/> 
  <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>


<%
			
		List<ProductModel> list = UserDao.getallproducts();
		request.setAttribute("pl", list);
			
		%>
		
		<c:forEach items="${pl}" var="list">
			<center>

					<br>
					<br>
					
					<p>
						<h2>${list.getProduct_name()}</h2>
					</p>
					
					<p>
						<img width="300px" height="200px" src="${list.getProduct_image()}">
					</p>
					
					<p>
						<h3>${list.getProduct_price()}</h3>
					</p>
			
					<p>
						<h4>${list.getProduct_description()}</h4>
					</p>
			
					<p>
		
					
					<button>
					<a   href="cartlistadd.jsp?id=${list.getId()}">Add To Cart</a>
						</button>
						<button>
					<a  href="wishlistadd.jsp?id=${list.getId()}">Add To WishList</a>
					</button>
			
				</p>
			</center>
		
		</c:forEach>




<jsp:include page="footer.jsp"></jsp:include>

</body>
</html>