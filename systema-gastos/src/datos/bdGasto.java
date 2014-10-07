/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import negocio.Gastos;

/**
 *
 * @author Profesor
 */
public class bdGasto {
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    public Boolean iGasto(Gastos g){
     conn = Conector.conectorBd();
     
     int luz = g.getLuz();
     int agua = g.getAgua();
     int gas = g.getGas();
     int aseo = g.getAseo();
     int contingencia = g.getContingencia();
     int sueldo = g.getSueldo();
     int mes = g.getMes();
     int anio = g.getAnio();
     String fecha = anio+"-"+mes+"-01";
     
     String sql="insert into gasto(agua,luz,gas,aseo,contingencia,fecha) values ("+luz+","+agua+","+gas+","+aseo+","+contingencia+",'"+fecha+"')";
        try{
            pst = conn.prepareStatement(sql);
            if(pst.execute()){
               return true;
            }else {
           return false;
            } 
        }catch(Exception e){
            return false;
        }
    }
}
