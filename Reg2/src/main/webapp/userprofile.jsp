<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
    <style type="text/css">
        #ProfilePage
        {
            /* Move it off the top of the page, then centre it horizontally */
            margin: 50px auto;
            width: 635px;
        
        /* For visibility. Delete me */
        border: 1px solid red;
        }
        
        #LeftCol
        {
            /* Move it to the left */
            float: left;
        
            width: 200px;
            text-align: center;
        
            /* Move it away from the content */
            margin-right: 20px;
        
        /* For visibility. Delete me */
        border: 1px solid brown;
        }
        
        #Photo
        {
            /* Width and height of photo container */
            width: 200px;
            height: 200px;
        
        /* For visibility. Delete me */
        border: 1px solid green;
        }
        
        #PhotoOptions
        {
            text-align: center;
            width: 200px;
        
        /* For visibility. Delete me */
        border: 1px solid brown;
        }
        
        #Info
        {
            width: 400px;
            text-align: center;
        
            /* Move it to the right */
            float: right;
        
        /* For visibility. Delete me */
        border: 1px solid blue;
        }
        
        #Info strong
        {
            /* Give it a width */
            display: inline-block;
            width: 100px;
        
        /* For visibility. Delete me */
        border: 1px solid orange;
        }
        
        #Info span
        {
            /* Give it a width */
            display: inline-block;
            width: 250px;
        
        /* For visibility. Delete me */
        border: 1px solid purple;
        }
        </style>
        
      <!--  <div id="ProfilePage">
            <div id="LeftCol">
                <div id="Photo"></div>
                <div id="ProfileOptions">
                a
                </div>
            </div>-->
        
            <div id="Info">
                <p>
                    <strong>Name:</strong>
                    <span>Mayank</span>
                </p>
                <p>
                    <strong>Email:</strong>
                    <span>mayankmallajaipur97@gmail.com</span>
                </p>
                <p>
                    <strong>Password</strong>
                    <span>Mayank@123</span>
                </p>
                <p>
                    <strong>Qualification</strong>
                    <span>Btech</span>
                </p>
                <p>
                    <strong>City</strong>
                    <span>Pune</span>
                </p>
                
                <p>
                    <strong>Date of Birth</strong>
                    <span>23/11/1997</span>
                </p>
            </div>
        
            <!-- Needed because other elements inside ProfilePage have floats -->
            <div style="clear:both"></div>
        </div>
</body>
</html>