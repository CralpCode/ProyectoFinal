/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Generadores;

import Acciones.*;
import com.juegos.proyectofinal.UI.Jugadores;

/**
 *
 * @author calin
 */
public class Tablero extends javax.swing.JPanel {

    /**
     * Creates new form Tablero
     */
    public Tablero() {
        initComponents();
        CargaBtns();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(400, 4000));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    private void CargaBtns(){
    if(Jugadores.valor == false){
            new Boton().CrearBtn();
            System.out.println("Creando botones");
        }
        if(Jugadores.valor == true){
            new Boton().CargarBotns();
         
            System.out.println("Cargando botones");
        }

       for(int i = 0; i < 12; i++){
            this.add(new Boton().Jugador1[i]);
            System.out.println("\n*****J1****");
            System.out.println("coor x " + new Boton().Jugador1[i].getX());
            System.out.println("coor y " + new Boton().Jugador1[i].getY());
            this.add(new Boton().Jugador2[i]);
            System.out.println("\n*****J2****");
            System.out.println("coor x " + new Boton().Jugador2[i].getX());
            System.out.println("coor y " + new Boton().Jugador1[i].getY());
            Boton.ValorBtn = i;
            System.out.println("\n*****Valorbtn****" + Boton.ValorBtn);
            new Boton().Jugador1[Boton.ValorBtn].addActionListener(new BotonAccion());
            new Boton().Jugador2[Boton.ValorBtn].addActionListener(new BotonAccion());
        }

        new Boton().CrearPaneles();

        for(int i = 0; i < 32; i++){
            this.add(new Boton().Paneles[i]);
            System.out.println("\n*****Paneles****");
            System.out.println("coor x " + new Boton().Paneles[i].getX());
            System.out.println("coor y " + new Boton().Paneles[i].getY());
            new Boton().Paneles[i].addMouseListener(new ClickBotonPanel());
            
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
