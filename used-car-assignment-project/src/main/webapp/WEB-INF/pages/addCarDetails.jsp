<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sell</title>
</head>
<body>
<p> No of Car Details Added</p> <c:out value="${rowAdded}"/> 

<form:form method="post" action="carDetails" >

<form:label path="model"> Car Model </form:label>
<form:input path="model" />

<form:label path="yearOfManufacture"> Year of Manufacture </form:label>
<form:input path="yearOfManufacture" />

<form:label path="kilometersTravelled"> Kilometers Traveled</form:label>
<form:input path="kilometersTravelled" />

<form:label path="status"> Status </form:label>
<form:input path="status" />

<input type="submit" value="Add">

</form:form>

</body>
</html>