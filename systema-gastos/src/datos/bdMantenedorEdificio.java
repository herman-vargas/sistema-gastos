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
import negocio.Edificio;

/**
 *
 * @author LuisMarcelo
 */
public class bdMantenedorEdificio {
    
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
 //+++++++++++++++++++++++++++++++++++++++++++++   
 //CREAR EDIFICIO EN BASE DE DATOS   
    public Boolean crea(Edificio ced3){
     conn = Conector.conectorBd();
     
     String nombre_ed = ced3.getNombreEdificio();
     String direccion_ed = ced3.getDirEdificio();
     int cantidad_depto = ced3.getCodEdificio();
     String sector_ed = ced3.getSectorEdificio();
          
     //String sql ="select * from usuario where rut="+us+" and password='"+pa+"'";
       String sql =" select pa_crear_edificio(?,?,?,?)"; 
     try{
            pst = conn.prepareStatement(sql);
            
            pst.setString(1, nombre_ed);
            pst.setString(2, direccion_ed);
            pst.setInt(3, cantidad_depto);
            pst.setString(4, sector_ed);
                        
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
    
   //FIN CREAR EDIFICIO EN BASE DE DATOS 
    
  //+++++++++++++++++++++++++++++++++++++++++++++
    //MODIFICAR EDIFICIO EN BASE DE DATOS   
    public Boolean modifica(Edificio med3){
     conn = Conector.conectorBd();
     String nombre_ed = med3.getNombreEdificio();
     String direccion_ed = med3.getDirEdificio();
     int cantidad_depto = med3.getCodEdificio();
     String sector_ed = med3.getSectorEdificio();
          
     //String sql ="select * from usuario where rut="+us+" and password='"+pa+"'";
       String sql =" select pa_crear_edificio(?,?,?,?)"; 
     try{
            pst = conn.prepareStatement(sql);
            
            pst.setString(1, nombre_ed);
            pst.setString(2, direccion_ed);
            pst.setInt(3, cantidad_depto);
            pst.setString(4, sector_ed);
                        
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
    
   //FIN MODIFICAR EDIFICIO EN BASE DE DATOS 
    
    //++++++++++++++++++++++++++++++++++++++++++++
    
    //ELIMINAR EDIFICIO EN BASE DE DATOS   
    public Boolean elimina(Edificio eed3){
     conn = Conector.conectorBd();
     String nombre_ed = eed3.getNombreEdificio();
     String direccion_ed = eed3.getDirEdificio();
     int cantidad_depto = eed3.getCodEdificio();
     String sector_ed = eed3.getSectorEdificio();
          
     //String sql ="select * from usuario where rut="+us+" and password='"+pa+"'";
       String sql =" select pa_crear_edificio(?,?,?,?)"; 
     try{
            pst = conn.prepareStatement(sql);
            
            pst.setString(1, nombre_ed);
            pst.setString(2, direccion_ed);
            pst.setInt(3, cantidad_depto);
            pst.setString(4, sector_ed);
                        
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
    
   //FIN MODIFICAR EDIFICIO EN BASE DE DATOS 
    
}
