/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Laboratorio
 */
public class Edificio {

   
    
 private int CodEdificio;
 private String NombreEdificio;
 private String DirEdificio;
 private int CantDeptos;
 private String SectorEdificio;
 public Edificio() {
    }

    public Edificio(int CodEdificio, String NombreEdificio, String DirEdificio, int CantDeptos, String SectorEdificio) {
        this.CodEdificio = CodEdificio;
        this.NombreEdificio = NombreEdificio;
        this.DirEdificio = DirEdificio;
        this.CantDeptos = CantDeptos;
        this.SectorEdificio = SectorEdificio;
    }
 
 
    public int getCodEdificio() {
        return CodEdificio;
    }

    public void setCodEdificio(int CodEdificio) {
        this.CodEdificio = CodEdificio;
    }

    public String getNombreEdificio() {
        return NombreEdificio;
    }

    public void setNombreEdificio(String NombreEdificio) {
        this.NombreEdificio = NombreEdificio;
    }

    public String getDirEdificio() {
        return DirEdificio;
    }

    public void setDirEdificio(String DirEdificio) {
        this.DirEdificio = DirEdificio;
    }

    public int getCantDeptos() {
        return CantDeptos;
    }

    public void setCantDeptos(int CantDeptos) {
        this.CantDeptos = CantDeptos;
    }

    public String getSectorEdificio() {
        return SectorEdificio;
    }

    public void setSectorEdificio(String SectorEdificio) {
        this.SectorEdificio = SectorEdificio;
    }


 
 
 
    private void CrearEdificio(){      
  }  
   private void Eliminaredificio(){
  } 
   private void ModificarEdificio(){  
  }  
   private void BuscarEdificio(){  
  } 
 
}
