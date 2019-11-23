<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
	function fun(){
		if(document.getElementById("chkOp1").checked==true){
			document.getElementById("chkOp1").value="Y";
			document.getElementById("opt").value=document.getElementById("lbl1").value="Y";
		}
		if(document.getElementById("chkOp1").checked==false){
			document.getElementById("chkOp1").value="N";
		}
		
		if(document.getElementById("chkOp2").checked==true){
			document.getElementById("chkOp2").value="Y";
			//document.getElementById("opt").value=document.getElementById("lbl2").value;
		}
		if(document.getElementById("chkOp2").checked==false){
			document.getElementById("chkOp2").value="N";
		}
		if(document.getElementById("chkOp3").checked==true){
			document.getElementById("chkOp3").value="Y";
			//document.getElementById("opt").value=document.getElementById("lbl3").value;
		}
		if(document.getElementById("chkOp3").checked==false){
			document.getElementById("chkOp3").value="N";
		}
		if(document.getElementById("chkOp4").checked==true){
			document.getElementById("chkOp4").value="Y";
			//document.getElementById("opt").value=document.getElementById("lbl4").value;
		}
		if(document.getElementById("chkOp4").checked==false){
			document.getElementById("chkOp4").value="N";
		}
		
	
		
		//document.getElementById("res").innerHTML=document.getElementById("chkOp1").value;
	}
</script>
</head>
<body>
<form method="post" action="question.lti" >
Enter Question <input type="text" name="question" /> <br /> 

Options:
<input type="checkbox" id="chkOp1" name="chkOp1"  onclick="fun()"  for="options[0].description"> <input type="text" name = "options[0].description" id="lbl1"><br/> 
<input type="checkbox" id="chkOp2" name="chkOp2"   onclick="fun()"  for="options[1].description"><input type="text" name = "options[1].description" id="lbl2"><br/>
<input type="checkbox" id="chkOp3" name="chkOp3"   onclick="fun()"  for="options[2].description"><input type="text" name = "options[2].description" id="lbl3"><br/>
<input type="checkbox" id="chkOp4" name="chkOp4"  onclick="fun()" for="options[3].description"><input type="text" name = "options[3].description" id="lbl4"><br/>

<input type="text" name="correct_ans" id="opt" value="res opt"/>

<input type="radio"  name="level" value="1" id="l1"></input>  level 1
 <input type="radio"  name="level" value="2"  id="l2"></input> level 2
 <input type="radio"  name="level" value="3" id="l3"></input>  level 3
 <!-- <input type="checkbox" name="isCorrectAnswer" value=""
 Course ID : 
  -->
 <select name="courses_id">
  <option  value="1">java</option>
  <option value="2">python</option>
  <option value="3">cpp</option>
  <option value="4">dbms</option>
  <option value="5">html</option>
  
</select>

 <button type="submit" > Add Question</button>
 <div id="res">
 	 
 	 
 	 
 	 
 </div>
</form>

</body>
</html>