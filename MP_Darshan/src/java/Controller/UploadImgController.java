/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import dao.UploadProfileImageDao;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 *
 * @author Lenovo
 */
public class UploadImgController extends HttpServlet {

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
            HttpSession session= request.getSession();
             
            
            DiskFileItemFactory factory=new DiskFileItemFactory();
            ServletFileUpload upload=new ServletFileUpload(factory);
            
           String imgpath = null;
                    
                List<FileItem> item;
            
                item = upload.parseRequest(request);
                
                
                for(FileItem items:item )
                {
                    String s=items.getFieldName();
                    
                    if(s.equals("blogimg"))
                    { 
                        
                        int size;
                        size = (int)items.getSize();
                        byte b[]=new byte[size];
                        try (InputStream is = items.getInputStream()) {
                            is.read(b);
                        }
                        
                       String fname=items.getName();
                       
                      
                       System.out.println("path"+fname);

                       String path="D:\\shadabproject\\"+fname;
                        try (FileOutputStream fos = new FileOutputStream(path)) {
                            fos.write(b);
                           imgpath=path;
                        }
                    }  
                       //out.println("<img src=\"C:\\Users\\rohan\\Desktop\\java adv\\image\\web\\images\\ComputerScience(1).png\"/><br><br>");
                      // out.println("hiii .....................................................<br><br>");
                      // out.println("<img src=\"images\\"+fname+"\"/>");
                    }
                    
                    
                
            
            
            System.out.println("uploadinggg");
            UploadProfileImageDao ud=new UploadProfileImageDao();
           ud.blogimage(imgpath, context, session);
                response.sendRedirect("MyProfileContoller");
             
             
            
                

      
        } catch (FileUploadException ex) {
            Logger.getLogger(UploadImgController.class.getName()).log(Level.SEVERE, null, ex);
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
