<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
	
	<form:form method="POST" commandName="stCmd">
		Student No::<form:input path="sno" readonly="true"/><br>
		Student Name::<form:input path="sname"/><br>
		Student Add::<form:input path="sadd"/><br>
		Course::<form:input path="course"/><br>
		<input type="submit" value="edit" name="edit">
	</form:form>