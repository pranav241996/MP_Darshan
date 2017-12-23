package dao;

import Model.UserModel;
import java.sql.Connection;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import sendmail.SendMailSSL;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lenovo
 */
public class RegisterDao {
    Connection con;
    public boolean insertuser (UserModel um, ServletContext context,HttpSession session) 
    {
       
        try {
            boolean flag=false;
            
            System.out.println("Register dao me ageya");
            con=(Connection) context.getAttribute("datacon");
            int status=0;
            String qrl;
            qrl="insert into Registration values(?,?,?,?,?,?,?,?,?,?)";
           
            PreparedStatement ps;
            ps= con.prepareStatement(qrl);
            
            ps.setString(1,um.getName());
            ps.setString(2,um.getContact());
            ps.setString(3,um.getEmail());
            ps.setString(4,um.getCountry());
            ps.setString(5,um.getPassword());
            
            ps.setString(6,um.getSecque());
            ps.setString(7,um.getSecans());
           
            ps.setString(8, null);
            ps.setString(9,um.getOtpval());
            ps.setInt(10, status);
            ps.executeUpdate();
            
            
            
            
            String qr2;
            qr2="select id from Registration where email=?";
           
            PreparedStatement ps2;
            ps2= con.prepareStatement(qr2);
            ps2.setString(1, um.getEmail());
            ResultSet rs=ps2.executeQuery();
            
            if(rs.next())
            {
              int id=rs.getInt(1);
              
              um.setId(id);
              
              
              String qr3;
            qr3="insert into profileimg values(?,?)";
           
            String imgpath="D:\\shadabproject\\default.png";
            PreparedStatement ps3;
            ps3= con.prepareStatement(qr3);
            ps3.setInt(1,um.getId() );
            ps3.setString(2,imgpath);
            ps3.executeUpdate();
              
            um.setImgpath(imgpath);
              
              
              session.setAttribute("currentuser",um );
            
              
              SendMailSSL sml=new SendMailSSL();
              sml.verification(um.getEmail(), um.getOtpval());
            flag=true;
            return flag;
            }
            
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(RegisterDao.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        return false;
    }
    
}
