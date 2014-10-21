/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;


import datos.bdMantenedorUsuario;
import datos.bdUsuario;
import java.util.*;

/**
 *
 * @author Laboratorio
 */
public class Usuario {
    private int cod_usuario;
    private String nombre;
    private String apellido;
    private int rut;
    private int perfil;
    private int sueldo;
    private String password;
    private Date fecha_ingreso;

      
    public Usuario(){}
    
 public Boolean CrearUsuario(Usuario cusu1){ 
     bdMantenedorUsuario cusu2 = new bdMantenedorUsuario();
      cusu2.crea(cusu1);
     return true;
       
  }  
   public Boolean EliminarUsuario(Usuario eusu1){
       bdMantenedorUsuario eusu2 = new bdMantenedorUsuario();
      eusu2.elimina(eusu1);
     return true; 
       
  } 
   public Boolean ModificarUsuario(Usuario musu1){
        bdMantenedorUsuario musu2 = new bdMantenedorUsuario();
      musu2.modifica(musu1);
     return true;
  }   
   private void BuscarUsuario(){  
  } 
   
  public ArrayList<String> listarUsuarioPerfil(Usuario u){
    
        bdUsuario lista = new bdUsuario();
        
        return lista.traerUsuarioPerfil(u);
    }   
   
public Boolean ValidarUsuario(Usuario usu){
    
        bdUsuario usua = new bdUsuario();
        
        if(usua.valida(usu)){
            
            return true;
        }else{
            return false;
        }
        
        
        
    }

    public int getCod_usuario() {
        return cod_usuario;
    }

    public void setCod_usuario(int cod_usuario) {
        this.cod_usuario = cod_usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public int getPerfil() {
        return perfil;
    }

    public void setPerfil(int perfil) {
        this.perfil = perfil;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(Date fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }
   
}
