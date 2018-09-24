<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
 <c:choose>
	<c:when test="${!empty medicines}">
	<h2 style="color:green;text-align:center">Medicine list</h2>
	<table border="1" align="center">
		<tr><th>MedID</th><th>Med Name</th><th>med price</th><th>mfg dt</th><th>exp dt</th></tr>
		<c:forEach items="${medicines}" var="dto">
			<tr><td><c:out value="${dto.medId}"/></td>
			<td><c:out value="${dto.medName}"/></td>
			<td><c:out value="${dto.price}"/>
			<td><c:out value="${dto.mfgDt}"/>
			<td><c:out value="${dto.expiryDt}"/>
			</tr>
		</c:forEach>
	</table>	
	</c:when>	
<c:otherwise>
	<h1 style="color:red;text-align:center">Records not found.</h1>
</c:otherwise>
</c:choose>