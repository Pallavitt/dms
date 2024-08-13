<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Page</title>
</head>
<body>

      <h2> Home Page </h2>
      <p> Welcome ${USER.userId} </p>
      
      <c:if test="${USER.role == 'A'}">
            <a href="dept.html"> Department page </a>
      </c:if>
      
      <br/>
      <a href="test.html"> Testing to be done </a>
      
</body>
</html>