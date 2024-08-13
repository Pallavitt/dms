<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Book Page</title>
</head>
<body>

    <h2>Book Page</h2>
    
    <form:form action="book.html" method="post">
        <form:input path="bookId"/>
        <br/>
        <form:input path="bookTitle"/>
        <br/>
        <input type="submit" value="Create"/>  
    </form:form>
    
    <hr/>
    
    <table border="1">
       <thead>
          <tr>
             <td> Book Id </td>
             <td> Book Title </td>
          </tr>
       </thead>
       <tbody>
            <c:forEach items="${BOOK_LIST}" var="b">
             <tr>
                <td> <c:out value="${b.bookId}"/> </td>
                <td> <c:out value="${b.bookTitle}"/> </td>
             </tr>
            
            </c:forEach>
       </tbody>
    </table>
</body>
</html>