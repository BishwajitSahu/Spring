<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<core:choose>
	<core:when test="${!empty listRDTO }">
		<h1 style="color:red;text-align:center">SearchResult</h1>
		<table border="1" bgcolor="cyan" align="center" >
		<tr><td>Empno</td><td>EmpName</td><td>job</td><td>sal</td><td>deptNo</td></tr>
			<core:forEach var="dto" items="${listRDTO }">
				<tr>
					<td>${dto.empno }</td>
					<td>${dto.ename }</td>
					<td>${dto.job }</td>
					<td>${dto.sal }</td>
					<td>${dto.deptno }</td>
				</tr>
			</core:forEach>
		</table>
	</core:when>
	<core:otherwise><h2 style="color:red;text-align:center">record not found.</h2></core:otherwise>
</core:choose>

<a href="home.htm">home</a>