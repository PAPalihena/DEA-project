package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link href=\"css/sign.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("\t<div class=\"col-md-5 register-left\">\n");
      out.write("\t\t<img src=\"images/arrow.png\">\n");
      out.write("\t\t<h1>Join Us</h1>\n");
      out.write("\t\t<p>Make your Specials days awesome with us</p>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"col-md-7 register-right\">\n");
      out.write("\t\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("\t\t<div class=\"loginbox\">\n");
      out.write("\t\t<img src=\"images/avatar.png\" class=\"avatar\">\n");
      out.write("\t\t<h1>Register Here</h1>\n");
      out.write("                <form action=\"RegisterServlet\" method=\"post\">\n");
      out.write("\t\t\t<p>First name</p>\n");
      out.write("\t\t\t<input type=\"text\" name=\"fname\" placeholder=\"Enter firstname\">\n");
      out.write("\t\t\t<p>Last name</p>\n");
      out.write("\t\t\t<input type=\"text\" name=\"lname\" placeholder=\"Enter last name\">\n");
      out.write("\t\t\t<p>Email</p>\n");
      out.write("\t\t\t<input type=\"text\" name=\"email\" placeholder=\"Enter email here\">\n");
      out.write(" \t\t\t<p>Username</p>\n");
      out.write("\t\t\t<input type=\"password\" name=\"uname\" placeholder=\"Enter username\">\n");
      out.write("                        <p>Password</p>\n");
      out.write("\t\t\t<input type=\"password\" name=\"password\" placeholder=\"Enter Password\">\n");
      out.write("\t\t\t<input type=\"Submit\" name=\"\" value=\"Register\">\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t</form>\n");
      out.write("\t\t</div>\n");
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
