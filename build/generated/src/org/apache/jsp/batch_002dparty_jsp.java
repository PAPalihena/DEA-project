package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class batch_002dparty_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("       \n");
      out.write("\n");
      out.write("  <style>\n");
      out.write("  h2 {\n");
      out.write("  text-shadow: 2px 2px 5px red;\n");
      out.write("  text-align: center;\n");
      out.write("  font-family: georgia,garamond,serif;\n");
      out.write("  font-style:italic;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("  \n");
      out.write("            <!DOCTYPE html>\n");
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
      out.write("                table{\n");
      out.write("                        color:aqua;\n");
      out.write("                    \n");
      out.write("                }    \n");
      out.write("               \n");
      out.write("\t\n");
      out.write("\t</style>\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("</head>\n");
      out.write("<body style=\"background-color:black;\" >\n");
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
      out.write("</br>\n");
      out.write("<center>\n");
      out.write("        <h2>Batch Party</h2>\n");
      out.write("\n");
      out.write("   <P>Our mission is to make the process of planning your event smoot stress free and most of all fun!</P>\n");
      out.write("</center>\n");
      out.write(" \n");
      out.write("<div id=\"demo\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("  <ul class=\"carousel-indicators\">\n");
      out.write("    <li data-target=\"#demo\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("    <li data-target=\"#demo\" data-slide-to=\"1\"></li>\n");
      out.write("    <li data-target=\"#demo\" data-slide-to=\"2\"></li>\n");
      out.write("  </ul>\n");
      out.write("  <div class=\"carousel-inner\">\n");
      out.write("    <div class=\"carousel-item active\">\n");
      out.write("      <img src=\"batch party/alexander-popov-hTv8aaPziOQ-unsplash.jpg\" alt=\"Los Angeles\" width=\"1100\" height=\"500\">\n");
      out.write("      <div class=\"carousel-caption\">\n");
      out.write("        <h3>Batch Party</h3>\n");
      out.write("        <p>We make you special day more special just for you!</p>\n");
      out.write("      </div>   \n");
      out.write("    </div>\n");
      out.write("    <div class=\"carousel-item\">\n");
      out.write("      <img src=\"batch party/erik-mclean-gtoRUxsqzko-unsplash.jpg\" alt=\"Chicago\" width=\"1100\" height=\"500\">\n");
      out.write("      <div class=\"carousel-caption\">\n");
      out.write("        <h3>Batch Party</h3>\n");
      out.write("        <p>We make you special day more special just for you!</p>\n");
      out.write("      </div>   \n");
      out.write("    </div>\n");
      out.write("    <div class=\"carousel-item\">\n");
      out.write("      <img src=\"batch party/jade-masri-74tlEYKgrBE-unsplash.jpg\" alt=\"New York\" width=\"1100\" height=\"500\">\n");
      out.write("      <div class=\"carousel-caption\">\n");
      out.write("        <h3>Batch Party</h3>\n");
      out.write("        <p>We make you special day more special just for you!</p>\n");
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
      out.write("<br>\n");
      out.write("<div align=\"center\">\n");
      out.write("  \n");
      out.write("\n");
      out.write("   <div class=\"new\">\n");
      out.write("       <form action=\"priceServlet\" method=\"get\">\n");
      out.write("  <table border=\"0\"><tr>\n");
      out.write("  <tr><td><input type=\"checkbox\" name=\"compo\" value=\"Music\">\n");
      out.write("          <label for=\"feartures1\"> Music</label></td><td></td><td>=RS.2000</td></tr>\n");
      out.write("  <tr><td><input type=\"checkbox\" name=\"compo\" value=\"Lightning\">\n");
      out.write("  <label for=\"feartures2\">Lightning </label></td><td></td><td>=RS.3000</td></tr>\n");
      out.write("  <tr><td><input type=\"checkbox\" name=\"compo\" value=\"Food\">\n");
      out.write("  <label for=\"feartures3\"> Food/Beverages</label></td><td></td><td>=RS.1000</td></tr>\n");
      out.write("  <tr><td><input type=\"checkbox\" name=\"compo\" value=\"Drinks\">\n");
      out.write("  <label for=\"feartures4\"> Drinks</label></td><td></td><td>=RS.1000</td></tr>\n");
      out.write("  <tr><td><input type=\"checkbox\" name=\"compo\" value=\"Photography\">\n");
      out.write("  <label for=\"feartures5\"> Photography/Videography</label></td><td></td><td>=RS.3000</td></tr>\n");
      out.write("  <tr><td><input type=\"checkbox\" name=\"compo\" value=\"Games\">\n");
      out.write("  <label for=\"feartures6\"> Games</label></td><td></td><td>=RS.3000</td></tr>\n");
      out.write("  <tr><td><input type=\"checkbox\" name=\"compo\" value=\"decorations\">\n");
      out.write("  <label for=\"feartures7\"> Decorations</label></td><td></td><td>=RS.3000</td></tr>\n");
      out.write("  <tr> <td> <input type=\"hidden\" value=\"Batch Party\" name=\"type\"></td></tr>\n");
      out.write("  <tr><td></td><td><input type=\"submit\" value=\"Submit\"></td><td></td></tr>\n");
      out.write("\n");
      out.write("</table>\n");
      out.write("           </form>\n");
      out.write("\n");
      out.write("<br>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</div>\n");
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
