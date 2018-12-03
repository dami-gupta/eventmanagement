package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class event_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<style>\n");
      out.write("ul {\n");
      out.write("    list-style-type: none;\n");
      out.write("    margin: 0;\n");
      out.write("    padding: 0;\n");
      out.write("    overflow: hidden;\n");
      out.write("    border: 1px solid #e7e7e7;\n");
      out.write("    background-color: #333333;\n");
      out.write("}\n");
      out.write("\n");
      out.write("li {\n");
      out.write("    float:right;\n");
      out.write("}\n");
      out.write("\n");
      out.write("li a {\n");
      out.write("    display: block;\n");
      out.write("    color: white;\n");
      out.write("    text-align: center;\n");
      out.write("    padding: 14px 16px;\n");
      out.write("    text-decoration: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("li a:hover:not(.active) {\n");
      out.write("    background-color: #ddd;\n");
      out.write("}\n");
      out.write("\n");
      out.write("li a.active {\n");
      out.write("    color: white;\n");
      out.write("    background-color: #FF99FF;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<ul>\n");
      out.write("    <li><a href=\"index.html\">Sign In</a></li>\n");
      out.write("    <li><a href=\"aboutus.html\">About Us</a></li>\n");
      out.write("     <li><a href=\"#gallery\">Gallery</a></li>\n");
      out.write("  <li><a class=\"active\" href=\"home.html\">Home</a></li>\n");
      out.write("\n");
      out.write("</ul>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- //services -->\n");
      out.write("<div class=\"why-choose-agile py-5 bg-light\" id=\"services\">\n");
      out.write("\t\t<div class=\"wrap py-xl-5 py-lg-3\">\n");
      out.write("\t\t\t<p class=\"sub-tittle text-uppercase text-center\">Excellent Services</p>\n");
      out.write("\t\t\t<h3 class=\"tittle text-center text-uppercase mb-sm-5 mb-4\">\n");
      out.write("\t\t\t\tOur\n");
      out.write("\t\t\t\t<span>Services</span>\n");
      out.write("\t\t\t</h3>\n");
      out.write("\t\t\t<div class=\"row agileits-w3layouts-grid pt-md-4\">\n");
      out.write("\t\t\t\t<div class=\"col-lg-4 services-agile-1\">\n");
      out.write("\t\t\t\t\t<div class=\"d-flex wthree_agile_us bg-white py-4\">\n");
      out.write("\t\t\t\t\t\t<div class=\"col-2 pr-0\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"wthree_features_grid text-center\">\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"fas fa-glass-martini\"></i>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-10 agile-why-text\">\n");
      out.write("\t\t\t\t\t\t\t<h4 class=\"text-dark font-weight-bold mb-3\">Party Planning</h4>\n");
      out.write("\t\t\t\t\t\t\t<p>Lorem ipsum magna, vehicula ut scelerisque ornare.</p>\n");
      out.write("\t\t\t\t\t\t\t<a class=\"btn mt-3 service-button p-0 scroll\" href=\"#who\" role=\"button\">Read More\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"fas fa-long-arrow-alt-right ml-1\"></i>\n");
      out.write("\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-lg-4 services-agile-1 my-lg-0 my-4\">\n");
      out.write("\t\t\t\t\t<div class=\"d-flex wthree_agile_us bg-white py-4\">\n");
      out.write("\t\t\t\t\t\t<div class=\"col-2 pr-0\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"wthree_features_grid text-center\">\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"far fa-smile\"></i>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-10 agile-why-text\">\n");
      out.write("\t\t\t\t\t\t\t<h4 class=\"text-dark font-weight-bold mb-3\">Party Styling</h4>\n");
      out.write("\t\t\t\t\t\t\t<p>Lorem ipsum magna, vehicula ut scelerisque ornare.</p>\n");
      out.write("\t\t\t\t\t\t\t<a class=\"btn mt-3 service-button p-0 scroll\" href=\"#who\" role=\"button\">Read More\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"fas fa-long-arrow-alt-right ml-1\"></i>\n");
      out.write("\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-lg-4 services-agile-1\">\n");
      out.write("\t\t\t\t\t<div class=\"d-flex wthree_agile_us bg-white py-4\">\n");
      out.write("\t\t\t\t\t\t<div class=\"col-2 pr-0\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"wthree_features_grid text-center\">\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"fab fa-gulp\"></i>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-10 agile-why-text\">\n");
      out.write("\t\t\t\t\t\t\t<h4 class=\"text-dark font-weight-bold mb-3\">Party Catering</h4>\n");
      out.write("\t\t\t\t\t\t\t<p>Lorem ipsum magna, vehicula ut scelerisque ornare.</p>\n");
      out.write("\t\t\t\t\t\t\t<a class=\"btn mt-3 service-button p-0 scroll\" href=\"#who\" role=\"button\">Read More\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"fas fa-long-arrow-alt-right ml-1\"></i>\n");
      out.write("\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"row agileits-w3layouts-grid mt-lg-5 mt-4\">\n");
      out.write("\t\t\t\t<div class=\"col-lg-4 services-agile-1\">\n");
      out.write("\t\t\t\t\t<div class=\"d-flex wthree_agile_us bg-white py-4\">\n");
      out.write("\t\t\t\t\t\t<div class=\"col-2 pr-0\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"wthree_features_grid text-center\">\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"fas fa-gift\"></i>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-10 agile-why-text\">\n");
      out.write("\t\t\t\t\t\t\t<h4 class=\"text-dark font-weight-bold mb-3\">Party Gifts</h4>\n");
      out.write("\t\t\t\t\t\t\t<p>Lorem ipsum magna, vehicula ut scelerisque ornare.</p>\n");
      out.write("\t\t\t\t\t\t\t<a class=\"btn mt-3 service-button p-0 scroll\" href=\"#who\" role=\"button\">Read More\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"fas fa-long-arrow-alt-right ml-1\"></i>\n");
      out.write("\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-lg-4 services-agile-1 my-lg-0 my-4\">\n");
      out.write("\t\t\t\t\t<div class=\"d-flex wthree_agile_us bg-white py-4\">\n");
      out.write("\t\t\t\t\t\t<div class=\"col-2 pr-0\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"wthree_features_grid text-center\">\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"fas fa-birthday-cake\"></i>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-10 agile-why-text\">\n");
      out.write("\t\t\t\t\t\t\t<h4 class=\"text-dark font-weight-bold mb-3\">Birthday Parties</h4>\n");
      out.write("\t\t\t\t\t\t\t<p>Lorem ipsum magna, vehicula ut scelerisque ornare.</p>\n");
      out.write("\t\t\t\t\t\t\t<a class=\"btn mt-3 service-button p-0 scroll\" href=\"#who\" role=\"button\">Read More\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"fas fa-long-arrow-alt-right ml-1\"></i>\n");
      out.write("\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-lg-4 services-agile-1\">\n");
      out.write("\t\t\t\t\t<div class=\"d-flex wthree_agile_us bg-white py-4\">\n");
      out.write("\t\t\t\t\t\t<div class=\"col-2 pr-0\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"wthree_features_grid text-center\">\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"fas fa-headphones\"></i>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-10 agile-why-text\">\n");
      out.write("\t\t\t\t\t\t\t<h4 class=\"text-dark font-weight-bold mb-3\">Party Music</h4>\n");
      out.write("\t\t\t\t\t\t\t<p>Lorem ipsum magna, vehicula ut scelerisque ornare.</p>\n");
      out.write("\t\t\t\t\t\t\t<a class=\"btn mt-3 service-button p-0 scroll\" href=\"#who\" role=\"button\">Read More\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"fas fa-long-arrow-alt-right ml-1\"></i>\n");
      out.write("\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<!-- //services -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
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
