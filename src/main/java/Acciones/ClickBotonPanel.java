/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Acciones;

import Generadores.*;
import Juegos.JDamas;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author calin
 */
public class ClickBotonPanel implements MouseListener{
    
    public static boolean clicko = false;
    public static int coord1 = 0;
    public static int coord2 = 0;

    @Override
    public void mouseClicked(MouseEvent e) {
        
        for(int i=0; i<32; i++){
            if (e.getSource() == Boton.Paneles[i] && clicko == true){
                coord1 = Boton.Paneles[i].getX();
                coord2 = Boton.Paneles[i].getY();
                new JDamas().Juega( BotonAccion.BotonPres);
                System.out.println("Boton Panel es " + BotonAccion.BotonPres);
                clicko = false;
                
            }
        }
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
       
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }
    
}
