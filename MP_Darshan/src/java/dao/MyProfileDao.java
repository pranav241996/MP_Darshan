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
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Lenovo
 */
public class MyProfileDao {
     Connection con;
    public void getblog (UserModel um, ServletContext context,HttpSession session) 
    {
         try {
             con=(Connection) context.getAttribute("datacon");
             
             String qr="select * from blog where id=?";
             um=(UserModel) session.getAttribute("currentuser");
             
             PreparedStatement ps2;
             ps2= con.prepareStatement(qr);
             
             ps2.setInt(1, um.getId() );
             ResultSet rs=ps2.executeQuery();
             ArrayList<String> ab=new ArrayList<>();
             while(rs.next())
             {
                 String blog=rs.getString(2);
                 
               ab.add(blog);
             }
             
              um.setMyblog(ab);
              
              for(String abc : ab )
              {
                  System.out.println("abc");
              }
              
              
              
              
               String qr2="select * from blogimg where id=?";
             
             
             PreparedStatement ps3;
             ps3= con.prepareStatement(qr2);
             
             ps3.setInt(1, um.getId() );
             ResultSet rs3=ps3.executeQuery();
             ArrayList<String> ab3=new ArrayList<>();
             while(rs3.next())
             {
                 String blog=rs3.getString(3);
                 
               ab3.add(blog);
             }
             
              um.setImg(ab3);
              
              
            session.setAttribute("currentuser", um);
         } catch (SQLException ex) {
             Logger.getLogger(MyProfileDao.class.getName()).log(Level.SEVERE, null, ex);
         }
          
    }
}
