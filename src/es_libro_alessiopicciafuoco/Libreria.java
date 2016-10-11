/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es_libro_alessiopicciafuoco;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MASSIMO PICCIAFUOCO
 */
public class Libreria {
    
    public static List<Libro> libro;
    
    public Libreria(){
        
        this.libro = new ArrayList();
        
    }
    
    public static List<Libro> ricerca(String autore){
        List<Libro> list = new ArrayList();
        for(Libro l: libro){
            if(l.getAutore().equals(autore)){
                list.add(l); 
            }
        }
        return list;
    }
    
}
