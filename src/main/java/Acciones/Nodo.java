/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Acciones;

/**
 *
 * @author calin
 */
public class Nodo {
    private String Dato;
    private Nodo Arriba;
    private Nodo Abajo;

    public String getDato() {
        return Dato;
    }

    public Nodo getArriba() {
        return Arriba;
    }

    public Nodo getAbajo() {
        return Abajo;
    }

    public void setDato(String Dato) {
        this.Dato = Dato;
    }

    public void setArriba(Nodo Arriba) {
        this.Arriba = Arriba;
    }

    public void setAbajo(Nodo Abajo) {
        this.Abajo = Abajo;
    }
    
    
    
}
