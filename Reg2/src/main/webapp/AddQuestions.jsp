<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="question.lti" >
Enter Question <input type="text" name="question" /> <br /> 

 <input type="checkbox" name="op"  id="op1">
<input type="text" for="op1"/> <br/>
<input type="checkbox" name="op"  id="op2">
<input type="text" for="op2"/> <br/>
<input type="checkbox" name="op" id="op3">
<input type="text" for="op3"/> <br/>
<input type="checkbox" name="op"  id="op4">
<input type="text" for="op4"/> <br/>

<input type="radio"  name="level"  id="l1"></input> </input> level 1
 <input type="radio"  name="level"   id="l2"></input> </input>level 2
 <input type="radio"  name="level"  id="l3"></input> </input> level 3
 

 <button type="submit" > Add Question</button>
</form>

</body>
</html>