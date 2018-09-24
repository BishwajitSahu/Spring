<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<h2 style="color:red;text-align: center;">EmployeeList</h2>
<c:choose>
	<c:when test="${!empty listDto }">
		<table align="center" border="1" cellspacing="0">
			<tr><th>Sl.No</th><th>E id</th><th>Name</th><th>salary</th><th>email</th></tr>
			<c:forEach items="${listDto }" varStatus="loop" var="dto">
			<tr><td>${loop.count }</td><td>${dto.getEid()}</td><td>${dto.getFname() }  ${dto.getLname() }</td><td>${dto.getSalary() }</td><td>${dto.getEmail() }</tr>
			</c:forEach>
		</table>
	</c:when>
	<c:otherwise>
		<h2 style="color:blue;text-align: center">Records not found.</h2>
	</c:otherwise>
</c:choose>