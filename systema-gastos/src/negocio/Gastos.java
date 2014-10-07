/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import datos.bdGasto;


/**
 *
 * @author Laboratorio
 */
public class Gastos {
    //atributos
    private int cod_gasto;
    private int agua;
    private int luz;
    private int gas;
    private int aseo;
    private int contingencia;
    private int sueldo;
    private int mes;
    private int anio;
       
    //contructor vacio
    public Gastos(){}

    //geter y seter
    public int getMes() {
        return mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    public int getSueldo() {
        return sueldo;
    }
    
    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
    
    public void setCod_gasto(int cod_gasto) {
        this.cod_gasto = cod_gasto;
    }

    public void setAgua(int agua) {
        this.agua = agua;
    }

    public void setLuz(int luz) {
        this.luz = luz;
    }

    public void setGas(int gas) {
        this.gas = gas;
    }

    public void setAseo(int aseo) {
        this.aseo = aseo;
    }

    public void setContingencia(int contingencia) {
        this.contingencia = contingencia;
    }

    public int getCod_gasto() {
        return cod_gasto;
    }

    public int getAgua() {
        return agua;
    }

    public int getLuz() {
        return luz;
    }

    public int getGas() {
        return gas;
    }

    public int getAseo() {
        return aseo;
    }

    public int getContingencia() {
        return contingencia;
    }
            
    //metodos
    public void GenerarReporte() {
        
    }
    public void GastoTotal() {
    
    }
    public int GastoMensual() {
        int total =  agua+luz+gas+aseo+contingencia+sueldo;
        return total;
    }
    public int GastoIndividual(Edificio c) {
        int total =  (agua+luz+gas+aseo+contingencia+sueldo)/c.getCantDeptos();
        return total;
    }
    public int cantidadDpto(Edificio c) {
        int cantidad = c.getCantDeptos();
        return cantidad;
    }
    public int ObtenerMes(String mes){
        int intMes = 0;
        switch(mes){
            case "Enero":
                intMes = 1;
            break;
            case "Febrero":
                intMes = 2;
            break;
            case "Marzo":
                intMes = 3;
            break;
            case "Abril":
                intMes = 4;
            break;
            case "Mayo":
                intMes = 5;
            break;
            case "Junio":
                intMes = 6;
            break;
            case "Julio":
                intMes = 7;
            break;
            case "Agosto":
                intMes = 8;
            break;
            case "Septiembre":
                intMes = 9;
            break;
            case "Octubre":
                intMes = 10;
            break;
            case "Noviembre":
                intMes = 11;
            break;
            case "Diciembre":
                intMes = 12;
            break;
        }
        return intMes;
    }
    public Boolean IngresarGasto(Gastos g){
        bdGasto gasto = new bdGasto();
        
        if(gasto.iGasto(g)){
            return true;
        }else{
            return false;
        }
    }
}
