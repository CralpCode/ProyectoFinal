/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Juegos;

import Generadores.*;
import Acciones.*;
import com.juegos.proyectofinal.UI.Interme;
import com.juegos.proyectofinal.UI.Ventana;
import java.io.Serializable;
import javax.swing.JLabel;

/**
 *
 * @author calin
 */
public class JDamas implements Serializable{
     private int valorx;
     private int valory;
     private boolean IADama = true;
     private int[] diagonales ={-50,-100,-150,-200,-250,-300,-350
     ,50,100,150,200,250,300,350} ;
     private boolean solouno = false;
     public static JLabel Etiqueta1 = new JLabel();
     private JLabel Etiqueta2 = new JLabel();
     
    
    
    public void Juega(javax.swing.JButton Btn){
        valorx = ClickBotonPanel.coord1;
        valory = ClickBotonPanel.coord2;
        System.out.println("Boton Juagador "+BotonAccion.Jug  );
        System.out.println("Turno ******" + Interme.turnos );
        
        if (BotonAccion.Jug == 1 && valory == (Btn.getY()+50) && Interme.turnos % 2 == 0){
            Btn.setLocation(valorx,valory); 
            Interme.turnos = Interme.turnos + 1;
            Interme.jLabel1.setLocation(500,40);
            Interme.jLabel1.setText("Turno " + Interme.turnos + " del jugador 1"); 
            
            
            
        }
        
       
        
        if (BotonAccion.Jug == 2 && valory == (Btn.getY()-50) && Interme.turnos % 2 != 0){
            Btn.setLocation(valorx,valory); 
            Interme.turnos = Interme.turnos + 1;
            Interme.jLabel1.setLocation(500,40);
            Interme.jLabel1.setText("Turno " + Interme.turnos + " del jugador 2");
        }
        
        Comer(Btn);
        if (Interme.muerte1 == 12 || Interme.muerte2 == 12 ){
            //JuegosImplem.intermedio.setVisible(false);
            new Ventana().setVisible(true);
        }
        
        if (valory == 0 || valory == 350 ){
            Reyna(Btn);
        }
    }
    
    public void Comer(javax.swing.JButton Btn){
        
        if (BotonAccion.Jug == 1 && valory == (Btn.getY()+100) && Interme.turnos % 2 == 0){
            Buscar(Btn);
            
        }
        if (BotonAccion.Jug == 2 && valory == (Btn.getY()-100) && Interme.turnos % 2 != 0){
            Buscar(Btn);
            
        }
    }
    
    public void Reyna(javax.swing.JButton Btn){
        
            for(int j = 0; j < 14; j++){
                
                if(valorx == Btn.getX()+diagonales[j] && valory == Btn.getY()+diagonales[j] || valorx == Btn.getX()+ diagonales[j] && valory == Btn.getY()-(diagonales[j])||valorx == Btn.getX()-(diagonales[j]) && valory == Btn.getY()+diagonales[j]) {
                    if (BotonAccion.Jug == 1  && Interme.turnos % 2 == 0){
                        Btn.setLocation(valorx,valory); 
                        Interme.turnos = Interme.turnos + 1;
                        Interme.jLabel1.setLocation(500,40);
                        Interme.jLabel1.setText("Turno " + Interme.turnos + " del jugador 1"); 
                    }
         
                    if (BotonAccion.Jug == 2 && Interme.turnos % 2 != 0){
                        Btn.setLocation(valorx,valory); 
                        Interme.turnos = Interme.turnos + 1;
                        Interme.jLabel1.setLocation(500,40);
                        Interme.jLabel1.setText("Turno " + Interme.turnos + " del jugador 2");
                    }
                }
                
            }
        
        
       
        
        
         
    }
    
