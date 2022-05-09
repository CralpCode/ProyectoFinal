/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Usuarios;

import com.juegos.proyectofinal.UI.JuegosImplem;
import com.juegos.proyectofinal.UI.Jugadores;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author calin
 */
public class BtnActo implements ActionListener {
    
    private boolean exigencia = false;

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 1; i <= CrearUsuarios.valor; i++) {
            if(CrearUsuarios.Botones[i] == e.getSource()){
                    exigencia = true;
                   CrearUsuarios.contador =i;
                   System.out.println("Valro contador " + CrearUsuarios.contador);
                   System.out.println("Valor de Boton" + CrearUsuarios.UsuGuard[CrearUsuarios.contador]);
                   Jugadores.nuevUsuCarg.setVisible(false);
                   new JuegosImplem().setVisible(true);
            }
        }
        
    }

    public boolean isExigencia() {
        return exigencia;
    }
    
}
