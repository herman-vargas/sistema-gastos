/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import datos.bdPagos;
import java.util.*;

/**
 *
 * @author Laboratorio
 */
public class Pago {
    
    private int cod_pago;
    private int valor;
    private Date fecha;
    private String estado;

  
    public Pago() {
    }
    
    public ArrayList<String> listarDeptos(int codigo){
    
        bdPagos lista = new bdPagos();
        
        return lista.traerListaDepto(codigo);
    }
    
    
    public Boolean MostrarDatos(Pago pag){
        
        bdPagos pago = new bdPagos();
        
        if(pago.muestra(pag)){
            return true;            
        }else{
            return false;
        }
    }
    
    
    public int getCod_pago() {
        return cod_pago;
    }

    public void setCod_pago(int cod_pago) {
        this.cod_pago = cod_pago;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
