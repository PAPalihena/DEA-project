<%-- 
    Document   : birthday-party
    Created on : Sep 22, 2020, 2:27:29 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
<br>
</br>
<center>
        <h2>Bridal Show</h2>

   <P>Our mission is to make the process of planning your event smoot stress free and most of all fun!</P>
</center>
 
<div id="demo" class="carousel slide" data-ride="carousel">
  <ul class="carousel-indicators">
    <li data-target="#demo" data-slide-to="0" class="active"></li>
    <li data-target="#demo" data-slide-to="1"></li>
    <li data-target="#demo" data-slide-to="2"></li>
  </ul>
  <div class="carousel-inner">
    <div class="carousel-item active">
      <img src="bridal\alasdair-elmes-ULHxWq8reao-unsplash.jpg" alt="Los Angeles" width="1100" height="500">
      <div class="carousel-caption">
        <h3>Bridal Show</h3>
        <p>We make you special day more special just for you!</p>
      </div>   
    </div>
    <div class="carousel-item">
      <img src="bridal\analise-benevides-gWedi4SWsHQ-unsplash.jpg" alt="Chicago" width="1100" height="500">
      <div class="carousel-caption">
        <h3>Bridal Show</h3>
        <p>We make you special day more special just for you!</p>
      </div>   
    </div>
    <div class="carousel-item">
      <img src="bridal\jeremy-wong-weddings-K41SGnGKxVk-unsplash(1).jpg" alt="New York" width="1100" height="500">
      <div class="carousel-caption">
        <h3>Bridal Show</h3>
        <p>We make you special day more special just for you!</p>
      </div>   
    </div>
  </div>
  <a class="carousel-control-prev" href="#demo" data-slide="prev">
    <span class="carousel-control-prev-icon"></span>
  </a>
  <a class="carousel-control-next" href="#demo" data-slide="next">
    <span class="carousel-control-next-icon"></span>
  </a>
</div>
<br>
<div align="center">
  

   <div class="new">
       <form action="priceServlet" method="get">     
  <table border="0"><tr>
  <tr><td><input type="checkbox" name="compo" value="Gas Balloons">
  <label for="feartures1"> Gas Ballons</label></td><td>=Rs.3000</td></tr>
  <tr><td><input type="checkbox" name="compo" value="Face Painting">
  <label for="feartures2">Face Painting </label></td><td>=Rs.4000</td></tr>
  <tr><td><input type="checkbox" name="compo" value="Food and Beverages">
  <label for="feartures3"> Food and Beverages</label></td><td>=Rs.30000</td></tr>
  <tr><td><input type="checkbox" name="compo" value="Magic Show">
  <label for="feartures4"> Magic Show</label></td><td>=Rs.3000</td></tr>
  <tr><td><input type="checkbox" name="compo" value="Music">
  <label for="feartures5"> Music</label></td><td>=Rs.2000</td></tr>
  <tr><td><input type="checkbox" name="compo" value="Candies">
  <label for="feartures6"> Candies</label></td><td>=Rs.1000</td></tr>
  <tr><td><input type="checkbox" name="compo" value="Bounzers">
  <label for="feartures7"> Bounzers</label></td><td>=Rs.3000</td></tr>
  <tr> <td> <input type="hidden" value="Bridal Show" name="type"></td></tr>
  <tr><td><input type="submit" value="Submit"></td></tr>
</table>
</form>
 
 <br>





</div>
    </body>
</html>
