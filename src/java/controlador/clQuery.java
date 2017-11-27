package controlador;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class clQuery extends clConnection {

    public boolean mtAuthentication(String username, String password){
        PreparedStatement preparedst=null;
        ResultSet resultst=null;
        try{
            String stconsulta="Select * from tbl_user where username=? and password=?";
            preparedst =getclConnection().prepareStatement(stconsulta);
            preparedst.setString(1,username);
            preparedst.setString(2,password);
            resultst=preparedst.executeQuery();
            
            if (resultst.absolute(1)){
                return true;
                
                
            }
        }catch(SQLException error){
            System.err.println("Eror " + error);
            
        }finally{
            try {
            if(getclConnection()!=null) getclConnection().close();
            if(preparedst!=null) preparedst.close();
            if(resultst!=null) resultst.close();
            } catch (SQLException ex) {
                Logger.getLogger(clQuery.class.getName()).log(Level.SEVERE, null, ex);
                System.err.println("Eror " + ex);
            }
                
            
            
        }
        
        return false;
    }
    
    public boolean mtRecord(String username, String password){
        PreparedStatement preparedst=null;
        try{
            String strecord="INSERT INTO tbl_user (username, password) VALUES(?,?)";
            preparedst=getclConnection().prepareStatement(strecord);
            preparedst.setString(1, username);
            preparedst.setString(2, password);
            if(preparedst.executeUpdate()==1){
                return true;
            }
        }catch(SQLException error){
            System.err.println("Eror " + error);
        }finally{
              try {
            if(null!=getclConnection()) getclConnection().close();
            if(preparedst !=null) preparedst.close();
            } catch (SQLException ex) {
                //Logger.getLogger(clQuery.class.getName()).log(Level.SEVERE, null, ex);
                System.err.println("Eror " + ex);
            }
        }
        return false;
    }


    
}
