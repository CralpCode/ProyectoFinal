/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Acciones;

import Generadores.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author calin
 */

public class BotonAccion implements ActionListener  {
  public static JButton BotonPres;  
  public static int Jug; 
   
  
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        ClickBotonPanel.clicko = true;
        
        for (int i = 0; i < 12; i++){
            if(e.getSource() == Boton.Jugador1[i]){
                Jug=1;
            }
            if(e.getSource() == Boton.Jugador2[i]){
                Jug=2;
            }
        }
        
        BotonPres = (JButton) e.getSource();    
        System.out.println("Boton igual a " + ClickBotonPanel.clicko);
        System.out.println("Boton es " + BotonPres);
        
    }

    public JButton getBotonPres() {
        return BotonPres;
    }
    
    
}
