/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Generadores;

import Acciones.BotonAccion;
import Binarios.SerializarObjeto;
import Juegos.JDamas;
import Usuarios.CrearUsuarios;
import Usuarios.GuardBtns;
import com.juegos.proyectofinal.UI.Interme;
import java.io.Serializable;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author calin
 */
public class Boton extends javax.swing.JFrame implements Serializable{
     
    public static javax.swing.JButton[]  Jugador1 = new javax.swing.JButton[100];
    public static javax.swing.JButton[]  Jugador2 = new javax.swing.JButton[100];
    public static javax.swing.JPanel[] Paneles = new javax.swing.JPanel[100];
    private final int[][]coordenBtn = new int[100][100]; 
    private javax.swing.JButton Prueba;
    private javax.swing.JButton Botonesant;
    private int sumax = 50;
    private int sumay = 0;
    private int sumax3 = 50;
    private int sumay3 = 0;
    private int sumax2 = 0;
    private int sumay2 = 250;
    public static int ValorBtn = 0;

   
    
    /*public Boton(int nbtn){
        ValorBtn = nbtn;
    }*/
    
  
  
    public void CargarBotns(){
        try {
            
            System.out.println("Cargandoo***********");
        System.out.println("Valro contador " + CrearUsuarios.contador);
        System.out.println("Nombre matriz " + CrearUsuarios.UsuGuard[CrearUsuarios.contador]);
        GuardBtns tmpBtns = SerializarObjeto.deserializarObjeto(CrearUsuarios.UsuGuard[CrearUsuarios.contador]+".bin", GuardBtns.class);
        
        System.out.println("retorno" + tmpBtns);
        
        if(tmpBtns == null){
            System.out.println("SEcrean botones");
        
            CrearBtn();
        } 
        
        if(tmpBtns != null){
            for(int i = 0; i<12; i++){
                
           Interme.turnos = tmpBtns.getRetomaturno();
           BotonAccion.Jug = tmpBtns.getRetomaJug();
           Interme.jLabel1.setText("Turno " + Interme.turnos + " del jugador " + BotonAccion.Jug);
           Interme.muerte1 = tmpBtns.getRetomamuerte1();
           Interme.muerte2 = tmpBtns.getRetomamuerte2();
           Interme.jLabel5.setText(" "+Interme.muerte1);
           Interme.jLabel4.setText(" "+Interme.muerte2);
           Botonesant = tmpBtns.getBotonesGuar()[i];   
           Jugador1[i] = Botonesant;
           Jugador1[i].getBounds();
           Jugador1[i].getBackground();
           Jugador1[i].getIcon();
           Jugador1[i].setVisible(true);     
           
           
                
           System.out.println("Cargandoo***********");
           Botonesant = tmpBtns.getBotonesGuar2()[i]  ; 
           Jugador2[i] = Botonesant;
           Jugador2[i].getBounds();
           Jugador2[i].getBackground();
           Jugador2[i].getIcon();
           Jugador2[i].setVisible(true);
           
        }
            
        }
            
        } catch (Exception e) {
            System.out.println("SEcrean botones");
        
            CrearBtn();
        }
        
        
    }
           
     public javax.swing.JButton CrearBtnP(){
        Prueba = new javax.swing.JButton();
        Prueba.setBounds(0, 0, 50, 50);
        Prueba.setBackground(new java.awt.Color(0, 0, 0));
        Prueba.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ficha.png"))); // NOI18N
        
        return Prueba;
     }
    
    public void CrearBtn(){
        ImageIcon icono = new ImageIcon("Ficha.png");
        ImageIcon icono2 = new ImageIcon("Ficha2.png");
        
        for(int i = 0; i < 12; i++){
           
           if(i==4){
               sumay = sumay + 50;
               sumax = 0;
           }
           if(i==8){
               sumay = sumay + 50;
               sumax = 50;
           }
           
           Jugador1[i] = new javax.swing.JButton();
           Jugador1[i].setBounds(sumax, sumay, 50, 50);
           Jugador1[i].setBackground(new java.awt.Color(0, 0, 0));
           Jugador1[i].setIcon(icono); // NOI18N
           Jugador1[i].setVisible(true);
           coordenBtn[0][i] = Jugador1[i].getX();
           coordenBtn[1][i] = Jugador1[i].getY();
           
     
           sumax = sumax + 100;
           System.out.println("Se creo boton");
            
        }
        
        for(int i = 0; i<12; i++){
            
           if(i==4){
               sumay2 = sumay2 + 50;
               sumax2 = 50;
           }
           if(i==8){
               sumay2 = sumay2 + 50;
               sumax2 = 0;
           }
            
           Jugador2[i] = new javax.swing.JButton();
           Jugador2[i].setBounds(sumax2, sumay2, 50, 50);
           Jugador2[i].setBackground(new java.awt.Color(0, 0, 0));
           Jugador2[i].setIcon(icono2); // NOI18N
           Jugador1[i].setVisible(true);
           coordenBtn[2][i] = Jugador2[i].getX();
           coordenBtn[3][i] = Jugador2[i].getY();
           sumax2 = sumax2 + 100;
           
        }
        
        
        
    }
    
    public void CrearPaneles(){
       
        for(int i = 0; i < 32; i++){
           
           if(i==4){
               sumay3 = sumay3 + 50;
               sumax3 = 0;
           }
           if(i==8){
               sumay3 = sumay3 + 50;
               sumax3 = 50;
           }
           
           if(i==12){
                sumay3 = sumay3 + 50;
               sumax3 = 0;
           }
           if(i==16){
               sumay3 = sumay3 + 50;
               sumax3 = 50;
           }
           if(i==20){
               sumay3 = sumay3 + 50;
               sumax3 = 0;
           }

           if(i==24){
            sumay3 = sumay3 + 50;
            sumax3 = 50;
        }
           
        if(i==28){
            sumay3 = sumay3 + 50;
            sumax3 = 0;
        }
           Paneles[i] = new javax.swing.JPanel();
           Paneles[i].setBounds(sumax3, sumay3, 50, 50);
           Paneles[i].setBackground(new java.awt.Color(0, 0, 0));
           Paneles[i].setVisible(true);
           coordenBtn[5][i] = Paneles[i].getX();
           coordenBtn[6][i] = Paneles[i].getY();
           
     
           sumax3 = sumax3 + 100;
           System.out.println("Se creo panel");
            
        }
  
    }
    
    public void ejecutar(javax.swing.JButton BtnAct){
        System.out.println("coord y " + BtnAct.getY());
        System.out.println("coord x " + BtnAct.getX());
        new JDamas().Juega(BtnAct);
  
    }
    
    public void guardar(){
       
        new CrearUsuarios().GuardUsBtn();
        System.out.println("Se guradooooo");
        System.out.println("Valor del turno" + Interme.turnos);
    }
    
    public JButton[] getJugador1() {
        return Jugador1;
    }

    public JButton[] getJugador2() {
        return Jugador2;
    }

    public JButton getPrueba() {
        return Prueba;
    }

    public static void setJugador1(JButton[] Jugador1) {
        Boton.Jugador1 = Jugador1;
    }

    public static void setJugador2(JButton[] Jugador2) {
        Boton.Jugador2 = Jugador2;
    }
    
}
