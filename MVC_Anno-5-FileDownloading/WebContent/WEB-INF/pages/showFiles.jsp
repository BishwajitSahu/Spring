<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
	
	<h1 style="color:red;text-align: center;">File List</h1>
	<c:choose>
		<c:when test="${!empty fileNameList }">
			<table border="1" cellspacing="0" align="center" bgcolor="cyan" >
				<tr><th>Sn.O</th><th>FileName</th><th>Download</th></tr>
				<c:forEach varStatus="loop" items="${fileNameList }" var="fileName">
					<tr><td>${loop.count }</td><td>${fileName }</td><td><a href="download.htm?file=${fileName}">download</a></td></tr>
				</c:forEach>
			</table>
		</c:when>
		<c:otherwise><h2 style="color:red;text-align: center;">folder is empty.</h2></c:otherwise>
	</c:choose>