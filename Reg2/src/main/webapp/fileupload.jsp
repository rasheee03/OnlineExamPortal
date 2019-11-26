<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>


<script type="text/javascript">
function myFunction() {
	if(file.getOriginalFilename()==!null)
	  alert("You have succesfully uploaded the file");
	  }

</script>

<body >
<form method="post" action="fileupload.lti" enctype="multipart/form-data">
Hello Admin
<br><br>
<br><br>
<br><br>
<input type="file" name="QuestionFile" >
<br><br>
<input type="submit" value="Upload" onclick="myFunction()"><br><br>
<br><br>
<br><br>


</body>
</form>

</body>
</html>