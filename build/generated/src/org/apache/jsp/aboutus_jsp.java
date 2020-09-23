package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class aboutus_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("                body {\n");
      out.write("                    background-color: black;\n");
      out.write("                  \n");
      out.write("                }\n");
      out.write("                \n");
      out.write("                h3{\n");
      out.write("                    color: wheat;\n");
      out.write("                    font-family: arial;\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                }\n");
      out.write("\t</style>\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("</head>\n");
      out.write("<body >\n");
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
      out.write("<div style align=\"center\">\n");
      out.write("    <h1> About Us </h1>\n");
      out.write("    </BR></BR></BR></BR></BR></BR>\n");
      out.write("    <h3>\n");
      out.write("        <p>When creating a website, the About Us page is one of the first supporting pages you'll likely design for your website, regardless of the industry you're in.\n");
      out.write("\n");
      out.write("They may go by different labels—“About”, “Story”, “Mission”—but these types of pages generally serve the same key purpose: to be the go-to page for a brand to say, “This is who we are.”\n");
      out.write("\n");
      out.write("When a visitor wants to learn more about you or your business, it's the page they'll look for.\n");
      out.write("\n");
      out.write("Unfortunately, About Us pages are too often treated as an obligation rather than the valuable opportunity they are to connect with your customers by selling your story, your vision, your mission, and what makes you, YOU.</p>\n");
      out.write("        \n");
      out.write("    </h3>\n");
      out.write("    \n");
      out.write("</div>\n");
      out.write("\n");
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
