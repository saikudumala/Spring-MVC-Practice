<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to shelf</title>
</head>
<body>
<h2>Book Details</h2>
<form:form action="savebook" method="POST" modelAttribute="book">
<table>
<tr>
<td>BookName :</td>
<td><form:input path="bookName"/></td>
</tr>
<tr>
<td>BookAuthor :</td>
<td><form:input path="bookAuthor"/></td>
</tr>
<tr>
<td>BookPrice :</td>
<td><form:input path="bookPrice"/></td>
</tr>
<tr>
<td>Submit</td>
<td><input type="submit" value ="Save Book"/></td>
</tr>
</table>
</form:form>
</body>
</html>