/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Acciones;

/**
 *
 * @author calin
 */
public class Pila {
    private int contNodo = 0;
    private Nodo Cabeza;

    public int getContNodo() {
        return contNodo;
    }

    public Nodo getCabeza() {
        return Cabeza;
    }
    
    public void Push(Nodo N){
        
        contNodo++;
        if (Cabeza == null) {
            Cabeza = N;
        }else{
            N.setAbajo(Cabeza);
            Cabeza.setArriba(Cabeza);
            Cabeza = N;
        }
        
    }
    
    public void Pop(){
    
        if (contNodo > 0) {
            contNodo--;
            
            Cabeza = Cabeza.getAbajo();
        }
        
    }
    
    public String peek(){

        return Cabeza.getDato();
    
    }
}
