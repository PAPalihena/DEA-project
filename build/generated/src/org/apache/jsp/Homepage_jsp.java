package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class Homepage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("  <title>Event 4U</title>\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\n");
      out.write("\t\n");
      out.write("\t<style>\n");
      out.write("\th1 {\n");
      out.write("  \t\tcolor: green;\n");
      out.write("\t\t}\t\n");
      out.write("\tp {\n");
      out.write("\t\tcolor: white;\n");
      out.write("\t\t\n");
      out.write("\t\t}\n");
      out.write("\t\th2{\n");
      out.write("\t\t\tcolor: forestgreen;\n");
      out.write("\t\t}\n");
      out.write("                \n");
      out.write("                tr{ \n");
      out.write("                    color: white;\n");
      out.write("                }\n");
      out.write("\t\n");
      out.write("\t</style>\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("</head>\n");
      out.write("<body style=\"background-color:black\">\n");
      out.write("\n");
      out.write("\t\n");
      out.write("<nav class=\"navbar navbar-expand-sm bg-dark navbar-dark\">\n");
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
      out.write("\t   <a class=\"navbar-brand\" href=\"Homepage.jsp\">EVENT 4U</a>\n");
      out.write("\t  \n");
      out.write("    <li class=\"nav-item\">\n");
      out.write("      <a class=\"nav-link\" href=\"#\">Home</a>\n");
      out.write("    </li>\n");
      out.write("    <li class=\"nav-item\">\n");
      out.write("      <a class=\"nav-link\" href=\"Services.jsp\">Service</a>\n");
      out.write("    </li>\n");
      out.write("\t  <li class=\"nav-item\">\n");
      out.write("      <a class=\"nav-link\" href=\"#\">Gallery</a>\n");
      out.write("    </li>\n");
      out.write("\t  <li class=\"nav-item\">\n");
      out.write("      <a class=\"nav-link\" href=\"aboutus.jsp\">About us</a>\n");
      out.write("    </li>\n");
      out.write("\t  <li class=\"nav-item\">\n");
      out.write("      <a class=\"nav-link\" href=\"contactus.jsp\">Contact us</a>\n");
      out.write("    </li>\n");
      out.write("\n");
      out.write("    <!-- Dropdown -->\n");
      out.write("    <li class=\"nav-item dropdown\">\n");
      out.write("      <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbardrop\" data-toggle=\"dropdown\">\n");
      out.write("          User\n");
      out.write("      </a>\n");
      out.write("      <div class=\"dropdown-menu\">\n");
      out.write("        <a class=\"dropdown-item\" href=\"profile.jsp\">Profile</a>\n");
      out.write("        <a class=\"dropdown-item\" href=\"logoutServlet\">Logout</a>\n");
      out.write("        \n");
      out.write("      </div>\n");
      out.write("    </li>\n");
      out.write("  </ul>\n");
      out.write("</nav>\n");
      out.write("<br>\n");
      out.write(" \n");
      out.write("<br>\n");
      out.write("  \n");
      out.write("\t\n");
      out.write("<div class=\"container\">\n");
      out.write("  \n");
      out.write("\t<div id=\"demo\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("  <ul class=\"carousel-indicators\">\n");
      out.write("    <li data-target=\"#demo\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("    <li data-target=\"#demo\" data-slide-to=\"1\"></li>\n");
      out.write("    <li data-target=\"#demo\" data-slide-to=\"2\"></li>\n");
      out.write("  </ul>\n");
      out.write("  <div class=\"carousel-inner\">\n");
      out.write("    <div class=\"carousel-item active\">\n");
      out.write("      <img src=\"dave-lastovskiy-RygIdTavhkQ-unsplash.jpg\" alt=\"Los Angeles\" width=\"1100\" height=\"500\">\n");
      out.write("      <div class=\"carousel-caption\">\n");
      out.write("        <h3>Birthday party</h3>\n");
      out.write("        <p>We had such a great time in LA!</p>\n");
      out.write("      </div>   \n");
      out.write("    </div>\n");
      out.write("    <div class=\"carousel-item\">\n");
      out.write("      <img src=\"h3.jpg\" alt=\"Chicago\" width=\"1100\" height=\"500\">\n");
      out.write("      <div class=\"carousel-caption\">\n");
      out.write("        <h3>Halloween Party</h3>\n");
      out.write("        <p>Thank you, Chicago!</p>\n");
      out.write("      </div>   \n");
      out.write("    </div>\n");
      out.write("    <div class=\"carousel-item\">\n");
      out.write("      <img src=\"images1.jpg\" alt=\"New York\" width=\"1100\" height=\"500\">\n");
      out.write("      <div class=\"carousel-caption\">\n");
      out.write("        <h3>Bridle Party</h3>\n");
      out.write("        <p>We love the Big Apple!</p>\n");
      out.write("      </div>   \n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <a class=\"carousel-control-prev\" href=\"#demo\" data-slide=\"prev\">\n");
      out.write("    <span class=\"carousel-control-prev-icon\"></span>\n");
      out.write("  </a>\n");
      out.write("  <a class=\"carousel-control-next\" href=\"#demo\" data-slide=\"next\">\n");
      out.write("    <span class=\"carousel-control-next-icon\"></span>\n");
      out.write("  </a>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\t</br></br></br>\n");
      out.write("\t<div align=\"center\">\n");
      out.write("\t\t\t<h1>Welcome to Event 4U</h1>\n");
      out.write("\n");
      out.write("\t\t\t<p>we are always keen on creating unforgetable memories</p>\n");
      out.write("                        <a href=\"register.jsp\"><button type=\"button\" class=\"btn btn-outline-success\">Register</button></a>\n");
      out.write("                        <a href=\"login.jsp\"<button type=\"button\" class=\"btn btn-outline-success\">Log In</button></a>\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t\t</br>\n");
      out.write("\t\t</br>\n");
      out.write("\t\t</br>\n");
      out.write("\t\t\n");
      out.write("\t\n");
      out.write("\t\t<p>EVENT 4U is an event logistics and marketing company.The company offers A-Z event planning services from a team of experienced and energetic event planners,suppliers,venues and more..with the number of events we organize,Event planing for you does not need to add exorbitant fees and mark-ups to make its profit margins.This ensure that our client list,which is constantly growing,make regular use of our services...</p>\n");
      out.write("\n");
      out.write("\t\t<p>......The EVENT 4U team is made up for a mix of people.A large support team helps out in everything the company does, in office work to on-site logistics planning......</p>\n");
      out.write("\t\n");
      out.write("\t</br>\n");
      out.write("</br>\n");
      out.write("</br>\n");
      out.write("\t\n");
      out.write("  <h2>Comments</h2>\n");
      out.write("  <p>Please send your comments that you feel this site.</p>   \n");
      out.write("  \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("  <form action=\"commentServlet\" method=\"post\" >\n");
      out.write("  <table class=\"table table-dark\" aline='center'>\n");
      out.write("      <tr>\n");
      out.write("          <td>Full name</td> \n");
      out.write("          <td><input type=\"text\" name=\"name\"></td>\n");
      out.write("      </tr>\n");
      out.write("       \n");
      out.write("      <tr>\n");
      out.write("          <td>Email</td> \n");
      out.write("      <td><input type=\"text\" name=\"email\"></td>\n");
      out.write("      </tr>\n");
      out.write("      \n");
      out.write("      <tr>\n");
      out.write("          <td>comment</td> \n");
      out.write("          <td><textarea rows=\"4\" cols=\"50\" name=\"comment\"> Enter comment here...</textarea></td>\n");
      out.write("      </tr>\n");
      out.write("      \n");
      out.write("      <tr>\n");
      out.write("          \n");
      out.write("          <td></td>\n");
      out.write("          <td> <input type=\"submit\" value=\"Post\"></td>\n");
      out.write("      </tr>\n");
      out.write("    </form>\n");
      out.write("</table>         \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\n");

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

      out.write("\n");
      out.write("\n");
      out.write("\n");

try{
connection = DriverManager.getConnection(connectionUrl+database, userid, password);
statement=connection.createStatement();
String sql ="select * from commentbox";
resultSet = statement.executeQuery(sql);
while(resultSet.next()){

      out.write("\n");
      out.write("<div style=\"color:white;text-align: left;margin-left: 500px;\">\n");
      out.write(" ");
      out.print(resultSet.getString("Fullname") );
      out.write("</br>\n");
      out.print(resultSet.getString("Email") );
      out.write("</br>\n");
      out.print(resultSet.getString("Comment") );
      out.write("</br>\n");
      out.write("</br>\n");
      out.write("</div>\n");

}
connection.close();
} catch (Exception e) {
e.printStackTrace();
}

      out.write("\n");
      out.write("\t\t\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
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
