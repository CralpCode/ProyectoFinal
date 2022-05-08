/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Generadores;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;


/**
 *
 * @author calin
 */

public class Boton2 extends javax.swing.JFrame {

    public static JButton[]  Jugador1 = new JButton[100];
    public static JButton[]  Jugador2 = new JButton[100];
    public static JPanel[] Paneles = new JPanel[100];
    private final int[][]coordenBtn = new int[100][100]; 
    private JButton Prueba;
    private JButton Botonesant;
    private int sumax = 50;
    private int sumay = 0;
    private int sumax3 = 50;
    private int sumay3 = 0;
    private int sumax2 = 0;
    private int sumay2 = 250;
    public static int ValorBtn = 0; 
    
     public javax.swing.JButton CrearBtnP(){
        Prueba = new javax.swing.JButton();
        Prueba.setBounds(0, 0, 50, 50);
        Prueba.setBackground(new java.awt.Color(0, 0, 0));
        Prueba.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ficha.png")));
        
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
           Jugador1[i].setIcon(icono);
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
    
}
