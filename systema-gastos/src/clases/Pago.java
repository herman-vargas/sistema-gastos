/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

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

    public Pago(int cod_pago, int valor, Date fecha, String estado) {
        this.cod_pago = cod_pago;
        this.valor = valor;
        this.fecha = fecha;
        this.estado = estado;
    }

    public Pago() {
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
