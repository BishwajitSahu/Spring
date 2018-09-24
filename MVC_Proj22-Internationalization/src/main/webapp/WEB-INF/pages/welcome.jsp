<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<h1 style="color:red;text-align:center"></h1>
<form:form action="result.htm" method="POST">
<spring:message code="label.name"/><input type="text" name="name"><br>
<spring:message code="label.age"/><input type="text" name="age"><br>
<spring:message code="label.addrs"/><input type="text" name="addrs"><br>
<input type="submit" value='<spring:message code="register.cap"/>'>
</form:form>
<a href="?language=hi_IN">hindi</a>&nbsp;&nbsp;<a href="?language=or_IN">odia</a>&nbsp;&nbsp;<a href="?language=en">English</a>