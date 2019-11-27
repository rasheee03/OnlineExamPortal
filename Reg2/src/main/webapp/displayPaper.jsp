<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Question Paper</title>
<style>
body{
background:#AEE4FF;
}



</style>
</head>
<body>
<form method="post" action="qp1.lti">
<h1 align="center" style="color:Blue"><font><strong>Questions</strong></font></h1>
<div style="border:solid 2px black;display:inline-block;"></div>
<table  align="center" style="color:red" cellpadding="10" cellspacing="10" border="2.2">
		
<h1>Q.no ${ sessionScope.qno+1  } </h1> 
	 	
		<tr>
		<td >${question.getQuestion()}</td>
		</tr>
		<c:forEach items="${question.options}" var="o">
		<tr>
		<td><input type="radio" name="selected_ans" value="${ op.opid }">${o.getDescription()}</td>
		</tr>
		</c:forEach>
		
		<%if (request.getAttribute("qno")==request.getAttribute("size"))
		{%>

<button type="submit"><a href="result.jsp">SUBMIT</a>
<%}


else
{ %>
<button type="submit">NEXT</button>
<%} %>
 
</table> 
</form>
</body>