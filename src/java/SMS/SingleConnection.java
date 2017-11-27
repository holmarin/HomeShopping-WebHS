package SMS;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SingleConnection {
    
    private final String base = "homeshopping";
    private final String user = "holmarin18";
    private final String password = "Col$172017";
    private final String url = "jdbc:mysql://db4free.net:3307/" + base +"?&useSSL=false";
    public Connection con = null;
    
    public String getMobile(String user)
    {
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(this.url, this.user, this.password);
            System.out.println("Conexión OK");
            String mobile=null;
            PreparedStatement consulta = con.prepareStatement("SELECT mobile FROM tbl_user WHERE username="+user);
            consulta.setString(1, mobile);
            ResultSet resultado = consulta.executeQuery();
            while(resultado.next()){
                mobile = resultado.getString("mobile");
            }
            
        } catch(SQLException e)
        {
            System.err.println(e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SingleConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        String mobile = null;
      return mobile;  
    }

    PreparedStatement prepareStatement(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

