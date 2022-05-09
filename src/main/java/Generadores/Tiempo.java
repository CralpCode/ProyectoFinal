/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Generadores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;



/**
 *
 * @author calin
 */
public class Tiempo {
    
    private Timer t;
    private int h, m, s, cs;
    private ActionListener acciones = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(s==60) 
            {
                s = 0;
                ++m;
            }
            if(m==60)
            {
                m = 0;
                ++h;
            }
            actualizarLabel();
        }
    };
    
    private void actualizarLabel() {
        String tiempo = (h<=9?"0":"")+h+":"+(m<=9?"0":"")+m+":"+(s<=9?"0":"")+s+":"+(cs<=9?"0":"")+cs;
        
    }
    
}
