<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="AddQuestions.jsp">
Select course <br/>

java  <input type="radio"  name="cName"  value="java"  id="1"><br />
c++ <input type="radio"  name="cName"   value="c++"  id="2"> <br />
python <input type="radio"  name="cName" value="python"   id="3"> <br />
Dbms <input type="radio"  name="cName"  value="Dbms"  id="4"> <br />

<input type="submit" value="select">
</form>
</body>
</html>