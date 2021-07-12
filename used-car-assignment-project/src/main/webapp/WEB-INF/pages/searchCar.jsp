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
<form:label path="model"> Model </form:label>
<form:select path="model" items="${brands}">
<option value="${brands}">Java</option>

</form:select>


<input type="submit" value="Search">

</form:form>
</body>
</html>