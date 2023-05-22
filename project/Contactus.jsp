<%@page import="Com.Dao.UserDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:useBean id="M" class="Com.model.ContactUsModel"></jsp:useBean>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
 	String contactus = request.getParameter("request");
	int status =UserDao.contactus(M);
	out.print(status);
	out.print(M.getFullname());
	out.print(M.getEmail());
	out.print(M.getPhone());
	out.print(M.getMessage());
	
	if(status>0)
	{
		
		//out.print("Email Sent");
		response.sendRedirect("login.jsp");
	}
	else
	{
		out.print("Error");
		
	}

%>

</body>
</html>