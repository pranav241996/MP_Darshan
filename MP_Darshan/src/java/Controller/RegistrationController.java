/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.UserModel;
import dao.RegisterDao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import sendmail.otp;

/**
 *
 * @author lenovo
 */
public class RegistrationController extends HttpServlet {

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
            
            ServletContext context=getServletContext();
            
            
String Name = request.getParameter("Name");
//            String Lastname = request.getParameter("Lastname");
            String Password = request.getParameter("Password");
//            String Confirmpassword = request.getParameter("Confirmpassword");
            String Email = request.getParameter("Email");
            String Country = request.getParameter("Country");
            String Contact = request.getParameter("Contact");
            String secque = request.getParameter("secque");
            String secans = request.getParameter("secans");
          
            
            System.out.println(Name);
           
            System.out.println(Password);
            
            System.out.println(Email);
            System.out.println(Country);
            System.out.println(Contact);
           
            
            
            UserModel um=new UserModel();
            um.setName(Name);
//            um.setLastname(Lastname);
            um.setPassword(Password);
//            um.setConfirmpassword(Confirmpassword);
            um.setEmail(Email);
            um.setCountry(Country);
            um.setContact(Contact);
            um.setSecque(secque);
            um.setSecans(secans);
            
            otp a=new otp();
         int ot=a.otpgenerator();
             String otpval;
              otpval = String.format("%d",ot);
            um.setOtpval(otpval);
              
            HttpSession session;
            session=request.getSession();
            
            RegisterDao rd=new RegisterDao();
            boolean flag;
            flag=rd.insertuser(um, context,session);
            if(flag)
            {
                response.sendRedirect("linklogin.jsp");
            }else
                out.println("invalid details");
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
