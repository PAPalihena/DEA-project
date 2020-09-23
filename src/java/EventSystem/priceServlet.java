/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EventSystem;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author HP
 */
public class priceServlet extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet priceServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet priceServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
//        processRequest(request, response);
        String items[]=request.getParameterValues("compo");
        String type= request.getParameter("type");
//        PrintWriter out=response.getWriter();
//        for(int a=0; a<items.length;a++)
//        {
//            out.println(items[a]);
//        }
        
       int total =0;
        try {
            Connection con=DbConnection.getConnection();
            Statement st=con.createStatement();
            int result[] = new int[items.length];
            for(int i=0;i<items.length;i++)
            {
                ResultSet rs= st.executeQuery("SELECT * FROM `pricing` WHERE component='"+items[i]+"'");
                if(rs.next()){
                    result[i]=Integer.parseInt(rs.getString("price"));
                }
            }
            for(int a=0;a<result.length;a++)
            {
                total= total+ result[a];
            }
            
            PrintWriter out=response.getWriter();
            out.println("Total is :" +total);
            HttpSession session= request.getSession();
            session.setAttribute("budget",total);
            session.setAttribute("type",type);
            RequestDispatcher rd=request.getRequestDispatcher("eventinfo.jsp");
            rd.forward(request, response);
            
        } catch (SQLException ex) {
            Logger.getLogger(priceServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        
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
