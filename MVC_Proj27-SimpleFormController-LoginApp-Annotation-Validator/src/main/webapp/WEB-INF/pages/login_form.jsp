<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<h1 style="color: red; text-align: center">Login form</h1>
<form:form method="POST" modelAttribute="userCmd">
UserName:<form:input path="user" />
	<form:errors path="user" style="color:red" />
	<br>
Password:<form:password path="pwd" />
	<form:errors path="pwd" style="color:red" />
	<br>
Domain:<form:checkboxes items="${domains}" path="domains" />
	<br>
listBox:<form:select path="country">
		<form:option value="NONE" label="Select" />
		<form:options items="${countryList}" />
	</form:select>
	<br>
Dob:<input type="text" name="dob">(dd-MM-yyyy)<br>
	<input type="submit" value="login" name="login">
 <input type="hidden" value="${sToken}"  name="cToken"/>
</form:form>
<c:if test="${result ne null }">
	<c:out value="${result }"></c:out>
</c:if>