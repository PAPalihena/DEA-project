<%-- 
    Document   : eventinfo
    Created on : Sep 23, 2020, 8:52:12 AM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Event info</title>
    </head>
    <body>
        
        <!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
       

  <style>
  h2 {
  text-shadow: 2px 2px 5px red;
  text-align: center;
  font-family: georgia,garamond,serif;
  font-style:italic;
}
</style>
    </head>
    <body>
        <div class="container">
  
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
                table{
                        color:aqua;
                    
                }    
                .infor{
                    
                    color: white;
                    font-size: 23px;   
                    
                }   
                
                form{
                    align-content: center;
                }
	
	</style>
	
	
</head>
<body style="background-color:black;" >

	
<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
  <!-- Brand -->
  <a class="navbar-brand" href="#"><img src="onlinelogomaker-062719-0050-9549-2000-transparent.png"</a>

  
</nav>
	
<nav class="navbar navbar-expand-sm bg-dark navbar-dark">

  <!-- Links -->
  <ul class="navbar-nav">
	  
	   <a class="navbar-brand" href="#">EVENT 4U</a>
	  
    <li class="nav-item">
      <a class="nav-link" href="#">Home</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="#">Service</a>
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
        <a class="dropdown-item" href="#">Profile</a>
        <a class="dropdown-item" href="#">Log Out</a>
        
      </div>
    </li>
  </ul>
</nav>
    </br>
    </br>
    </br>
    <div class="infor">
        Your function type : <%=session.getAttribute("type")%></br>
        Your total budget: <%=session.getAttribute("budget")%> </br>
        
    
        <form action="eventServlet" method="get">
            <table>
                <tr>
                <td>Contact : <input type="text" name="contact"></td> 
                <td>Address : <input type="text" name="address"> </td> </br>
                <td>Due date : <input type="text" name="dueDate" placeholder="yyyy-mm-dd"></td> </br>
            </tr>
            </table>
            </br>
            
            <input type="submit" value="Place Order">
            
        </form>
        </br></br>
     </div>           
        
    </body>
</html>
