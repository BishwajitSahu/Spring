<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>


<h1 style="color:red;text-align:center">Register page</h1>
<form:form commandName="registerCmd" method="POST">
	Sno::<form:input path="sno"/><form:errors path="sno" style="color:red"/><br>
	Sname::<form:input path="sname"/><form:errors path="sname" style="color:red"/><br>
	Qlfy::<form:input path="qlfy"/><br>
	Course::<form:input path="course"/><br>
	Hobbies::<form:input path="hobies"/><br>
	<input type="submit" value="register" name="register">
</form:form>