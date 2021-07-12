<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Car Details by Model</title>
</head>
<body>
<form:form method="POST" action="carDetails/search" >
<form:select name="brand" , path="${list}">

<form:option value="${list}">Model</form:option>
<form:input path="${list}"/>>

</form:select>


<input type="submit" value="Search">

</form:form>
</body>
</html>