<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<h1 style="color:red;text-align:center">AbstractWizardFormController</h1>
<form:form method="POST" commandName="regCmd">
Qualification::<input path="qlfy"/><br>
Skill::<input path="skill"/><br>
<input type="submit" value="previous" name="_target0"/>
<input type="submit" value="next" name="_target2"/>
<input type="submit" value="cancel" name="_cancel"/>
</form:form>