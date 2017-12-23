
package connection;
import java.sql.Connection;
import java.sql.DriverManager;
public class Mycon {
 private static Connection con;//con object have single copy
 public static Connection getCon(){
  try {
  if(con==null || con.isClosed()){
  Class.forName("com.mysql.jdbc.Driver");
   con=DriverManager.getConnection
   ("jdbc:mysql://localhost:3306/mp darshan","root","");
  } 
  } catch (Exception e) {
  e.printStackTrace(); }
  return con;
 }

}
