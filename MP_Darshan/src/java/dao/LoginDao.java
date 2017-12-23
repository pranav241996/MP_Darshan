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
public class LoginDao {
    Connection con;
    public boolean verifyuser (UserModel um, ServletContext context,HttpSession session) 
    {
       
        try {
            boolean flag=false;
            
            System.out.println("LOgin dao me ageya");
            con=(Connection) context.getAttribute("datacon");
            String qrl;
            
            
            
            String qr2;
            qr2="select * from Registration where Email=? and Password=? and status=1";
           
            PreparedStatement ps2;
            ps2= con.prepareStatement(qr2);
            ps2.setString(1, um.getEmail());
            ps2.setString(2, um.getPassword());
            ResultSet rs=ps2.executeQuery();
            
            if(rs.next())
            {
              
              um.setName(rs.getString(1));
              um.setContact(rs.getString(2));
              um.setEmail(rs.getString(3));
              um.setCountry(rs.getString(4));
            
              um.setId(rs.getInt(8));
              
              
              
              
              
              
              
              
              
              session.setAttribute("currentuser",um );
            
            flag=true;
            return flag;
            }
            
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(RegisterDao.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        return false;
}
    
    
    public String getimgpath (int id, ServletContext context) 
    {
        try {
            String imgpath=null;
            con=(Connection) context.getAttribute("datacon");
            String qr3;
            qr3="select imgpath from profileimg where id=?";
           
            PreparedStatement ps3;
            ps3= con.prepareStatement(qr3);
            ps3.setInt(1,id);
            
            ResultSet rs3=ps3.executeQuery();
            
            if(rs3.next())
            {
                imgpath=rs3.getString(1);
                return imgpath;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(LoginDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    
    
    
    
    
    
    
    
    
    public boolean verifylink (UserModel um, ServletContext context,HttpSession session) 
    {
       
        try {
            boolean flag=false;
            
            
            con=(Connection) context.getAttribute("datacon");
            String qrl;
            
            
            
            String qr2;
            qr2="update  Registration set status=1 where Email=? and Password=? and otpval=?";
           
            PreparedStatement ps2;
            ps2= con.prepareStatement(qr2);
            ps2.setString(1, um.getEmail());
            ps2.setString(2, um.getPassword());
            ps2.setString(3, um.getOtpval());
          ps2.executeUpdate();
            
          
          
           String qr3;
            qr3="select * from Registration where Email=? and Password=?";
           
            PreparedStatement ps3;
            ps3= con.prepareStatement(qr3);
            ps3.setString(1, um.getEmail());
            ps3.setString(2, um.getPassword());
            ResultSet rs=ps3.executeQuery();
          
            if(rs.next())
            {
              
              um.setName(rs.getString(1));
              um.setContact(rs.getString(2));
              um.setEmail(rs.getString(3));
              um.setCountry(rs.getString(4));
            
              um.setId(rs.getInt(8));
              
              
              
              
              
              
              
              
              
              session.setAttribute("currentuser",um );
            
            flag=true;
            return flag;
            }
            
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(RegisterDao.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        return false;
}
    
    
    
    
    
    
    
}