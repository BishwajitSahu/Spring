<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<h2 style="color:red;text-align: center;">My Login page</h2>
<html><head><title>Login Page</title></head><!-- <body onload='document.f.username.focus();'> -->
<h3>Login with Username and Password</h3>
	<form name='loginForm'
		  action="<c:url value='login' />" method='POST'>

		  <table>
			<tr>
				<td>User:</td>
				<td><input type='text' name='user' value=''></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type='password' name='pwd' /></td>
			</tr>
			<tr>
				<td colspan='2'><input name="submit" type="submit"
					value="Login" /></td>
			</tr>
		  </table>

		   <input type="hidden" name="${_csrf.parameterName}"
			value="${_csrf.token}" />

		</form>
</html>