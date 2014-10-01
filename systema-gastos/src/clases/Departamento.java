/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import systema.gastos.Lavanderia;
import systema.gastos.Pagos;

/**
 *
 * @author Laboratorio
 */
public class Departamento {

    public Departamento() {
    }
    
    
 
 private int CodDepto;
 private Pagos PagoDepto;
 private String NombreCopropietario;
 private String EstadoDepto;
 private String NombreDuenoDepto;
 private Lavanderia LavanderiaDepto;
 
 
   private void ModificarDepto(){  
  }  
   private void BuscarDepto(){  
  } 
 
  private void GenerarReporteUsuario(){      
  } 

    public int getCodDepto() {
        return CodDepto;
    }

    public void setCodDepto(int CodDepto) {
        this.CodDepto = CodDepto;
    }

    public Pagos getPagoDepto() {
        return PagoDepto;
    }

    public void setPagoDepto(Pagos PagoDepto) {
        this.PagoDepto = PagoDepto;
    }

    public String getNombreCopropietario() {
        return NombreCopropietario;
    }

    public void setNombreCopropietario(String NombreCopropietario) {
        this.NombreCopropietario = NombreCopropietario;
    }

    public String getEstadoDepto() {
        return EstadoDepto;
    }

    public void setEstadoDepto(String EstadoDepto) {
        this.EstadoDepto = EstadoDepto;
    }

    public String getNombreDuenoDepto() {
        return NombreDuenoDepto;
    }

    public void setNombreDuenoDepto(String NombreDuenoDepto) {
        this.NombreDuenoDepto = NombreDuenoDepto;
    }

    public Lavanderia getLavanderiaDepto() {
        return LavanderiaDepto;
    }

    public void setLavanderiaDepto(Lavanderia LavanderiaDepto) {
        this.LavanderiaDepto = LavanderiaDepto;
    }
 
 
}
