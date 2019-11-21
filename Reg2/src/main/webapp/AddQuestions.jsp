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

Options:
<input type="checkbox" name="isCorrectAnswer" value="N" for="options[0].description"> <input type="text" name = "options[0].description" > <br/>
<input type="checkbox" name="isCorrectAnswer" value="N" for="options[1].description"> <input type="text" name = "options[1].description" > <br/>
<input type="checkbox" name="isCorrectAnswer" value="Y" for="options[2].description"><input type="text" name = "options[2].description" > <br/>
<input type="checkbox" name="isCorrectAnswer" value="N" for="options[3].description"><input type="text" name = "options[3].description" > <br/>

<input type="radio"  name="level" value="1" id="l1"></input>  level 1
 <input type="radio"  name="level" value="2"  id="l2"></input> level 2
 <input type="radio"  name="level" value="3" id="l3"></input>  level 3
 <input type="checkbox" name="isCorrectAnswer" value=""
 Course ID : 
 
 <select name="courses.id">
  <option value="1">java</option>
  <option value="2">python</option>
  <option value="3">cpp</option>
  <option value="4">dbms</option>
  <option value="5">html</option>
  
</select>

 <button type="submit" > Add Question</button>
</form>

</body>
</html>