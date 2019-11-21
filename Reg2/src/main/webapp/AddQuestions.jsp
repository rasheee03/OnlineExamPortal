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

<input type="text" name = "options[0].description" for="op1"/> <br/>
<input type="text" name = "options[1].description" for="op2"/> <br/>
<input type="text" name = "options[2].description" for="op3"/> <br/>
<input type="text" name = "options[3].description" for="op4"/> <br/>

<input type="radio"  name="level" value="1" id="l1"></input> </input> level 1
 <input type="radio"  name="level" value="2"  id="l2"></input> </input>level 2
 <input type="radio"  name="level" value="3" id="l3"></input> </input> level 3
 
 Course ID : 
 <input type="text" name="courses.id" />

 <button type="submit" > Add Question</button>
</form>

</body>
</html>