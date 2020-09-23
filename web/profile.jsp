<%-- 
    Document   : profile
    Created on : Sep 22, 2020, 12:59:23 PM
    Author     : HP
--%>


<%@page import="java.text.ParseException"%>
<%@page import="java.util.logging.Logger"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.logging.Level"%>
<%@page import="java.sql.Date"%>
<%@page import="java.sql.SQLException"%>
<%@page import="EventSystem.UserBean"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="EventSystem.DbConnection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Profile </title>
        <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700" rel="stylesheet">
	<link href="css/user.css" rel="stylesheet" type="text/css">
        
        <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

    </head>
    <body>
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
        
        <%!
            Statement st;
            UserBean b2;
        %>
        
       
        <ul class="navbar-nav align-items-center d-none d-md-flex">
	 <div class="media align-items-center">
        <span class="avatar avatar-sm rounded-circle">
           <img alt="Image placeholder" src="download.png">
        </span>
        <div class="media-body ml-2 d-none d-lg-block">
            <span class="mb-0 text-sm  font-weight-bold">user name</span>
        </div>
     </div>
     </ul>

  <div class="main-content">
    <div class="container mt-7">
      <!-- Table -->
      <div class="row">
        <div class="col-xl-8 m-auto order-xl-1">
          <div class="card bg-secondary shadow">
            <div class="card-header bg-white border-0">
              <div class="row align-items-center">
                <div class="col-8">
                  <h3 class="mb-0">My account</h3>
                </div>
                <div class="col-4 text-right">
                  <a href="#!" class="btn btn-sm btn-primary">Edit profile</a>
                </div>
              </div>
            </div>
            <div class="card-body">
<!--               session.getAttribute("username") -->
                
   <%
        try{
            Connection con=DbConnection.getConnection();
            String query= "SELECT * FROM `user` WHERE username='"+session.getAttribute("username")+"'";
            st=con.createStatement();
            ResultSet rs=st.executeQuery(query);       
            if(rs.next())
            {
                
              %>
    <h1></h1>
                   
                
              <form>
                <h6 class="heading-small text-muted mb-4">User information</h6>
                <div class="pl-lg-4">
                  <div class="row">
                    <div class="col-lg-6">
                      <div class="form-group focused">
                        <label class="form-control-label" for="input-username">Username</label>
                       <input type="text" id="input-username" class="form-control form-control-alternative" placeholder="Username" value="<%= rs.getString("username") %>">
                      </div>
                    </div>
                    <div class="col-lg-6">
                      <div class="form-group">
                        <label class="form-control-label" for="input-email">Email address</label>
                        <input type="email" id="input-email" class="form-control form-control-alternative" placeholder=" "value="<%= rs.getString("email") %>">
                      </div>
                    </div>
                  </div>
                  <div class="row">
                    <div class="col-lg-6">
                      <div class="form-group focused">
                        <label class="form-control-label" for="input-first-name">First name</label>
                        <input type="text" id="input-first-name" class="form-control form-control-alternative" placeholder="First name" value="<%= rs.getString("fname") %>">
                      </div>
                    </div>
                    <div class="col-lg-6">
                      <div class="form-group focused">
                        <label class="form-control-label" for="input-last-name">Last name</label>
                        <input type="text" id="input-last-name" class="form-control form-control-alternative" placeholder="Last name" value="<%=rs.getString("lname") %>">
                      </div>
                    </div>
                  </div>
                </div>
                <hr class="my-4">
               
               <!-- Table -->
            <div class="table-responsive">
              <table class="table align-items-center table-flush">
                <thead class="thead-light">
                  <tr>
                    <th scope="col">Event ID</th>
                    <th scope="col">Event Type</th>
                    <th scope="col">Budget</th>
                    <th scope="col">Contact No</th>
                    <th scope="col">Status</th>
                    <th scope="col">Due date</th>
                    <th scope="col">Status</th>
                    
                    
                    
                  </tr>
                </thead>
                <tbody>
                    
                    <%
                        try{
            String query1= "SELECT * FROM `event`";
           Statement stst=con.createStatement();
            ResultSet rs1=stst.executeQuery(query1);       
            while(rs1.next())
            {
                    %>
                  
                  <tr>
                       
                    <td scope="row">
                      <div class="media align-items-center">
 
                        <div class="media-body">
                            <span class="mb-0 text-sm"> <%=rs1.getString("id")%></span>
                        </div>
                      </div>
                    </td>
                   <td scope="row">
                      <div class="media align-items-center">
 
                        <div class="media-body">
                            <span class="mb-0 text-sm"> <%=rs1.getString("type")%></span>
                        </div>
                      </div>
                    </td>
                    
                    <td scope="row">
                      <div class="media align-items-center">
 
                        <div class="media-body">
                            <span class="mb-0 text-sm"> <%=rs1.getString("budget")%></span>
                        </div>
                      </div>
                    </td>
                    
                    <td scope="row">
                      <div class="media align-items-center">
 
                        <div class="media-body">
                            <span class="mb-0 text-sm"> <%=rs1.getString("contactno")%></span>
                        </div>
                      </div>
                    </td>
                    
                    <td scope="row">
                      <div class="media align-items-center">
 
                        <div class="media-body">
                            <span class="mb-0 text-sm"> <%=rs1.getString("address")%></span>
                        </div>
                      </div>
                    </td>
                    
                    <td scope="row">
                      <div class="media align-items-center">
 
                        <div class="media-body">
                            <span class="mb-0 text-sm"> <%=rs1.getString("dueDate")%></span>
                        </div>
                      </div>
                    </td>
                    
                    
                    <td scope="row">
                        <%! 
                        String status=null;
                        %>
                        <% 
                        
                     String date=rs1.getString("dueDate");
                     
                     
                     SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
                     
                    java.util.Date date1 = sdf.parse(date);
                    
                     
         java.util.Date date2= new java.util.Date() ;  
 long miliday1 = date2.getTime();
  long miliday2=date1.getTime();
  
  if(miliday1>miliday2){  status="You have More Days";}
else{status="Successful !";}
                     
                     
//2020/9/22
 
                        
                        
                        %>
                        
                      <div class="media align-items-center">
 
                        <div class="media-body">
                            <span class="mb-0 text-sm"> <%=status%></span>
                        </div>
                      </div>
                    </td>
                    
                    
                    
                    
                    
                    
                    
                 </tr>
                 <%     }
        }
        catch(SQLException ex){
            out.println(ex);
        }%>
                 
                 
                 
                </tbody>
              </table>
            </div>
            </form> 
    
     <%  
                
//            b2.setFname(rs.getString("fname"));
//            b2.setLname(rs.getString("lname"));
//            b2.setEmail(rs.getString("email"));
//            b2.setUname(rs.getString("uname"));
            }
        }
        catch(SQLException ex){
            out.println(ex);
        }
        
        %>       
    
    
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
  <footer class="footer">

  </footer>
</body>
    </body>
</html>
