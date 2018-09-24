<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<h1 style="color:red;text-align:center">AbstractWizardFormController</h1>
<form:form method="POST" commandName="regCmd">
PreferedCity::<input path="city"/><br>
Expected salary::<input path="expectedSalary"/><br>
<input type="submit" value="previous" name="_target1"/>
<input type="submit" value="register" name="_finish"/>
<input type="submit" value="cancel" name="_cancel"/>
</form:form>