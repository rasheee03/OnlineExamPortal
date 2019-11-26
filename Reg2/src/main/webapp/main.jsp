<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Form Style 10</title>
<link href='http://fonts.googleapis.com/css?family=Bitter' rel='stylesheet' type='text/css'>
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
	<link rel="stylesheet" href="reset.css">

	<link rel="stylesheet" href="sidenav.css">
	<link rel="stylesheet" href="style3.css">
<style type="text/css">
body{
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

.form-style-10 .inner-wrap{
	padding: 30px;
	background: #F8F8F8;
	border-radius: 6px;
	margin-bottom: 15px;
}
.form-style-10 .form-container {
    display: inline-block;
    width: 100%;
}
.form-style-10 .form-container .option {
    display: inline-block;
    border: 2px solid #3d9ae2;
    height: 200px;
    width: 47%;
    text-align: center;
}

.form-style-10 .form-container .option-div {
    padding: 40px;
    font-size: 18px;
    color: #3d9ae2;
    cursor: pointer;
}
.form-style-10 h1 > span{
	display: block;
	margin-top: 2px;
	font: 13px Arial, Helvetica, sans-serif;
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


    a { color: #aeecff; } /* CSS link color */

</style>
</head>

<body>

<!-- Navbar -->
	<div id="main">

      
		<!-- TOPNAV -->
		<div class="icon-bar">
                
      <span><a href="Landing_Page.jsp" style="color: aliceblue;">
        <img src = "bkc.png"  height="60" width="65"  ></a></span>
        <center><h1>Online Examination System</h1></center>
        <div class="signin">
        
            <span style="float: right;"><a href="registration.html" style="color: rgb(37, 24, 214);">Sign Up</a></span>
            <span style="float: right;"><a href="loginpage.html" style="color: rgb(37, 24, 214)">Sign In</a></span>
        </div>
    </div>
        <span style="font-size:30px;cursor:pointer" onclick="openNav()">&#9776; </span>
       
                <span class="admin-btn" style="float: right;"><a href="loginpage.html" style="color: blue;">Admin Login</a></span>
               

	</div> 


	
    <!-- SIDENAV -->
    <div id="mySidenav" class="sidenav">
		<a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
    <a href="Landing_Page.jsp">Home</a>
    <a href="Registration.jsp">Registration</a>
    <a href="Login.jsp">Login</a>
		<a href="Userprofile.jsp">User Profile</a>
		<a href="AboutUs.jsp">About Us</a>
    <a href="ContactUs.jsp">Contact Us</a>
</div>
     <div class=><img src="onlineexam.jpg"></div>
   

</body>
<script src="app.js"></script>

</html>
    