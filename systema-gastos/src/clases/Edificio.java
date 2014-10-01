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

    public Edificio() {
    }
    
 private int CodEdificio;
 private String NombreEdificio;
 private String DirEdificio;
 private int CantDeptos;
 private String SectorEdificio;

    public int getCodEdificio() {
        return CodEdificio;
    }

    public String getNombreEdificio() {
        return NombreEdificio;
    }

    public String getDirEdificio() {
        return DirEdificio;
    }

    public int getCantDeptos() {
        return CantDeptos;
    }

    public String getSectorEdificio() {
        return SectorEdificio;
    }

    public Edificio(int CodEdificio, String NombreEdificio, String DirEdificio, int CantDeptos, String SectorEdificio) {
        this.CodEdificio = CodEdificio;
        this.NombreEdificio = NombreEdificio;
        this.DirEdificio = DirEdificio;
        this.CantDeptos = CantDeptos;
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
