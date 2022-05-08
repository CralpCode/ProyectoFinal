/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Usuarios;

import Binarios.SerializarObjeto;
import Generadores.*;
import java.io.Serializable;
import javax.swing.JButton;

/**
 *
 * @author calin
 */
public class GuardBtns implements Serializable{
    
    private JButton[] BotonesGuar = new JButton[12];
    private JButton[] BotonesGuar2 = new JButton[12];
    
    public void Guardado(){
         for (int i = 0; i < 12; i++) {
            BotonesGuar[i] = Boton.Jugador1[i];
                System.out.println("Botones " + BotonesGuar[i]);
            BotonesGuar2[i] = Boton.Jugador2[i];
                System.out.println("Botones " + BotonesGuar2[i]);
        }
        SerializarObjeto.serializarObjeto(CrearUsuarios.UsuGuard[CrearUsuarios.valor]+".txt", this);
    }

    public JButton[] getBotonesGuar() {
        return BotonesGuar;
    }

    public JButton[] getBotonesGuar2() {
        return BotonesGuar2;
    }
    
}
