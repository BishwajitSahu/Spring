<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:choose>
	<c:when test="${!empty student_list}">
		<h2 style="color:red;text-align:center">Studentlist</h2>
		<table bgcolor="cyan" border="1" align="center">
			<tr><th>sno</th><th>sname</th><th>sadd</th><th>course</th></tr>
			<c:forEach items="${student_list }" var="list">
				<tr><td>${list.sno}</td><td>${list.sname }</td><td>${list.sadd }</td><td>${list.course }</td><td><a href="edit.htm?sno=${list.sno }">Edit</a>
			</c:forEach></tr>
				
		</table>
	</c:when>
	<c:otherwise>
		<h2 style="color:red;text-align:center">Records not found.</h2>
	</c:otherwise>
</c:choose>