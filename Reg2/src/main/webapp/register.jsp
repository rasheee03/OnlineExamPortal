<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script type="text/javascript">
function validate(){
	var pass = document.getElementById("password").value;
	var pass1 = document.getElementById("password1").value;
	if(pass1===pass){
		form.submit();
	}
	else
		{
		alert("Password does not match");
		}
}
</script>

<title>Registration</title>


<link href='http://fonts.googleapis.com/css?family=Bitter' rel='stylesheet' type='text/css'>
<style type="text/css">


body{
	background:#AEE4FF;
}
.form-style-10{
	max-width:450px;
	padding:30px;
	margin:40px auto;
	background: #FFF;
	border-radius: 10px;
	-webkit-border-radius:10px;
	-moz-border-radius: 10px;
	box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.13);
	-moz-box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.13);
	-webkit-box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.13);
}
.form-style-10 .form-container .links-container a {
    margin-bottom: 10px;
    color: #2A88AD;
    font-size: 18px;
}


.form-style-10 .inner-wrap{
	padding: 30px;
	background: #F8F8F8;
	border-radius: 6px;
	margin-bottom: 15px;
}

.form-style-10 .inner-wrap svg {
	width: 20px;
	float: right;
	top: 8px;
    position: absolute;
    right: 10px;
	cursor: pointer;
}


.form-style-10 .form-container .button-section .btn-div {
	margin: auto;
	width: 100px;
}

.form-style-10 .form-container {

}

.form-style-10 h1{
	background: #2A88AD;
	padding: 20px 30px 15px 30px;
	margin: -30px -30px 30px -30px;
	border-radius: 10px 10px 0 0;
	-webkit-border-radius: 10px 10px 0 0;
	-moz-border-radius: 10px 10px 0 0;
	color: #fff;
	text-shadow: 1px 1px 3px rgba(0, 0, 0, 0.12);
	font: normal 30px 'Bitter', serif;
	-moz-box-shadow: inset 0px 2px 2px 0px rgba(255, 255, 255, 0.17);
	-webkit-box-shadow: inset 0px 2px 2px 0px rgba(255, 255, 255, 0.17);
	box-shadow: inset 0px 2px 2px 0px rgba(255, 255, 255, 0.17);
	border: 1px solid #257C9E;
}
.form-style-10 h1 > span{
	display: block;
	margin-top: 2px;
	font: 13px Arial, Helvetica, sans-serif;
}
.form-style-10 label{
	display: block;
	font: 13px Arial, Helvetica, sans-serif;
	color: #888;
	margin-bottom: 15px;
}
.form-style-10 input[type="text"],
.form-style-10 input[type="date"],
.form-style-10 input[type="datetime"],
.form-style-10 input[type="email"],
.form-style-10 input[type="number"],
.form-style-10 input[type="search"],
.form-style-10 input[type="time"],
.form-style-10 input[type="url"],
.form-style-10 input[type="password"],
.form-style-10 textarea,
.form-style-10 select {
	display: block;
	box-sizing: border-box;
	-webkit-box-sizing: border-box;
	-moz-box-sizing: border-box;
	width: 100%;
	padding: 8px;
	border-radius: 6px;
	-webkit-border-radius:6px;
	-moz-border-radius:6px;
	border: 2px solid #fff;
	box-shadow: inset 0px 1px 1px rgba(0, 0, 0, 0.33);
	-moz-box-shadow: inset 0px 1px 1px rgba(0, 0, 0, 0.33);
	-webkit-box-shadow: inset 0px 1px 1px rgba(0, 0, 0, 0.33);
}

