/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;



/**
 *
 * @author Laboratorio
 */
public class Gastos {
    //atributos
    private int agua;
    private int luz;
    private int gas;
    private int aseo;
    private int contingencia;
    private Usuario user;
    private Lavanderia lav;
    //contructor completo
    public Gastos(int agua, int luz, int gas, int aseo, int contingencia, Usuario user, Lavanderia lav) {
        this.agua = agua;
        this.luz = luz;
        this.gas = gas;
        this.aseo = aseo;
        this.contingencia = contingencia;
        this.user = user;
        this.lav = lav;
    }
    //contructor vacio
    public Gastos(){}
    //geter y seter
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

    public Usuario getUser() {
        return user;
    }

    public Lavanderia getLav() {
        return lav;
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

    public void setUser(Usuario user) {
        this.user = user;
    }

    public void setLav(Lavanderia lav) {
        this.lav = lav;
    }
    //metodos
    public void GenerarReporte() {
        
    }
    public void GastoTotal() {
    
    }
    public int GastoMensual() {
        int total =  agua+luz+gas+aseo+contingencia;
        return total;
    }
    public int GastoIndividual(Edificio c) {
        int total =  (agua+luz+gas+aseo+contingencia)/c.getCantDeptos();
        return total;
    }
    public int cantidadDpto(Edificio c) {
        int cantidad = c.getCantDeptos();
        return cantidad;
    }
}
