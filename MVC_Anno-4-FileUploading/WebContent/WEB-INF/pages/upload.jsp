<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<h2 style="color:red;text-align:center">file uploading application.</h2>
<form:form action="upload.htm" method="POST" modelAttribute="fileCmd" enctype="multipart/form-data">
Choose file1:<input type="file" name="file1"><br>
Choose file2:<input type="file" name="file2"><br>
<input type="submit" value="upload">
</form:form>