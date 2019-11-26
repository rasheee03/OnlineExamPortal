<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="level.lti" method=POST>
<c:forEach items="${questions}" var="q">
	
		<tr>
		<td><input type="hidden"  name="q1">${o.getQid}<br>  </td>
		<td >${q.getQuestion()}</td>
		
		</tr>
		
		<c:forEach items="${q.options}" var="o">

		<input type="hidden"  name="op1">${o.getOpid}<br>  
		<input type="radio" name="op" value="1"> ${o.getDescription()}<br>
		
		<!-- <td >Hidden value:<c:out value="${o.getOpid}" /></td> -->

	 </c:forEach>
 
	
	</c:forEach>
	</form>

</body>
</html>