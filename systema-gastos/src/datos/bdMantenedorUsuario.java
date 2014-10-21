/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import negocio.Usuario;

/**
 *
 * @author LuisMarcelo
 */
public class bdMantenedorUsuario {
    
  //+++++++++++++++++++++++++++++++++++++++++++  
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
 //CREAR USUARIO EN BASE DE DATOS   
    public Boolean crea(Usuario cusu3){
     conn = Conector.conectorBd();
     
     String nombre = cusu3.getNombre();
     String apellido = cusu3.getApellido();
     int rut = cusu3.getRut();
     int sueldo = cusu3.getSueldo();
     int perfil = cusu3.getPerfil();
      
     //String sql ="select * from usuario where rut="+us+" and password='"+pa+"'";
       String sql =" select pa_crear_usuario(?,?,?,?,?)"; 
     try{
            pst = conn.prepareStatement(sql);
            
            pst.setString(1, nombre);
            pst.setString(2, apellido);
            pst.setInt(3, rut);
            pst.setInt(4, sueldo);
            pst.setInt(5,perfil);
            
            //rs = pst.executeQuery();
            pst.execute();
            
            if(rs.next()){
               return true;
                
            }else {
           return false;
            
            }
            
        }catch(SQLException e){
            return false;
        }
       
    }
    
   //FIN CREAR USUARIO EN BASE DE DATOS 
    
 //+++++++++++++++++++++++++++++++++++++++++++++   
 //MODIFICAR USUARIO EN BDD   
 public Boolean modifica(Usuario musu3){
     conn = Conector.conectorBd();
     
     String nombre = musu3.getNombre();
     String apellido = musu3.getApellido();
     int rut = musu3.getRut();
     int sueldo = musu3.getSueldo();
     int perfil = musu3.getPerfil();
      
     //String sql ="select * from usuario where rut="+us+" and password='"+pa+"'";
       String sql =" select pa_modificar_usuario(?,?,?,?,?)"; 
     try{
            pst = conn.prepareStatement(sql);
            
            pst.setString(1, nombre);
            pst.setString(2, apellido);
            pst.setInt(3, rut);
            pst.setInt(4, sueldo);
            pst.setInt(5,perfil);
            
            //rs = pst.executeQuery();
            pst.execute();
            
            if(rs.next()){
               return true;
                
            }else {
           return false;
            
            }
            
        }catch(SQLException e){
            return false;
        }
       
    }
    
//FIN MODIFICAR USUARIO EN BDD
//+++++++++++++++++++++++++++++++++++++++++++++++   
//ELIMINAR USUARIO EN BDD 
 
 public Boolean elimina(Usuario eusu3){
     conn = Conector.conectorBd();
     
     String nombre = eusu3.getNombre();
     String apellido = eusu3.getApellido();
     int rut = eusu3.getRut();
     int sueldo = eusu3.getSueldo();
     int perfil = eusu3.getPerfil();
      
     //String sql ="select * from usuario where rut="+us+" and password='"+pa+"'";
       String sql =" select pa_eliminar_usuario(?,?,?,?,?)"; 
     try{
            pst = conn.prepareStatement(sql);
            
            pst.setString(1, nombre);
            pst.setString(2, apellido);
            pst.setInt(3, rut);
            pst.setInt(4, sueldo);
            pst.setInt(5,perfil);
            
            //rs = pst.executeQuery();
            pst.execute();
            
            if(rs.next()){
               return true;
                
            }else {
           return false;
            
            }
            
        }catch(SQLException e){
            return false;
        }
       
    }
    
 
 
 //+++++++++++++++++++++++++++++++++++++++++++++++++
}
