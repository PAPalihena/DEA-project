<%-- 
    Document   : register
    Created on : Sep 21, 2020, 9:50:04 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/sign.css" rel="stylesheet" type="text/css">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    </head>
    <body>
        
	<div class="col-md-5 register-left">
		<img src="images/arrow.png">
		<h1>Join Us</h1>
		<p>Make your Specials days awesome with us</p>
	</div>
	<div class="col-md-7 register-right">
	
	</div>
	
		<div class="loginbox">
		<img src="images/avatar.png" class="avatar">
		<h1>Register Here</h1>
                <form action="RegisterServlet" method="post">
			<p>First name</p>
			<input type="text" name="fname" placeholder="Enter firstname">
			<p>Last name</p>
			<input type="text" name="lname" placeholder="Enter last name">
			<p>Email</p>
			<input type="text" name="email" placeholder="Enter email here">
 			<p>Username</p>
			<input type="password" name="uname" placeholder="Enter username">
                        <p>Password</p>
			<input type="password" name="password" placeholder="Enter Password">
			<input type="Submit" name="" value="Register">
			
			
		</form>
		</div>
    </body>
</html>
