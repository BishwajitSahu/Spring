<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<h1 style="color:red;text-align:center">form page</h1>
<form:form method="post" modelAttribute="empCmd">
Eid:<form:input path="eid"/><form:errors path="eid"/>
<br>
First Name:<form:input path="fname"/><form:errors path="fname"/><br>
Last Name:<form:input path="lname"/><form:errors path="lname"/><br>
Salary:<form:input path="salary"/><form:errors path="salary"/><br>
Email:<form:input path="email"/><form:errors path="email"/><br>
<input type="submit" value="register">
</form:form>