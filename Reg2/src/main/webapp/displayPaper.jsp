<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Question Paper</title>
  <script language="javascript">
var tim;       
        var min = '20';
        var sec = '30';
        var f = new Date();

        function customSubmit(someValue){  
        	 document.questionForm.minute.value = min;   
        	 document.questionForm.second.value = sec; 
        	 document.questionForm.submit();  
        	 }  

        function examTimer() {
            if (parseInt(sec) >0) {

			    document.getElementById("showtime").innerHTML = "Time Remaining :"+min+" Minutes ," + sec+" Seconds";
                sec = parseInt(sec) - 1;                
                tim = setTimeout("examTimer()", 1000);
            }
            else {

			    if (parseInt(min)==0 && parseInt(sec)==0){
			    	document.getElementById("showtime").innerHTML = "Time Remaining :"+min+" Minutes ," + sec+" Seconds";
				     alert("Time Up");
				     document.questionForm.minute.value=0;
				     document.questionForm.second.value=0;
				     document.questionForm.submit();

			     }

                if (parseInt(sec) == 0) {				
				    document.getElementById("showtime").innerHTML = "Time Remaining :"+min+" Minutes ," + sec+" Seconds";					
                    min = parseInt(min) - 1;
					sec=59;
                    tim = setTimeout("examTimer()", 1000);
                }

            }
        }
</script>
</head>
<body onload="examTimer()"><div id="showtime"></div>


<form method="post" action="qp1.lti">
<h1 align="center" style="color:Blue"><font><strong>Questions</strong></font></h1>
<div style="border:solid 2px black;display:inline-block;"></div>

 <table  align="center" style="color:red" cellpadding="10" cellspacing="10" border="2.2">
		
<h1>Q.no <%= request.getAttribute("qno")%> </h1> 
	 	
		<tr>
		<td >${question.getQuestion()}</td>
		</tr>
		<c:forEach items="${question.options}" var="o">
		<tr>
		<td><input type="radio" name="selected_ans" >${o.getDescription()}</td>
		</tr>
		</c:forEach>
		
		<%if (request.getAttribute("index")==request.getAttribute("size"))
		{%>

<button type="button"><a href="exam_history.jsp">SUBMIT</a></button>
<%}


else
{ %>
<button type="submit">NEXT</button>
<%} %>
 
</table> 

</form>
</body>