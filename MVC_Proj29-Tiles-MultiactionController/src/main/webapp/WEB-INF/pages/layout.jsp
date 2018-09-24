<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><tiles:insertAttribute name="title" ignore="true"/></title>
</head>
<body>
	<table border="1" height="100%" width="100%" cellspacing="10px">
		<tr height="20%" bgcolor="yellow"><td colspan="2"><tiles:insertAttribute name="header"/></td></tr>
		<tr height="70%">
			<td width="30%" bgcolor="blue"><tiles:insertAttribute name="menu"/></td>
			<td bgcolor="cyan"><tiles:insertAttribute name="body"/></td>
		</tr>
		<tr height="10%" bgcolor="pink"><td colspan="2"><tiles:insertAttribute name="footer"/></td></tr>
	</table>
</body>
</html>