package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class OrderDetails_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("                .td{\n");
      out.write("                   text-align: center;\n");
      out.write("                }\n");
      out.write("                h3{\n");
      out.write("                    color: white;\n");
      out.write("                }\n");
      out.write("\t</style>\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("</head>\n");
      out.write("<body style=\"background-color:black\">\n");
      out.write("\n");
      out.write("   \n");
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
      out.write("      <a class=\"nav-link\" href=\"#\">About us</a>\n");
      out.write("    </li>\n");
      out.write("\t  <li class=\"nav-item\">\n");
      out.write("      <a class=\"nav-link\" href=\"#\">Contact us</a>\n");
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
      out.write(" <div class=\"container\">\n");
      out.write("     <div class=\"tb\">\n");
      out.write("    <center> \n");
      out.write("        <h1>Your Oder!</h1></br>\n");
      out.write("        <h3> Event Type </h3>: ");
      out.print(session.getAttribute("type"));
      out.write(" </br>\n");
      out.write("        <h3>Event due date</h3> : ");
      out.print( session.getAttribute("dueDate"));
      out.write("</br>\n");
      out.write("        <h3>Event Address </h3>: ");
      out.print( session.getAttribute("address"));
      out.write(";</br>\n");
      out.write("        <h3>Contact </h3>: ");
      out.print( session.getAttribute("contact"));
      out.write("</br>   \n");
      out.write("        <h3>Budget </h3>: ");
      out.print( session.getAttribute("budget"));
      out.write("</br>\n");
      out.write("        </br>\n");
      out.write("        </br>\n");
      out.write("        \n");
      out.write("        <a href=\"Homepage.jsp\" style=\"text-decoration:none;\"><button type=\"button\" class=\"btn btn-outline-success\"> Return to home</button> </a>    \n");
      out.write("        <a href=\"profile.jsp\" style=\"text-decoration:none;\"><button type=\"button\" class=\"btn btn-outline-success\"> View profile</button> </a>\n");
      out.write("        \n");
      out.write("        </br>\n");
      out.write("        </br>\n");
      out.write("    </center>\n");
      out.write("       \n");
      out.write("</div>     \n");
      out.write("    </div>\n");
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
