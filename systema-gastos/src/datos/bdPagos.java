/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;
import java.sql.*;
import negocio.Pago;

/**
 *
 * @author Profesor
 */
public class bdPagos {
    
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
    public Boolean muestra(Pago p){
        conn = Conector.conectorBd();
        
        int cp = p.getCod_pago();
        
        String sql ="select * from pago where cod_pago="+cp+";";
        
        try{
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if(rs.next()){
               return true;
                
            }else {
           return false;
            
            }
            
        }catch(Exception e){
            return false;        
    }    
}
}
