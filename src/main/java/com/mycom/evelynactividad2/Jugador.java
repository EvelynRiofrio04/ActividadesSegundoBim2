/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycom.evelynactividad2;

/**
 *
 * @author EVE-HP
 */
public class Jugador extends Persona{
    private String alias;
    private String consola;

    public Jugador(String alias, String consola, String nombre, String apellido, String cedula, int edad) {
        super(nombre, apellido, cedula, edad);
        this.alias = alias;
        this.consola = consola;
    }    
    
    /**
     * @return the alias
     */
    public String getAlias() {
        return alias;
    }

    /**
     * @param alias the alias to set
     */
    public void setAlias(String alias) {
        this.alias = alias;
    }

    /**
     * @return the consola
     */
    public String getConsola() {
        return consola;
    }

    /**
     * @param consola the consola to set
     */
    public void setConsola(String consola) {
        this.consola = consola;
    }
}
