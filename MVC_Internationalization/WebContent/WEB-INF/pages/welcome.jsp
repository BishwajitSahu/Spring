<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<h2 style="color:red;text-align:center"><spring:message code="welcome.header"></spring:message></h2>
<spring:message code="label.username"/><input type="text" name="user">
<br>
<spring:message code="label.password"></spring:message><input type="password"><br>
<input type="submit" value='<spring:message code="btn.submit"/>'>

<br><a href="?language=hi_IN">Hindi</a>&nbsp;&nbsp;<a href="?language=fr_FR">french</a>&nbsp;&nbsp;<a href="?language=en_IN">English</a>