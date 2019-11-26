<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="get" action="eh.lti">
<table align="center" style="color:red" cellpadding="10" cellspacing="10" border="2.2">
	<c:forEach items="${details}" var="q">
		<tr>
		<td>Course Name</td>
		<td>Score</td>
		</tr>
		<tr>
			<td>${q.course.getName()}</td>
			<td>${q.getResult()}</td>
		
		</tr>
		
	</c:forEach>

</table>
</body>
</html>