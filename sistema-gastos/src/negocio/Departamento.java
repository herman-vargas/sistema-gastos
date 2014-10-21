/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;



/**
 *
 * @author Laboratorio
 */
public class Departamento {

    public Departamento() {
    }
    
    
 
 private int CodDepto;
 private Pago PagoDepto;
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

    public Pago getPagoDepto() {
        return PagoDepto;
    }

    public void setPagoDepto(Pago PagoDepto) {
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
