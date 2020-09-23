package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.ParseException;
import java.util.logging.Logger;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.sql.Date;
import java.sql.SQLException;
import EventSystem.UserBean;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import EventSystem.DbConnection;

public final class profile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


            Statement st;
            UserBean b2;
        
 
                        String status=null;
                        
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Profile </title>\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700\" rel=\"stylesheet\">\n");
      out.write("\t<link href=\"css/user.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        \n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar navbar-expand-sm bg-dark navbar-dark\">\n");
      out.write("  <!-- Brand -->\n");
      out.write("  <a class=\"navbar-brand\" href=\"#\"><img src=\"onlinelogomaker-062719-0050-9549-2000-transparent.png\"</a>\n");
      out.write("\n");
      out.write("  \n");
      out.write("</nav>\n");
      out.write("\t\n");
      out.write("<nav class=\"navbar navbar-expand-sm bg-dark navbar-dark\">\n");
      out.write("\n");
      out.write("  <!-- Links -->\n");
      out.write("  <ul class=\"navbar-nav\">\n");
      out.write("\t  \n");
      out.write("\t   <a class=\"navbar-brand\" href=\"#\">EVENT 4U</a>\n");
      out.write("\t  \n");
      out.write("    <li class=\"nav-item\">\n");
      out.write("      <a class=\"nav-link\" href=\"#\">Home</a>\n");
      out.write("    </li>\n");
      out.write("    <li class=\"nav-item\">\n");
      out.write("      <a class=\"nav-link\" href=\"#\">Service</a>\n");
      out.write("    </li>\n");
      out.write("\t  <li class=\"nav-item\">\n");
      out.write("      <a class=\"nav-link\" href=\"#\">Gallery</a>\n");
      out.write("    </li>\n");
      out.write("\t  <li class=\"nav-item\">\n");
      out.write("      <a class=\"nav-link\" href=\"#\">About us</a>\n");
      out.write("    </li>\n");
      out.write("\t  <li class=\"nav-item\">\n");
      out.write("      <a class=\"nav-link\" href=\"#\">Contact us</a>\n");
      out.write("    </li>\n");
      out.write("\n");
      out.write("    <!-- Dropdown -->\n");
      out.write("    <li class=\"nav-item dropdown\">\n");
      out.write("      <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbardrop\" data-toggle=\"dropdown\">\n");
      out.write("        User\n");
      out.write("      </a>\n");
      out.write("      <div class=\"dropdown-menu\">\n");
      out.write("        <a class=\"dropdown-item\" href=\"#\">Profile</a>\n");
      out.write("        <a class=\"dropdown-item\" href=\"#\">Log Out</a>\n");
      out.write("        \n");
      out.write("      </div>\n");
      out.write("    </li>\n");
      out.write("  </ul>\n");
      out.write("</nav>\n");
      out.write("<br>\n");
      out.write("        \n");
      out.write("        ");
      out.write("\n");
      out.write("        \n");
      out.write("       \n");
      out.write("        <ul class=\"navbar-nav align-items-center d-none d-md-flex\">\n");
      out.write("\t <div class=\"media align-items-center\">\n");
      out.write("        <span class=\"avatar avatar-sm rounded-circle\">\n");
      out.write("           <img alt=\"Image placeholder\" src=\"download.png\">\n");
      out.write("        </span>\n");
      out.write("        <div class=\"media-body ml-2 d-none d-lg-block\">\n");
      out.write("            <span class=\"mb-0 text-sm  font-weight-bold\">user name</span>\n");
      out.write("        </div>\n");
      out.write("     </div>\n");
      out.write("     </ul>\n");
      out.write("\n");
      out.write("  <div class=\"main-content\">\n");
      out.write("    <div class=\"container mt-7\">\n");
      out.write("      <!-- Table -->\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-xl-8 m-auto order-xl-1\">\n");
      out.write("          <div class=\"card bg-secondary shadow\">\n");
      out.write("            <div class=\"card-header bg-white border-0\">\n");
      out.write("              <div class=\"row align-items-center\">\n");
      out.write("                <div class=\"col-8\">\n");
      out.write("                  <h3 class=\"mb-0\">My account</h3>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-4 text-right\">\n");
      out.write("                  <a href=\"#!\" class=\"btn btn-sm btn-primary\">Edit profile</a>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"card-body\">\n");
      out.write("<!--               session.getAttribute(\"username\") -->\n");
      out.write("                \n");
      out.write("   ");

        try{
            Connection con=DbConnection.getConnection();
            String query= "SELECT * FROM `user` WHERE username='"+session.getAttribute("username")+"'";
            st=con.createStatement();
            ResultSet rs=st.executeQuery(query);       
            if(rs.next())
            {
                
              
      out.write("\n");
      out.write("    <h1></h1>\n");
      out.write("                   \n");
      out.write("                \n");
      out.write("              <form>\n");
      out.write("                <h6 class=\"heading-small text-muted mb-4\">User information</h6>\n");
      out.write("                <div class=\"pl-lg-4\">\n");
      out.write("                  <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-6\">\n");
      out.write("                      <div class=\"form-group focused\">\n");
      out.write("                        <label class=\"form-control-label\" for=\"input-username\">Username</label>\n");
      out.write("                       <input type=\"text\" id=\"input-username\" class=\"form-control form-control-alternative\" placeholder=\"Username\" value=\"");
      out.print( rs.getString("username") );
      out.write("\">\n");
      out.write("                      </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-6\">\n");
      out.write("                      <div class=\"form-group\">\n");
      out.write("                        <label class=\"form-control-label\" for=\"input-email\">Email address</label>\n");
      out.write("                        <input type=\"email\" id=\"input-email\" class=\"form-control form-control-alternative\" placeholder=\" \"value=\"");
      out.print( rs.getString("email") );
      out.write("\">\n");
      out.write("                      </div>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-6\">\n");
      out.write("                      <div class=\"form-group focused\">\n");
      out.write("                        <label class=\"form-control-label\" for=\"input-first-name\">First name</label>\n");
      out.write("                        <input type=\"text\" id=\"input-first-name\" class=\"form-control form-control-alternative\" placeholder=\"First name\" value=\"");
      out.print( rs.getString("fname") );
      out.write("\">\n");
      out.write("                      </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-6\">\n");
      out.write("                      <div class=\"form-group focused\">\n");
      out.write("                        <label class=\"form-control-label\" for=\"input-last-name\">Last name</label>\n");
      out.write("                        <input type=\"text\" id=\"input-last-name\" class=\"form-control form-control-alternative\" placeholder=\"Last name\" value=\"");
      out.print(rs.getString("lname") );
      out.write("\">\n");
      out.write("                      </div>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("                <hr class=\"my-4\">\n");
      out.write("               \n");
      out.write("               <!-- Table -->\n");
      out.write("            <div class=\"table-responsive\">\n");
      out.write("              <table class=\"table align-items-center table-flush\">\n");
      out.write("                <thead class=\"thead-light\">\n");
      out.write("                  <tr>\n");
      out.write("                    <th scope=\"col\">Event ID</th>\n");
      out.write("                    <th scope=\"col\">Event Type</th>\n");
      out.write("                    <th scope=\"col\">Budget</th>\n");
      out.write("                    <th scope=\"col\">Contact No</th>\n");
      out.write("                    <th scope=\"col\">Status</th>\n");
      out.write("                    <th scope=\"col\">Due date</th>\n");
      out.write("                    <th scope=\"col\">Status</th>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                  </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                    \n");
      out.write("                    ");

                        try{
            String query1= "SELECT * FROM `event`";
           Statement stst=con.createStatement();
            ResultSet rs1=stst.executeQuery(query1);       
            while(rs1.next())
            {
                    
      out.write("\n");
      out.write("                  \n");
      out.write("                  <tr>\n");
      out.write("                       \n");
      out.write("                    <td scope=\"row\">\n");
      out.write("                      <div class=\"media align-items-center\">\n");
      out.write(" \n");
      out.write("                        <div class=\"media-body\">\n");
      out.write("                            <span class=\"mb-0 text-sm\"> ");
      out.print(rs1.getString("id"));
      out.write("</span>\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                    </td>\n");
      out.write("                   <td scope=\"row\">\n");
      out.write("                      <div class=\"media align-items-center\">\n");
      out.write(" \n");
      out.write("                        <div class=\"media-body\">\n");
      out.write("                            <span class=\"mb-0 text-sm\"> ");
      out.print(rs1.getString("type"));
      out.write("</span>\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                    </td>\n");
      out.write("                    \n");
      out.write("                    <td scope=\"row\">\n");
      out.write("                      <div class=\"media align-items-center\">\n");
      out.write(" \n");
      out.write("                        <div class=\"media-body\">\n");
      out.write("                            <span class=\"mb-0 text-sm\"> ");
      out.print(rs1.getString("budget"));
      out.write("</span>\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                    </td>\n");
      out.write("                    \n");
      out.write("                    <td scope=\"row\">\n");
      out.write("                      <div class=\"media align-items-center\">\n");
      out.write(" \n");
      out.write("                        <div class=\"media-body\">\n");
      out.write("                            <span class=\"mb-0 text-sm\"> ");
      out.print(rs1.getString("contactno"));
      out.write("</span>\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                    </td>\n");
      out.write("                    \n");
      out.write("                    <td scope=\"row\">\n");
      out.write("                      <div class=\"media align-items-center\">\n");
      out.write(" \n");
      out.write("                        <div class=\"media-body\">\n");
      out.write("                            <span class=\"mb-0 text-sm\"> ");
      out.print(rs1.getString("address"));
      out.write("</span>\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                    </td>\n");
      out.write("                    \n");
      out.write("                    <td scope=\"row\">\n");
      out.write("                      <div class=\"media align-items-center\">\n");
      out.write(" \n");
      out.write("                        <div class=\"media-body\">\n");
      out.write("                            <span class=\"mb-0 text-sm\"> ");
      out.print(rs1.getString("dueDate"));
      out.write("</span>\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                    </td>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    <td scope=\"row\">\n");
      out.write("                        ");
      out.write("\n");
      out.write("                        ");
 
                        
                     String date=rs1.getString("dueDate");
                     
                     
                     SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
                     
                    java.util.Date date1 = sdf.parse(date);
                    
                     
         java.util.Date date2= new java.util.Date() ;  
 long miliday1 = date2.getTime();
  long miliday2=date1.getTime();
  
  if(miliday1>miliday2){  status="You have More Days";}
else{status="Successful !";}
                     
                     
//2020/9/22
 
                        
                        
                        
      out.write("\n");
      out.write("                        \n");
      out.write("                      <div class=\"media align-items-center\">\n");
      out.write(" \n");
      out.write("                        <div class=\"media-body\">\n");
      out.write("                            <span class=\"mb-0 text-sm\"> ");
      out.print(status);
      out.write("</span>\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                    </td>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                 </tr>\n");
      out.write("                 ");
     }
        }
        catch(SQLException ex){
            out.println(ex);
        }
      out.write("\n");
      out.write("                 \n");
      out.write("                 \n");
      out.write("                 \n");
      out.write("                </tbody>\n");
      out.write("              </table>\n");
      out.write("            </div>\n");
      out.write("            </form> \n");
      out.write("    \n");
      out.write("     ");
  
                
//            b2.setFname(rs.getString("fname"));
//            b2.setLname(rs.getString("lname"));
//            b2.setEmail(rs.getString("email"));
//            b2.setUname(rs.getString("uname"));
            }
        }
        catch(SQLException ex){
            out.println(ex);
        }
        
        
      out.write("       \n");
      out.write("    \n");
      out.write("    \n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <footer class=\"footer\">\n");
      out.write("\n");
      out.write("  </footer>\n");
      out.write("</body>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
