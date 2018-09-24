<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<h2 style="color:red;text-align: center;">Balance Page</h2>
Account Balance::${bal}


<br><br><br>
<a href="home.htm">Home</a>

<form id="logout" action="<c:url value="/logout"/>" method="post" >
  <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
  <!-- <input type="submit" value="logout"> -->
</form>
<a href="javascript:document.getElementById('logout').submit()">Logout</a>