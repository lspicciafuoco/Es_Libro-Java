/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es_libro_alessiopicciafuoco;

/**
 *
 * @author MASSIMO PICCIAFUOCO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        GUI g = new GUI();
        g.pack();
        g.setVisible(true);
        g.setDefaultCloseOperation(GUI.EXIT_ON_CLOSE);
        
        Libreria libreria = new Libreria();
        
    }
    
}
