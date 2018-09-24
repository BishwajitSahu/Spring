<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<h1 style="color:red;text-align:center">Login Application</h1>
<form:form modelAttribute="userCmd" onsubmit="return validate(this)">
	Enter Username:-<form:input path="uname" id="uname"/><span style="color:red" id="unameErr"></span><span style="color:red;"><form:errors path="uname"></form:errors></span>
	<br>
	Enter Password:-<form:password path="pwd" id="pwd"/><span style="color:red" id="pwdErr"></span><span style="color:red"><form:errors path="pwd"></form:errors></span>
	<br>
	<input type="hidden" value="${sToken }" name="cToken"/>
	<!-- flag value to check whether client side validation is done or not -->
	<form:hidden path="flag" value="no" id="flag"/>
	<input type="submit" value="Login">
</form:form>
<c:if test="${!empty msg }">
	${msg }
</c:if>

<script type="text/javascript">
	function validate(frm) {
		frm.flag.value="yes";
 		var uname=frm.uname.value;
 		var pwd=frm.pwd.value;
 		document.getElementById("unameErr").innerHTML="";
 		document.getElementById("pwdErr").innerHTML="";
		
		if(uname=="" || uname==null){
			document.getElementById("unameErr").innerHTML="Username is mendatory";
			frm.uname.focus();
			frm.uname.value="";
			return false;
		}
		 if(pwd=="" || pwd==null){
			document.getElementById("pwdErr").innerHTML="Password is mendatory";
			frm.pwd.focus();
			frm.pwd.value="";
			return false;
		}
		return true;
	}
</script>
