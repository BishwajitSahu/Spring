<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<h1 style="color:red;text-align:center">AbstractWizardFormController</h1>
<form:form method="POST"  commandName="regCmd">
Name::<input path="name"/><br>
Age::<input path="age"/><br>
Gender::<input path="gender"/><br>
<input type="submit" value="next" name="_target1"/>
<input type="submit" value="cancel" name="_cancel"/>
</form:form>