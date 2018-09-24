<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<h1 style="color:red;text-align:center">SimpleFormController</h1>
<form:form commandName="command" method="POST">
Student Name:<form:input path="sName"/><br>
Course::<form:input path="course"/><br>
Address::<form:input path="sAdd"/><br>
<input type="submit" value="Register">
</form:form>