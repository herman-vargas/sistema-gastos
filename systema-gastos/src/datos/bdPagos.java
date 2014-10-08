/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;
import java.sql.*;
import java.util.ArrayList;
import negocio.*;

/**
 *
 * @author Profesor
 */
public class bdPagos {
    
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
    Departamento Lista = null;
    
    
    public ArrayList<String> traerListaDepto(int codigo){
        conn =Conector.conectorBd();
        
        String sql="select * from departamento where cod_edificio="+codigo+";";
        
        try {
           // pst=conn.prepareStatement(sql);
          //  rs=pst.executeQuery();
            
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            
            ArrayList<String> ls =new ArrayList<String>();
            while(rs.next()){
                ls.add(String.valueOf(rs.getInt("num_depto")));
            }
            return ls;
  
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        finally{
            try {
                conn.close();
            } catch (Exception e) {
                 e.printStackTrace();
            }
        }
    
    
    }
    
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
