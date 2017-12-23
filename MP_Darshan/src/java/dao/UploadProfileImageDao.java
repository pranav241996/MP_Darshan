/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import Model.UserModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Lenovo
 */
public class UploadProfileImageDao {
      Connection con;
    public boolean updateimage (String imgpath, ServletContext context,HttpSession session) 
    {
       
        try {
            boolean flag=false;
            
            System.out.println("upload dao me ageya");
            con=(Connection) context.getAttribute("datacon");
            String qrl;
            
            UserModel um=(UserModel) session.getAttribute("currentuser");
            
            String qr2;
            qr2="update profileimg set imgpath=? where id=?";
           
            PreparedStatement ps2;
            ps2= con.prepareStatement(qr2);
            ps2.setString(1, imgpath);
            ps2.setInt(2, um.getId() );
            ps2.executeUpdate();
            
          
              
              
              
              
              
              
              
              
            
            flag=true;
            return flag;
            
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(RegisterDao.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        return false;
}
    
    
    
    
     public void blogimage (String imgpath, ServletContext context,HttpSession session) 
    {
       
        try {
            boolean flag=false;
            
            System.out.println("upload dao me ageya");
            con=(Connection) context.getAttribute("datacon");
            String qrl;
            
            UserModel um=(UserModel) session.getAttribute("currentuser");
            
            String qr2;
            qr2="insert into blogimg values(?,?,?)";
           
            PreparedStatement ps2;
            ps2= con.prepareStatement(qr2);
            ps2.setString(3, imgpath);
            ps2.setInt(1, um.getId());
            ps2.setString(2, null);
            ps2.executeUpdate();
            
          
              
              
              
              
              
              
              
              
            
            
            
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(RegisterDao.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       ;
}
}