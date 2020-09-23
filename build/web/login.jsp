<%-- 
    Document   : login
    Created on : Sep 20, 2020, 11:47:26 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
        <link rel="stylesheet" type="text/css" href="css/sign.css">
    </head>
    <body>
        <div class="loginbox">
		<img src="images/avatar.png" class="avatar">
		<h1>Log In Here</h1>
                <form action="loginServlet" method="post">
			<p>User Name</p>
			<input type="text" name="uname" placeholder="Enter Username">
			<p>Password</p>
			<input type="password" name="password" placeholder="Enter Password">
			<input type="Submit"  value="Login">
			</br>
			
		</form>
		
	</div>
    </body>
</html>
