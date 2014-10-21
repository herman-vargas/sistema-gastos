/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import negocio.Gastos;
import negocio.Usuario;
/**
 *
 * @author Profesor
 */
public class bdUsuario {
    
    
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
    public Boolean valida(Usuario u){
     conn = Conector.conectorBd();
     
     int us =u.getRut();
     String pa =u.getPassword();
     //int pe = u.getPerfil();
     
     String sql ="select * from usuario where rut="+us+" and password='"+pa+"'";
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
   // validacion con perfil 
  public ArrayList<String> traerUsuarioPerfil(Usuario u){
        conn =Conector.conectorBd();
       int us =u.getRut();
       String pa =u.getPassword();
     //int pe = u.getPerfil();
     
     //String sql ="select * from usuario where rut="+us+" and password='"+pa+"'";
    // String sql="select u.nombre, u.perfil, e.nombre as edificio\n" +
//"from usuario u inner join edificio e on (e.cod_edificio=u.cod_edificio) where rut="+us+" and password='"+pa+"'";   
       String sql = "select u.nombre, u.perfil, e.nombre as edificio, u.cod_edificio\n" +
"from usuario u, edificio e \n" +
"where e.cod_edificio=u.cod_edificio and rut="+us+" and password='"+pa+"'";
       
       try {
           // pst=conn.prepareStatement(sql);
          //  rs=pst.executeQuery();
            
            pst = conn.prepareStatement(sql);
            
            rs = pst.executeQuery();
           // JOptionPane.showMessageDialog(null, sql);
            
            ArrayList<String> ls =new ArrayList<String>();
            while(rs.next()){
               ls.add(String.valueOf(rs.getString("nombre")));
                ls.add(String.valueOf(rs.getInt("perfil")));
                ls.add(rs.getString("edificio"));
                ls.add(String.valueOf(rs.getInt("cod_edificio")));
                
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
    
    
}
