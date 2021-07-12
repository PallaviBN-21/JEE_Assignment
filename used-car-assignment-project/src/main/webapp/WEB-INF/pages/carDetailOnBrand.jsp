<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Car Details by Brand</title>
<style>
table{
border:2px solid blue;
border-collapse:collapse;
margin-left:auto;
margin-right:auto;
}
tr,th,td{
border:2px solid blue;
}
</style>

</head>
<body>
<h1>
<c:out value="${heading}"/><br/>
</h1>
<table>
<tr>
<th>Model</th>
<th>Year Of Manufacture</th>
<th>Kilometers Traveled</th>
<th>Status</th>

</tr>
<c:forEach items="${list}" var="eachItem">
<tr>
<td> <c:out value="${eachItem.model}"/></td>
<td> <c:out value="${eachItem.yearOfManufacture}"/></td>
<td> <c:out value="${eachItem.kilometersTravelled}"/></td>
<td> <c:out value="${eachItem.status}"/></td>
</tr>
</c:forEach>
</table>

</body>
</html>