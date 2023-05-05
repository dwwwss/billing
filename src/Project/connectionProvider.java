
package Project;
import java.sql.*;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class connectionProvider {
    
    public  static Connection getCon()
           
    {
      try  
      {
      Class.forName("com.mysql.jdbc.Driver");
      Connection con =(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306//bm","root","12345");
      return con;
      }
      catch(Exception e)
      {
      return null ;
      }
        
        
        
    }    
}
    
    
    
    
    
    
    

