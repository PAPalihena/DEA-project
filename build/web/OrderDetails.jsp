<%-- 
    Document   : OrderDetails
    Created on : Sep 23, 2020, 11:14:05 AM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Event 4U</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
	
	<style>
	h1 {
  		color: green;
		}	
	p {
		color: white;
		
		}
		h2{
			color: forestgreen;
		}
                
                tr{ 
                    color: white;
                }
	
                .td{
                   text-align: center;
                }
                h3{
                    color: white;
                }
	</style>
	
	
</head>
<body style="background-color:black">

   
	
<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
  <!-- Brand -->
  <a class="navbar-brand" href="#"><img src="onlinelogomaker-062719-0050-9549-2000-transparent.png"</a>

  
</nav>
	
<nav class="navbar navbar-expand-sm bg-dark navbar-dark">

  <!-- Links -->
  <ul class="navbar-nav">
	  
	   <a class="navbar-brand" href="Homepage.jsp">EVENT 4U</a>
	  
    <li class="nav-item">
      <a class="nav-link" href="#">Home</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="Services.jsp">Service</a>
    </li>
	  <li class="nav-item">
      <a class="nav-link" href="#">Gallery</a>
    </li>
	  <li class="nav-item">
      <a class="nav-link" href="#">About us</a>
    </li>
	  <li class="nav-item">
      <a class="nav-link" href="#">Contact us</a>
    </li>

    <!-- Dropdown -->
    <li class="nav-item dropdown">
      <a class="nav-link dropdown-toggle" href="#" id="navbardrop" data-toggle="dropdown">
          User
      </a>
      <div class="dropdown-menu">
        <a class="dropdown-item" href="profile.jsp">Profile</a>
        <a class="dropdown-item" href="logoutServlet">Logout</a>
        
      </div>
    </li>
  </ul>
</nav>
<br>
 <div class="container">
     <div class="tb">
    <center> 
        <h1>Your Oder!</h1></br>
        <h3> Event Type </h3>: <%=session.getAttribute("type")%> </br>
        <h3>Event due date</h3> : <%= session.getAttribute("dueDate")%></br>
        <h3>Event Address </h3>: <%= session.getAttribute("address")%>;</br>
        <h3>Contact </h3>: <%= session.getAttribute("contact")%></br>   
        <h3>Budget </h3>: <%= session.getAttribute("budget")%></br>
        </br>
        </br>
        
        <a href="Homepage.jsp" style="text-decoration:none;"><button type="button" class="btn btn-outline-success"> Return to home</button> </a>    
        <a href="profile.jsp" style="text-decoration:none;"><button type="button" class="btn btn-outline-success"> View profile</button> </a>
        
        </br>
        </br>
    </center>
       
</div>     
    </div>
    </body>
</html>
