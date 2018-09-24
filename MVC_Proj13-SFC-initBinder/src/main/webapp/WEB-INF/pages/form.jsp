<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<h1 style="color:red;text-align:center">initBinder()</h1>
<form:form method="POST" commandName="stCmd">
	<form:errors path="*" style="color:red"/><br>
	Sno::<form:input path="sno"/><br>
	Sname::<form:input path="sname"/><br>
	DOB::<form:input path="dob"/><br>
	DOJ::<form:input path="doj"/><br>
	DOM::<form:input path="dom"/><br>
	<input type="submit" value="register">
</form:form>