/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listener;

import static com.oracle.jrockit.jfr.Transition.To;
import connection.Mycon;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Web application lifecycle listener.
 *
 * @author lenovo
 */
public class ConnectionListener implements ServletContextListener {

    
    Connection con;
      
    @Override
    public void contextInitialized(ServletContextEvent sce) {
       
    System.out.println("handler---> dbinit jara");
        con=Mycon.getCon();
        System.out.println("dbinit se wapas handler me");
        ServletContext context=sce.getServletContext();
        
        System.out.println("Connection handler me he abhi");
        
        context.setAttribute("datacon",con);
        
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionListener.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
