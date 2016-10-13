/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es_libro_alessiopicciafuoco;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe Libreria 
 * @author MASSIMO PICCIAFUOCO
 */
public class Libreria {
    
    /**
     * Array list di tipo Libro
     */
    public static List<Libro> libro;
    
    /**
     * Costruttore della classe Libreria 
     */
    public Libreria(){
        
        this.libro = new ArrayList();
        
    }
    
    /**
     * Metodo per la ricerca del libro tramite l'autore 
     * @param autore
     * @return
     */
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
