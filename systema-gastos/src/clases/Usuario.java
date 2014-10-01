/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Laboratorio
 */
public class Usuario {
    private int rut;
    private String nombre;
    private String apellido;
    private int sueldo;
    private String perfil;

    public Usuario(int rut, String nombre, String apellido, int sueldo, String perfil) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldo = sueldo;
        this.perfil = perfil;
    }
    
    public Usuario(){}
    
    
}
