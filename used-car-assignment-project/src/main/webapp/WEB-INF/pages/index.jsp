<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Used Car Service - Home Page</title>
</head>
<body>

<h1>
<c:out value="${heading}"/><br/>
</h1>
<h2>
<a href="carDetails">Add your Car Details</a><br/>
<a href="carDetails/view">View All Car Details</a><br/>
<a href="carDetails/search">Search Car by Brand</a>

</h2>
</body>
</html>