/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Usuarios;

import Binarios.SerializarObjeto;
import Generadores.*;
import Acciones.*;
import com.juegos.proyectofinal.UI.Interme;
import java.io.Serializable;
import javax.swing.JButton;

/**
 *
 * @author calin
 */
public class GuardBtns implements Serializable{
    
    private JButton[] BotonesGuar = new JButton[12];
    private JButton[] BotonesGuar2 = new JButton[12];
    private int retomaturno = 0;
    private int retomaJug = 0;
    private int retomamuerte1 = 0;
    private int retomamuerte2 = 0;
    
    public void Guardado(){
         for (int i = 0; i < 12; i++) {
            BotonesGuar[i] = Boton.Jugador1[i];
                System.out.println("Botones " + BotonesGuar[i]);
            BotonesGuar2[i] = Boton.Jugador2[i];
                System.out.println("Botones " + BotonesGuar2[i]);
                retomaturno = Interme.turnos;
                System.out.println("Valor del turno" + Interme.turnos);
                retomaJug = BotonAccion.Jug; 
                retomamuerte1 = Interme.muerte1;
                retomamuerte2 = Interme.muerte2;
        }
        SerializarObjeto.serializarObjeto(CrearUsuarios.UsuGuard[CrearUsuarios.valor]+".bin", this);
    }

    public JButton[] getBotonesGuar() {
        return BotonesGuar;
    }

    public JButton[] getBotonesGuar2() {
        return BotonesGuar2;
    }

    public int getRetomaturno() {
        return retomaturno;
    }

    public int getRetomaJug() {
        return retomaJug;
    }

    public int getRetomamuerte1() {
        return retomamuerte1;
    }

    public int getRetomamuerte2() {
        return retomamuerte2;
    }
    
}
