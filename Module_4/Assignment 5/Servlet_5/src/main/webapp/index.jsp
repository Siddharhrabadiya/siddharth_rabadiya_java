<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP List Users Records</title>
</head>
<body>
    <sql:setDataSource
        var="myDS"
        driver="com.mysql.jdbc.Driver"
        url="jdbc:mysql://localhost:3306/test"
        user="root" password=""
    />
     
    <sql:query var="listUsers"   dataSource="${myDS}">
        SELECT * FROM info;
    </sql:query>
     
    <div align="center">
        <table border="1" cellpadding="5">
            
            <tr>
                
                <th>Name</th>
                <th>Email</th>
                <th>Password</th>
            </tr>
            <c:forEach var="user" items="${listUsers.rows}">
                <tr>
                   
                    <td><c:out value="${user.fname}" /></td>
                    <td><c:out value="${user.email}" /></td>
                    <td><c:out value="${user.password}" /></td>
                </tr>
            </c:forEach>
        </table>
    </div>
</body>
</html>