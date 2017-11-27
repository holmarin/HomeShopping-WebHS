package controlador;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class clConnection {

    private String driver="com.mysql.jdbc.Driver";
    private String url="jdbc:mysql://db4free.net:3307/homeshopping"+"?&useSSL=false";
    private String usr="holmarin18";
    private String pwd="Col$172017";
    private Connection conn;
    
    public clConnection(){
        try {
            Class.forName(driver);
            conn=(Connection) DriverManager.getConnection(url, usr, pwd);
            
            
        }catch (ClassNotFoundException | SQLException error){
           System.err.println("Eror de conexión " + error);
     }
    }
    
    public  Connection getclConnection(){
        return conn;
    }
    
    public static void main (String[] args ){
        clConnection conn = new clConnection();
        
    }
}
