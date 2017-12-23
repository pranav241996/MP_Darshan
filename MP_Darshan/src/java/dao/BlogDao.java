/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Model.UserModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Lenovo
 */
public class BlogDao {
    Connection con;
    public boolean writeblog (String blog, ServletContext context,HttpSession session) 
    {
       
        try {
            boolean flag=false;
            
            System.out.println("Register dao me ageya");
            con=(Connection) context.getAttribute("datacon");
            
            String qrl;
            qrl="insert into blog values(?,?,?)";
            UserModel um=(UserModel) session.getAttribute("currentuser");
            PreparedStatement ps;
            ps= con.prepareStatement(qrl);
            
            ps.setInt(1,um.getId());
            ps.setString(2,blog);
           ps.setString(3, null);
            ps.executeUpdate();
            
            
            flag=true;
          return flag;
            
            
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(RegisterDao.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        return false;
    }
}
