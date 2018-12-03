package login;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Hp
 */
public class LoginServlet extends HttpServlet {

         
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String s=request.getParameter("user");
        String p=request.getParameter("password");
        try
        {   PrintWriter out=response.getWriter();
            Class.forName("com.mysql.cj.jdbc.Driver");//registering the driver by loading driver class
            //calling the method of by class name cuz DriverManager is static
           //class DBConnection implements Connection
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/mydb?useSSL=false","root","Shinchan26");
            Statement stmt=conn.createStatement();
             String sql_query="Select * from loginreq where username=? AND pass=?";
            PreparedStatement pstmt=conn.prepareStatement(sql_query);
            pstmt.setString(1,s);
            pstmt.setString(2,p);
            ResultSet rs=pstmt.executeQuery();
            if(rs.last()==true)
            {
               HttpSession session=request.getSession();//gets active session or creates one
            session.setAttribute("user",p);
            // Set expiry time of the session to 30mins
            session.setMaxInactiveInterval(30*60);
            if(s.equals("admin"))
            {
                String url=response.encodeRedirectURL("admin.html");
                response.sendRedirect(url);
            }
            //THIS IS INCASE OF Servlet
          String url=response.encodeRedirectURL("home.html");
            response.sendRedirect(url);
            //THIS IS FOR JSP
            /*
            RequestDispatcher rd=request.getRequestDispatcher("Success.jsp");
            rd.forward(request, response);
            */
            }
            else
            {
                request.getSession().invalidate();
            response.sendRedirect("index.html");
            }
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}