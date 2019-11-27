
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Questions</title>
<link href='http://fonts.googleapis.com/css?family=Bitter' rel='stylesheet' type='text/css'>


<script type="text/javascript">
	function fun(){
		if(document.getElementById("chkOp1").checked==true){
			document.getElementById("chkOp1").value;
			document.getElementById("opt").value="1";
		}
		if(document.getElementById("chkOp1").checked==false){
			document.getElementById("chkOp1").value;
		//	document.getElementById("opt").value=null;

		}
		
		if(document.getElementById("chkOp2").checked==true){
			document.getElementById("chkOp2").value;
			document.getElementById("opt").value="2";
		}
		if(document.getElementById("chkOp2").checked==false){
			document.getElementById("chkOp2").value;
		//	document.getElementById("opt").value=null;

		}
		if(document.getElementById("chkOp3").checked==true){
			document.getElementById("chkOp3").value;
			document.getElementById("opt").value="3";
		}
		if(document.getElementById("chkOp3").checked==false){
			document.getElementById("chkOp3").value;

		//	document.getElementById("opt").value=null;

			
		}
		if(document.getElementById("chkOp4").checked==true){
			document.getElementById("chkOp4").value;
			document.getElementById("opt").value="4";
		}
		if(document.getElementById("chkOp4").checked==false){
			document.getElementById("chkOp4").value;

		}
	
		
	
		
		//document.getElementById("res").innerHTML=document.getElementById("chkOp1").value;
	}
</script>

<style>
body
{
background:#AEE4FF;
}

.form-style-10{
	padding:80px;
	margin:40px auto;
	background: #FFF;
	border-radius: 10px;
	-webkit-border-radius:10px;
	-moz-border-radius: 10px;
	box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.13);
	-moz-box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.13);
	-webkit-box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.13);
}


</style>
</head>
<body>
<div class ="form-style-10">
<form  method="post" action="question.lti" >
Question &nbsp &nbsp &nbsp<input type="text" name="question" /> <br /> 


Option 1:<input type="radio" id="chkOp1" name="chkOp"  onclick="fun()"  for="options[0].description"> <input type="text" name = "options[0].description" id="lbl1"><br/> 
Option 2:<input type="radio" id="chkOp2" name="chkOp"   onclick="fun()"  for="options[1].description"><input type="text" name = "options[1].description" id="lbl2"><br/>
Option 3:<input type="radio" id="chkOp3" name="chkOp"   onclick="fun()"  for="options[2].description"><input type="text" name = "options[2].description" id="lbl3"><br/>
Option 4:<input type="radio" id="chkOp4" name="chkOp"  onclick="fun()" for="options[3].description"><input type="text" name = "options[3].description" id="lbl4"><br/>

<input type="text" name="correct_ans" id="opt" value="answer"/>

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
</div>
</form>

</body>
</html>