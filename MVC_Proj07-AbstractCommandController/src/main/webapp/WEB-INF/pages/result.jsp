<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:choose>
	<c:when test="${!empty empResult }">
	<h1 style="color:red;text-align: center">Search result</h1>
		<table border="1"  bgcolor="cyan" align="center">
         	<tr> <th>EMPID</th><th>ENAME</th><th>JOB</th><th>SAL</th><th>DEPT NO</th><th>MGR</th> </tr>
         	<c:forEach var="dto" items="${empResult }">
         		<tr>
                 <td>${dto.empNo}</td>
                 <td>${dto.eName}</td>
                 <td>${dto.job}</td>
                 <td>${dto.sal}</td>
                 <td>${dto.deptNo}</td>
                 <td>${dto.mgr}</td>
              	</tr>
         	</c:forEach>	
        </table>  
	</c:when>
	<c:otherwise><h1 style="color:red;text-align:center"> No Records found </h1>
	</c:otherwise>
</c:choose>

<br><br>
 <a href="form.htm">home</a>

