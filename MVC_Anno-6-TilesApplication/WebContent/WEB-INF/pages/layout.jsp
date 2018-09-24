<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
	<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<head>
<title>
	<tiles:insertAttribute name="title" ignore="true"></tiles:insertAttribute>
	</title>
</head>
<body>
	<table>
		<tr height="30%"><td colspan="2"><tiles:insertAttribute name="header"></tiles:insertAttribute></td></tr>
		<tr height="60%">
			<td width="10%"><tiles:insertAttribute name="left"></tiles:insertAttribute> </td>
			<td width="90%"> <tiles:insertAttribute name="body"></tiles:insertAttribute></td>
		</tr>
		<tr height="10%"><td colspan="2"><tiles:insertAttribute name="footer"></tiles:insertAttribute></td></tr>
	</table>
</body>