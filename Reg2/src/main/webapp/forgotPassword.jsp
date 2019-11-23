<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container"
		style="height: 290px; width: 450px; background-color: #DCDCDC; border: 2px; text-align: center; position: absolute; top: 50%; left: 50%; transform: translate(-50%, -50%);">

		<h1>Forgot Password</h1>

		<div class="info">
			<p>Please enter your email address below and we will send you
				information to change your password.</p>
			<form action="sendMail.lti" method="post">
				<label>Email Address</label><br> <br> <input name="email"
					type="text"><br> <br>
				
				<div class="input-group1">
					<input class="form-control" type="submit" value="Submit">
				</div>

			</form>
		</div>

	</div>


</body>
</html>