<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE HTML>
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


  a { color: #3d9ae2;
  font-size: 18px;
  font-type:bold; }  /*CSS link color */
</style>
</head>

<body>

<!-- Navbar -->
	<div id="main">

      
		<!-- TOPNAV -->
		<div class="icon-bar">
      <span><a href="Landing_Page.jsp" style="color: aliceblue;">
        <img src = "logo-online-test.png" alt = "image" height="60" width="65"  ></a></span>
			<span style="float: right;"><a href="Landing_Page.jsp" style="color: aliceblue;">Logout</a></span>
		</div>
		<span style="font-size:30px;cursor:pointer" onclick="openNav()">&#9776; </span>

	</div> 


	<div id="mySidenav" class="sidenav">
    <!-- SIDENAV -->
    
	<a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
    <a href="home.jsp">Home</a>
    <a href="aboutus.jsp">About Us</a>
	<a href="userprofile.jsp">User Profile</a>
	<a href="contactus.jsp">Contact Us</a>
    
	</div>

<div class="form-style-10">
<form class="form-container">
    <div class="option" style="margin-right: 30px;">
        <div class="option-div">
            <svg id="Capa_1" enable-background="new 0 0 551.13 551.13" height="50" viewBox="0 0 551.13 551.13" width="50" xmlns="http://www.w3.org/2000/svg"><path d="m275.531 172.228-.05 120.493c0 4.575 1.816 8.948 5.046 12.177l86.198 86.181 24.354-24.354-81.153-81.136.05-113.361z" /><path d="m310.011 34.445c-121.23 0-221.563 90.033-238.367 206.674h-71.644l86.114 86.114 86.114-86.114h-65.78c16.477-97.589 101.355-172.228 203.563-172.228 113.966 0 206.674 92.707 206.674 206.674s-92.707 206.674-206.674 206.674c-64.064 0-123.469-28.996-162.978-79.555l-27.146 21.192c46.084 58.968 115.379 92.808 190.124 92.808 132.955 0 241.119-108.181 241.119-241.119s-108.164-241.119-241.119-241.12z" fill="#3d9ae2"/>
            </svg>
             
        <div><span><a href="exam_history.jsp">Exam history</a></span></div></div>
    </div>
    <div class="option">
        <div class="option-div">
            <?xml version="1.0" ?>
            <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 64 64" width="50" height="50"><g id="Shipping-3" data-name="Shipping"><polygon points="51.53 53.41 49.45 61.14 34 57 36.07 49.27 38 49.79 49.59 52.9 49.59 52.89 51.53 53.41" style="fill:#bddbff" /><path d="M42,18V31a1,1,0,0,1-1,1H23a1,1,0,0,1-1-1V18h8v4h4V18Z" style="fill:#bddbff" /><polygon points="27.93 49.27 30 57 14.55 61.14 12.47 53.41 14.41 52.89 14.41 52.9 26 49.79 27.93 49.27" style="fill:#bddbff" /><path d="M28.9,49.014a1,1,0,0,0-1.225-.707l-.966.259-1.8-6.713a1.016,1.016,0,0,0-.258-.448l-9.759-9.758a4.009,4.009,0,0,0-3.374-1.132L9.8,24.107a4,4,0,1,0-7.727,2.072l5.694,21.25a1.009,1.009,0,0,0,.373.547l4.876,3.586.168.627-.966.259a1,1,0,0,0-.707,1.225L13.58,61.4a1,1,0,0,0,.965.742.967.967,0,0,0,.259-.035l15.455-4.14a1,1,0,0,0,.707-1.225ZM14.854,50.705a1,1,0,0,0-.373-.547L9.606,46.572,4,25.661a2,2,0,0,1,3.864-1.036L9.654,31.3a4.318,4.318,0,0,0-.426.352,4.013,4.013,0,0,0,0,5.658l8.083,8.083,1.415-1.414-8.083-8.083a2.007,2.007,0,0,1-.008-2.824,1.848,1.848,0,0,1,.569-.391c.032-.014.063-.03.093-.046a1.19,1.19,0,0,1,.244-.086,2,2,0,0,1,1.933.518l9.568,9.566,1.73,6.455-9.66,2.589Zm.4,9.211L13.7,54.121l.966-.259h0l1.918-.514L27.223,50.5l1.552,5.8Z" style="fill:#3d9ae2" /><path d="M61.531,23.143a4,4,0,0,0-7.329.964l-1.717,6.408a4.016,4.016,0,0,0-3.374,1.132l-9.759,9.758a1.016,1.016,0,0,0-.258.448l-1.8,6.713-.966-.259a1,1,0,0,0-1.225.707l-2.07,7.727a1,1,0,0,0,.707,1.225L49.2,62.106a.972.972,0,0,0,.259.035,1,1,0,0,0,.965-.742l2.071-7.726a1,1,0,0,0-.707-1.225l-.966-.259.168-.627,4.876-3.586a1.009,1.009,0,0,0,.373-.547l5.694-21.25A3.977,3.977,0,0,0,61.531,23.143ZM48.748,59.916,35.225,56.293l1.552-5.8,10.64,2.851,1.918.514h0l.966.259ZM60,25.661l-5.6,20.911-4.875,3.586a1,1,0,0,0-.373.547l-.259.967-9.66-2.589,1.73-6.455,9.568-9.566a2.015,2.015,0,0,1,1.934-.518,1.2,1.2,0,0,1,.243.086c.03.016.061.032.093.046a1.815,1.815,0,0,1,.559.382,2.009,2.009,0,0,1,0,2.833l-8.084,8.083,1.414,1.414,8.084-8.083a4.015,4.015,0,0,0-.009-5.667,4.168,4.168,0,0,0-.416-.344l1.787-6.669A2,2,0,1,1,60,25.661Z" style="fill:#3d9ae2" /><path d="M23,33H41a2,2,0,0,0,2-2V15a2,2,0,0,0-2-2H23a2,2,0,0,0-2,2V31A2,2,0,0,0,23,33Zm0-2V19h6v3a1,1,0,0,0,1,1h4a1,1,0,0,0,1-1V19h6V31ZM41,17H35V15h6Zm-8-2v6H31V15Zm-4,0v2H23V15Z" style="fill:#3d9ae2" /><rect x="35" y="27" width="4" height="2" style="fill:#3d9ae2" /><rect x="31" y="27" width="2" height="2" style="fill:#3d9ae2" /><path d="M49,9.414V19h2V9.414l2.536,2.535,1.414-1.414L50.707,6.293a1,1,0,0,0-1.414,0L45.05,10.535l1.414,1.414Z" style="fill:#3d9ae2" /><path d="M31,5.414V11h2V5.414l2.536,2.535L36.95,6.535,32.707,2.293a1,1,0,0,0-1.414,0L27.05,6.535l1.414,1.414Z" style="fill:#3d9ae2" /><path d="M13,9.414V19h2V9.414l2.536,2.535,1.414-1.414L14.707,6.293a1,1,0,0,0-1.414,0L9.05,10.535l1.414,1.414Z" style="fill:#3d9ae2" /><rect x="13" y="21" width="2" height="2" style="fill:#3d9ae2" /><rect x="49" y="21" width="2" height="2" style="fill:#3d9ae2" /></g></svg>
            <div>  <span id="myBtn"><a href="instructions.jsp"> <b>New Exam </b></a></span></div>
        </div>
    </div>
</form>
</div>
</body>
<script src="app.js"></script>

</html>
    