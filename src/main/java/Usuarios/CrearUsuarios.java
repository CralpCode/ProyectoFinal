/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Usuarios;


import Binarios.SerializarObjeto;
import Generadores.*;
import com.juegos.proyectofinal.UI.Jugadores;
import java.io.Serializable;
import javax.swing.JButton;


/**
 *
 * @author calin
 */


public class CrearUsuarios extends javax.swing.JPanel implements Serializable{

    public static int contador = 0;
    public static int valor = 0;
    private int valor2 = 0;
    public static JButton[] Botones = new JButton[5];
    public static String[] UsuGuard = new String[5]; 
    private JButton[] Botonera = new JButton[5];
    private String[] UsuGuard2 = new String[5]; 
    private JButton[] BotonesGuar = new JButton[12];
    private JButton[] BotonesGuar2 = new JButton[12];
    public static String[] UsuGuardGuar = new String[5]; 
    
    
  
     public  void CargarUs(){
        CrearUsuarios AnteUs= SerializarObjeto.deserializarObjeto("GurdadoUsusarios.txt", CrearUsuarios.class);
        if(AnteUs == null){
            System.out.println("nuloooo");
            new Jugadores().getjButton3().setEnabled(false);
             
        }
        if(AnteUs != null){
            valor=AnteUs.valor2;
            System.out.println("AnteUs Valor" + AnteUs.valor2);
            System.out.println("AnteUs Valor" + AnteUs.UsuGuard2[1]);
            System.out.println("AnteUs Valor" + AnteUs.Botonera[1]);
            System.out.println("nno essss nuloooo");
            for (int i = 1; i <= valor; i++) {
            UsuGuard[i] = AnteUs.UsuGuard2[i];
            Botones[i] = AnteUs.Botonera[i];        
            Botones[i].setText(i + " Jugador " + AnteUs.UsuGuard2[i]);
            System.out.println("valores de btns " + AnteUs.UsuGuard2[i]);
        }
            AnteUs.Listado();
            new ListadeUsuarios().initcreation();
            new Jugadores().getjButton3().setEnabled(true);
        }
    }
    
    public void GaurdarUs(String nombre){
        valor = valor + 1; 
        contador = valor;
        valor2 = valor;
        UsuGuard[valor] = nombre;
        UsuGuard2[valor]= UsuGuard[valor];
        System.out.println("La matriz " + valor);
        for (int i = 1; i <= valor; i++) {
                System.out.println("Matrices que hay");
                System.out.println("Botones " +UsuGuard[i]);
            
             
        }
        
    }
    
    public void Listado(){
        System.out.println("La matriz ");
        for (int i = 1; i <= valor; i++) {
            Botones[i] = new JButton();
            Botonera[i]= Botones[i];
            Botones[i].setBounds(150,i*30, 200, 20);
            Botones[i].setText(i + " Jugador " + UsuGuard[i]);
            Botones[i].setVisible(true);
            
        }
    }
    
    public void BtnsCopia(){
        for (int i = 0; i < 12; i++) {
            BotonesGuar[i] = Boton.Jugador1[i];
                System.out.println("Botones " + BotonesGuar[i]);
            BotonesGuar2[i] = Boton.Jugador2[i];
                System.out.println("Botones " + BotonesGuar2[i]);
        }
    }
    public void GuardUsBtn(){        
        GuardBtns guardBtns = new GuardBtns();
        guardBtns.Guardado();
        SerializarObjeto.serializarObjeto("GurdadoUsusarios.txt", this);
    }

    public JButton[] getBotonesGuar() {
        return BotonesGuar;
    }

    public JButton[] getBotonesGuar2() {
        return BotonesGuar2;
    }

    
    
    
}
