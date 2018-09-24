<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<h1 style="color:red;text-align:center">MultiActionController</h1>
<form action="mac.htm" method="POST">
	Student no:<input type="text" name="sno"><br>
	Student Name:<input type="text" name="sname"><br>
	Student Address:<input type="text" name="sadd"><br>
	<input type="submit" name="s" value="add">
	<input type="submit" name="s" value="update">
	<input type="submit" name="s" value="delete">
	<input type="submit" name="s" value="view">
	<input type="submit" name="s1" value="invalid">
</form>
<c:if test="${msg ne null }">
${msg} is successful.

</c:if>