.form-style-10 .section{
	font: normal 20px 'Bitter', serif;
	color: #2A88AD;
	margin-bottom: 5px;
}
.form-style-10 .section span {
	background: #2A88AD;
	padding: 5px 10px 5px 10px;
	position: absolute;
	border-radius: 50%;
	-webkit-border-radius: 50%;
	-moz-border-radius: 50%;
	border: 4px solid #fff;
	font-size: 14px;
	margin-left: -45px;
	color: #fff;
	margin-top: -3px;
}
.form-style-10 input[type="button"], 
.form-style-10 input[type="submit"]{
	margin-top: 30px;
	background: #2A88AD;
	padding: 8px 20px 8px 20px;
	border-radius: 5px;
	-webkit-border-radius: 5px;
	-moz-border-radius: 5px;
	color: #fff;
	text-shadow: 1px 1px 3px rgba(0, 0, 0, 0.12);
	font: normal 30px 'Bitter', serif;
	-moz-box-shadow: inset 0px 2px 2px 0px rgba(255, 255, 255, 0.17);
	-webkit-box-shadow: inset 0px 2px 2px 0px rgba(255, 255, 255, 0.17);
	box-shadow: inset 0px 2px 2px 0px rgba(255, 255, 255, 0.17);
	border: 1px solid #257C9E;
	font-size: 15px;
}
.form-style-10 input[type="button"]:hover, 
.form-style-10 input[type="submit"]:hover{
	background: #2A6881;
	-moz-box-shadow: inset 0px 2px 2px 0px rgba(255, 255, 255, 0.28);
	-webkit-box-shadow: inset 0px 2px 2px 0px rgba(255, 255, 255, 0.28);
	box-shadow: inset 0px 2px 2px 0px rgba(255, 255, 255, 0.28);
}

.form-style-10 .inner-wrap .add-option {
	margin: auto;
	position: absolute;
	width: 40%;
}
</style>
</head>

<body>

<div class="form-style-10">
<h1>Register</h1>
<form class="form-container" action="register.lti" method="post">
    <div class="section">Name</div>
    <div class="inner-wrap">
       <input type="text" name="name" pattern="[A-Za-z]{2,15}" placeholder="Enter your name" required/>
    </div>
    <div class="section">Email</div>
    <div class="inner-wrap">
        <input type="email" name="email" placeholder="Enter your email" required/>
    </div>
    <div class="section">Password</div>
    <div class="inner-wrap">
        <input type="password" name="password" id = "password" placeholder="Enter password" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{6,}" minlength = "8" maxlength = "15" required/>
    </div>
    <div class="section">Confirm password</div>
    <div class="inner-wrap">
        <input type="password" name="confirmPassword" id = "password1"  placeholder="Re-Enter password" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{6,}" minlength = "8" maxlength = "15"  required/>
    </div>
    <div class="section">Mobile no.</div>
    <div class="inner-wrap">
        <input type="number" name="mobile" pattern="[789][0-9]{9}" placeholder="Enter your mobile no" required/>
    </div>
    <div class="section">DOB</div>
    <div class="inner-wrap">
        <input type="date" name="dateOfBirth" placeholder="DOB" required/>
    </div>
    <div class="section">Qualification</div>
    <div class="inner-wrap">
        <select name="qualification">
            <option>B.E</option>
            <option>B.Tech</option>
            <option>BCA</option>
            <option>MCA</option>
        </select>
    </div>
    <div class="section">Year of passing</div>
    <div class="inner-wrap">
        <input type="date" name="yearOfCompletion" placeholder="YOP" required/>
    </div>
    <div class="section">City</div>
    <div class="inner-wrap">
        <input type="text" name="city" placeholder="Enter city" required />
    </div>
    <div class="section">State</div>
    <div class="inner-wrap">
        <input type="text" name="state" placeholder="Enter state" required/>
    </div>
    <div class="button-section">
        <div class="btn-div"> <input type="submit" name="Register"  onclick="validate()"  /></div>
    </div>
    <div class="links-container">
        <a href = "login.jsp">Login?</a> | <a href = "aboutus.jsp">About Us</a>
    </div>
</form>
</div>
</body>
</html>
    