    public void Buscar(javax.swing.JButton Btn){
        
        if(BotonAccion.Jug == 1){
            for (int i = 0; i < 12; i++){
                if(Btn.getX()+50 == Boton.Jugador2[i].getX() && Btn.getY()+50 == Boton.Jugador2[i].getY() && valorx-50 == (Boton.Jugador2[i].getX()) && valory-50 == (Boton.Jugador2[i].getY()) && solouno == false){
                    Boton.Jugador2[i].setEnabled(false);
                    Boton.Jugador2[i].setVisible(false);
                    Boton.Jugador2[i].setLocation(0,0);
                    Btn.setLocation(valorx,valory); 
                    Interme.turnos = Interme.turnos + 1;
                    Interme.jLabel1.setLocation(500,40);
                    Interme.jLabel1.setText("Turno " + Interme.turnos + " del jugador 1"); 
                    Interme.muerte1 = Interme.muerte1 + 1;
                    Interme.jLabel5.setLocation(500,90);
                    Interme.jLabel5.setText(" "+Interme.muerte2);
                    solouno = true;
                }
                if(Btn.getX()-50 == Boton.Jugador2[i].getX() && Btn.getY()+50 == Boton.Jugador2[i].getY() && valorx+50 == (Boton.Jugador2[i].getX()) && valory-50 == (Boton.Jugador2[i].getY())&& solouno == false){
                    Boton.Jugador2[i].setEnabled(false);
                    Boton.Jugador2[i].setVisible(false);
                    Boton.Jugador2[i].setLocation(0,0);
                    Btn.setLocation(valorx,valory); 
                    Interme.turnos = Interme.turnos + 1;
                    Interme.jLabel1.setLocation(500,40);
                    Interme.jLabel1.setText("Turno " + Interme.turnos + " del jugador 1"); 
                    Interme.muerte1 = Interme.muerte1 + 1;
                    Interme.jLabel5.setLocation(500,90);
                    Interme.jLabel5.setText(" "+Interme.muerte2);
                    solouno =true;
                }
            }
            
        }
        
        if(BotonAccion.Jug == 2){
        for (int i = 0; i < 12; i++){
            if(Btn.getX()+50 == Boton.Jugador1[i].getX() && Btn.getY()-50 == Boton.Jugador1[i].getY() &&valorx-50 == (Boton.Jugador1[i].getX()) && valory+50 == (Boton.Jugador1[i].getY())&& solouno == false){
                Boton.Jugador1[i].setEnabled(false);
                Boton.Jugador1[i].setVisible(false);
                Boton.Jugador1[i].setLocation(0,0);
                Btn.setLocation(valorx,valory); 
                Interme.turnos = Interme.turnos + 1;
                Interme.jLabel1.setLocation(500,40);
                Interme.jLabel1.setText("Turno " + Interme.turnos + " del jugador 2"); 
                Interme.muerte2 = Interme.muerte2 + 1;
                Interme.jLabel4.setLocation(500,90);
                Interme.jLabel4.setText(" "+Interme.muerte2);
                solouno = true;
            }
            if(Btn.getX()-50 == Boton.Jugador1[i].getX() && Btn.getY()-50 == Boton.Jugador1[i].getY() && valorx+50 == (Boton.Jugador1[i].getX()) && valory+50 == (Boton.Jugador1[i].getY())&& solouno == false){
                Boton.Jugador1[i].setEnabled(false);
                Boton.Jugador1[i].setVisible(false);
                Boton.Jugador1[i].setLocation(0,0);
                Btn.setLocation(valorx,valory); 
                Interme.turnos = Interme.turnos + 1;
                Interme.jLabel1.setLocation(500,40);
                Interme.jLabel1.setText("Turno " + Interme.turnos + " del jugador 2"); 
                Interme.muerte2 = Interme.muerte2 + 1;
                Interme.jLabel4.setLocation(500,90);
                Interme.jLabel4.setText(" "+Interme.muerte2);
                solouno = true;
            }
            
            }
            
        }
        solouno = false;
    }

    public int getValorx() {
        return valorx;
    }

    public int getValory() {
        return valory;
    }

    public boolean isSolouno() {
        return solouno;
    }

    public int[] getDiagonales() {
        return diagonales;
    }

    public void setValorx(int valorx) {
        this.valorx = valorx;
    }

    public void setValory(int valory) {
        this.valory = valory;
    }

    public void setSolouno(boolean solouno) {
        this.solouno = solouno;
    }
    
    
    
}
