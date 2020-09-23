package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Services_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link href=\"css/Services.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"logo\">\n");
      out.write("\t\t<img src=\"onlinelogomaker-062719-0050-9549-2000-transparent.png\">\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("\t<div class=\"header\">\n");
      out.write("\t\t<h1>Our Services</h1>\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("\t<div class=\"col\">\n");
      out.write("\t\t<div class=\"row-md\"><img src=\"1.jpg\" alt=\"\"></div>\n");
      out.write("\t\t\t\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("\t<div class=\"col2\">\n");
      out.write("\t\t<div class=\"row-md\"><img src=\"2.jpg\" alt=\"\"></div>\n");
      out.write("\t\t\t\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("\t<div class=\"col3\">\n");
      out.write("\t\t<div class=\"row-md\"><img src=\"3.jpg\" alt=\"\"></div>\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t<div class=\"parties\">\n");
      out.write("\t\t<a href=\"birthday-party.jsp\" style=\"cursor: pointer; text-decoration:none;\"><h2>Birthday Parties<br> <div class=\"price\" onclick=\"location.href='dea pr.html';\" >(Price Range= Rs.100,000-45,000)</div></h2>\n");
      out.write("\t\t\t<ul>\n");
      out.write("\t\t\t\t<li>Gas Balloons</li>\n");
      out.write("\t\t\t\t<li>Face Painting</li>\n");
      out.write("\t\t\t\t<li>Foods/Beverages</li>\n");
      out.write("\t\t\t\t<li>Magic Show</li>\n");
      out.write("\t\t\t\t<li>Music</li>\n");
      out.write("\t\t\t\t<li>Candies</li>\n");
      out.write("\t\t\t\t<li>Bounzers</li>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</a>\n");
      out.write("\t\t\n");
      out.write("            <a href=\"helloween-party.jsp\" style=\"cursor: pointer; text-decoration:none;\"><h2>Halloween Parties<br> <div class=\"price\" onclick=\"location.href='helloween party.html';\" style=\"cursor: pointer;\">(Price Range=Rs.100,000-50,000)</div></h2>\n");
      out.write("\t\t\t<ul>\n");
      out.write("\t\t\t\t<li>Decorations</li>\n");
      out.write("\t\t\t\t<li>Beverages</li>\n");
      out.write("\t\t\t\t<li>Horror Movies</li>\n");
      out.write("\t\t\t\t<li>Spooky Music</li>\n");
      out.write("\t\t\t\t<li>Games</li>\n");
      out.write("\t\t\t\t<li>Candles</li>\n");
      out.write("\t\t\t\t<li>Costumes</li>\n");
      out.write("\t\t\t\t<li>Photographers</li>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t</ul>\n");
      out.write("                </a>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t\n");
      out.write("\t<div class=\"left\">\n");
      out.write("\t\t<a href=\"bridal-show.jsp\" style=\"cursor: pointer; text-decoration:none;\"><h2>Bridal Shows<br> <div class=\"price\" onclick=\"location.href='bridal shower.html';\" style=\"cursor: pointer;\">(Price Range= Rs.200,000-125,000)</div></h2>\n");
      out.write("\t\t\t<ul>\n");
      out.write("\t\t\t\t<li>Gas Balloons</li>\n");
      out.write("\t\t\t\t<li>Face Painting</li>\n");
      out.write("\t\t\t\t<li>Foods/Beverages</li>\n");
      out.write("\t\t\t\t<li>Magic Show</li>\n");
      out.write("\t\t\t\t<li>Music</li>\n");
      out.write("\t\t\t\t<li>Candies</li>\n");
      out.write("\t\t\t\t<li>Bounzers</li>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t</ul>\n");
      out.write("                </a>\n");
      out.write("\t\t\n");
      out.write("\t\t<a href=\"batch-party.jsp\" style=\"cursor: pointer; text-decoration:none;\"><h2>Batch parties<br> <div class=\"price\" onclick=\"location.href='batch parties.html';\" style=\"cursor: pointer;\">(Price Range= Rs.100,000-50,000)</div></h2>\n");
      out.write("\t\t\t<ul>\n");
      out.write("\t\t\t\t<li>Music</li>\n");
      out.write("\t\t\t\t<li>lightning</li>\n");
      out.write("\t\t\t\t<li>Foods/Beverages</li>\n");
      out.write("\t\t\t\t<li>Photography / Videographgy</li>\n");
      out.write("\t\t\t\t<li>Games</li>\n");
      out.write("\t\t\t\t<li>Decorations</li>\n");
      out.write("\t\t\t\t<li>Drinks</li>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t</ul>\n");
      out.write("                </a>\n");
      out.write("\t</div>\t\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t\n");
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
