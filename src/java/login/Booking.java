/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Damni
 */
public class Booking extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
         try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/mydb?useSSL=false","root","Shinchan26");
            String query1="insert into booking(f_name,l_name,p_no,email,guest,event_date,time,event_type) values(?,?,?,?,?,?,?,?)";
            PreparedStatement pstmt=conn.prepareStatement(query1);
            String fname=request.getParameter("fname");
            String lname=request.getParameter("lname");
            String ph_no=request.getParameter("Phone_no");
            String email=request.getParameter("email");
            String date=request.getParameter("Date");
            String time=request.getParameter("Time");
            String guests=request.getParameter("Guests");
            String type=request.getParameter("Type");
            pstmt.setString(1,fname);
            pstmt.setString(2,lname);
            pstmt.setString(3,ph_no);
            pstmt.setString(4,email);
            pstmt.setString(6,date);
            pstmt.setString(7,time);
            pstmt.setString(5,guests);
            pstmt.setString(8,type);
            int rs=pstmt.executeUpdate();
            if(rs>=1)
            {
                
                String url1=response.encodeRedirectURL("LoginSuccess");
                String url=response.encodeRedirectURL("event1.html");
                response.sendRedirect(url);
            }
            else
            {
                
            response.sendRedirect("booking.html");
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
