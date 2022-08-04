/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycom.evelynactividad2;

/**
 *
 * @author EVE-HP
 */
public class Partida {
    private String nombreJuego;
    private String tipoJuego;
    private int puntaje;
    private String fecha;

    public Partida(String nombreJuego, String tipoJuego, int puntaje, String fecha) {
        this.nombreJuego = nombreJuego;
        this.tipoJuego = tipoJuego;
        this.puntaje = puntaje;
        this.fecha = fecha;
    }
    
    
    
    /**
     * @return the nombreJuego
     */
    public String getNombreJuego() {
        return nombreJuego;
    }

    /**
     * @param nombreJuego the nombreJuego to set
     */
    public void setNombreJuego(String nombreJuego) {
        this.nombreJuego = nombreJuego;
    }

    /**
     * @return the tipoJuego
     */
    public String getTipoJuego() {
        return tipoJuego;
    }

    /**
     * @param tipoJuego the tipoJuego to set
     */
    public void setTipoJuego(String tipoJuego) {
        this.tipoJuego = tipoJuego;
    }

    /**
     * @return the puntaje
     */
    public int getPuntaje() {
        return puntaje;
    }

    /**
     * @param puntaje the puntaje to set
     */
    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
