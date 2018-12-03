package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.mysql.cj.protocol.Resultset;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class bookingdisp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<style>\n");
      out.write("table {\n");
      out.write("    font-family: arial, sans-serif;\n");
      out.write("    border-collapse: collapse;\n");
      out.write("    width: 100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("td, th {\n");
      out.write("    border: 1px solid #dddddd;\n");
      out.write("    text-align: left;\n");
      out.write("    padding: 8px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("tr:nth-child(even) {\n");
      out.write("    background-color: #dddddd;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<h2>HTML Table</h2>\n");
      out.write("\n");
      out.write("<table>\n");
      out.write("    <tr>\n");
      out.write("    <th>First Name</th>\n");
      out.write("    <th>Last Name</th>\n");
      out.write("    <th>Email</th>\n");
      out.write("    <th>Phone Number</th>\n");
      out.write("    <th>Date</th>\n");
      out.write("    <th>Time</th>\n");
      out.write("    <th>Number of Guests</th>\n");
      out.write("    <th>Type of event</th>\n");
      out.write("  </tr>\n");
      out.write("    ");
/*int i=1;
    int j=0 ;
    
        Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/mydb?useSSL=false","root","Shinchan26");
           String query1="select count(*) from booking";
           PreparedStatement pstmt=conn.prepareStatement(query1);
           ResultSet rs=pstmt.executeQuery();
           while(rs.next())
           {
               j=rs.getInt(1);
           }*/
            
      out.write("\n");
      out.write("  \n");
      out.write("  ");
/*
      while(i<=j)
  {
      String query2="select * from booking where id=1";
      PreparedStatement pstmt2=conn.prepareStatement(query2);
      ResultSet rs2=pstmt2.executeQuery();
      while(rs2.next())
      {*/
      out.write("\n");
      out.write("   <!--   \n");
      out.write("  <tr>\n");
      out.write("      <td>");
      out.print(rs.getString(1));
      out.write("</td>\n");
      out.write("    <td>");
      out.print(rs.getString(2));
      out.write("</td>\n");
      out.write("    <td>");
      out.print(rs.getString(3));
      out.write("</td>\n");
      out.write("    <td>");
      out.print(rs.getString(4));
      out.write("</td>\n");
      out.write("    <td>");
      out.print(rs.getString(5));
      out.write("</td>\n");
      out.write("    <td>");
      out.print(rs.getString(6));
      out.write("</td>\n");
      out.write("    <td>");
      out.print(rs.getString(7));
      out.write("</td>\n");
      out.write("    <td>");
      out.print(rs.getString(8));
      out.write("</td>\n");
      out.write("  </tr>-->\n");
      out.write("  ");
//}
//}
      out.write("\n");
      out.write("  \n");
      out.write("  \n");
      out.write("</table>\n");
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
