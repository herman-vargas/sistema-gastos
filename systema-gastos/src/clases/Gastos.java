/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import systema.gastos.Lavanderia;

/**
 *
 * @author Laboratorio
 */
public class Gastos {
    private int agua;
    private int luz;
    private int gas;
    private int aseo;
    private int contingencia;
    private Usuario user;
    private Lavanderia lav;

    public Gastos(int agua, int luz, int gas, int aseo, int contingencia, Usuario user, Lavanderia lav) {
        this.agua = agua;
        this.luz = luz;
        this.gas = gas;
        this.aseo = aseo;
        this.contingencia = contingencia;
        this.user = user;
        this.lav = lav;
    }
    
    public Gastos(){}
    
}
