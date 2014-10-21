/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;
import negocio.Lavanderia;


/**
 *
 * @author Profesor
 */
public class bdLavanderia {
    
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
        
    
    public Boolean comprarficha(Lavanderia lav) {
        conn = Conector.conectorBd();
        
      int  cod = lav.getCodDepto();
      Date fec = lav.getFecha();
      int cant = lav.getCant_ficha();
      int val = lav.getValor();
      
      String sql = "insert into (cod_lavanderia,cantidad_fichas,fecha,valor_ficha,cod_depto)values("+cod+",'"+fec+"',"+cant+","+val+")" ;
      //String sql ="select * from usuario where rut=" + us+" and password='" + pa +"'";
      
        try {
            pst = conn.prepareStatement(sql);
            rs= pst.executeQuery();
            
           if(rs.next()){
               return true;
                
            }else {
           return false;
           }
           } catch (Exception e) {
               return false;
           }
        }
}   
      


