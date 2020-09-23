<%-- 
    Document   : Homepage
    Created on : Sep 22, 2020, 11:56:17 AM
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
      <a class="nav-link" href="aboutus.jsp">About us</a>
    </li>
	  <li class="nav-item">
      <a class="nav-link" href="contactus.jsp">Contact us</a>
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
 
<br>
  
	
<div class="container">
  
	<div id="demo" class="carousel slide" data-ride="carousel">
  <ul class="carousel-indicators">
    <li data-target="#demo" data-slide-to="0" class="active"></li>
    <li data-target="#demo" data-slide-to="1"></li>
    <li data-target="#demo" data-slide-to="2"></li>
  </ul>
  <div class="carousel-inner">
    <div class="carousel-item active">
      <img src="dave-lastovskiy-RygIdTavhkQ-unsplash.jpg" alt="Los Angeles" width="1100" height="500">
      <div class="carousel-caption">
        <h3>Birthday party</h3>
        <p>We had such a great time in LA!</p>
      </div>   
    </div>
    <div class="carousel-item">
      <img src="h3.jpg" alt="Chicago" width="1100" height="500">
      <div class="carousel-caption">
        <h3>Halloween Party</h3>
        <p>Thank you, Chicago!</p>
      </div>   
    </div>
    <div class="carousel-item">
      <img src="images1.jpg" alt="New York" width="1100" height="500">
      <div class="carousel-caption">
        <h3>Bridle Party</h3>
        <p>We love the Big Apple!</p>
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

	</br></br></br>
	<div align="center">
			<h1>Welcome to Event 4U</h1>

			<p>we are always keen on creating unforgetable memories</p>
                        <a href="register.jsp"><button type="button" class="btn btn-outline-success">Register</button></a>
                        <a href="login.jsp"<button type="button" class="btn btn-outline-success">Log In</button></a>
		
		
		</br>
		</br>
		</br>
		
	
		<p>EVENT 4U is an event logistics and marketing company.The company offers A-Z event planning services from a team of experienced and energetic event planners,suppliers,venues and more..with the number of events we organize,Event planing for you does not need to add exorbitant fees and mark-ups to make its profit margins.This ensure that our client list,which is constantly growing,make regular use of our services...</p>

		<p>......The EVENT 4U team is made up for a mix of people.A large support team helps out in everything the company does, in office work to on-site logistics planning......</p>
	
	</br>
</br>
</br>
	
  <h2>Comments</h2>
  <p>Please send your comments that you feel this site.</p>   
  
    
    
    
  <form action="commentServlet" method="post" >
  <table class="table table-dark" aline='center'>
      <tr>
          <td>Full name</td> 
          <td><input type="text" name="name"></td>
      </tr>
       
      <tr>
          <td>Email</td> 
      <td><input type="text" name="email"></td>
      </tr>
      
      <tr>
          <td>comment</td> 
          <td><textarea rows="4" cols="50" name="comment"> Enter comment here...</textarea></td>
      </tr>
      
      <tr>
          
          <td></td>
          <td> <input type="submit" value="Post"></td>
      </tr>
    </form>
</table>         
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>	
<%
String id = request.getParameter("userid");
String driver = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/";
String database = "eventsystem";
String userid = "root";
String password = "";
try {
Class.forName(driver);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}
Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%>


<%
try{
connection = DriverManager.getConnection(connectionUrl+database, userid, password);
statement=connection.createStatement();
String sql ="select * from commentbox";
resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>
<div style="color:white;text-align: left;margin-left: 500px;">
 <%=resultSet.getString("Fullname") %></br>
<%=resultSet.getString("Email") %></br>
<%=resultSet.getString("Comment") %></br>
</br>
</div>
<%
}
connection.close();
} catch (Exception e) {
e.printStackTrace();
}
%>
		
</div>



</body>
</html>
