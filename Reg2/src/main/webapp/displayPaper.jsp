<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import="java.util.*" %>
     <%@ page import="org.springframework.context.ApplicationContext" %>
     <%@ page import="org.springframework.context.support.ClassPathXmlApplicationContext" %>
     <%@ page import="com.lti.repository.QuestionPaperRepository" %>
     <%@ page import="com.lti.model.Question" %>
     <%@ page import="com.lti.model.Option" %>

    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Question Paper</title>
</head>
<body>

<h1 align="center" style="color:Blue"><font><strong>Questions</strong></font></h1>
<div style="border:solid 2px black;display:inline-block;"></div>
<table align="center" style="color:red" cellpadding="10" cellspacing="10" border="2.2">
	<c:forEach items="${questions}" var="q">
		<tr>
			<td>${q.getQuestion()}</td>
		</tr>
	</c:forEach>
</table>
</body>