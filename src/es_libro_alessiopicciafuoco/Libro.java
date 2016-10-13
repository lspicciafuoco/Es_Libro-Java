/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es_libro_alessiopicciafuoco;

/**
 * Classe Libro
 * @author MASSIMO PICCIAFUOCO
 */
public class Libro {
    
    private String titolo;
    private String autore; 
    private int nPagine; 
            
    /**
     * Costruttore della classe Libro
     * @param titolo
     * @param autore
     * @param nPagine
     */
    public Libro(String titolo, String autore, int nPagine){
        
        this.titolo = titolo;
        this.autore = autore;
        this.nPagine = nPagine;
        
    }

    /**
     * Metodo getTitolo() che restituisce String titolo
     * @return
     */
    public String getTitolo() {
        return titolo;
    }

    /**
     * Metodo setTitolo()
     * @param titolo
     */
    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    /**
     * Metodo getAutore() che restituisce String autore
     * @return
     */
    public String getAutore() {
        return autore;
    }

    /**
     * Metodo setAutore()
     * @param autore
     */
    public void setAutore(String autore) {
        this.autore = autore;
    }

    /**
     * Metodo getNPagine() che restituisce int nPagine
     * @return
     */
    public int getNPagine() {
        return nPagine;
    }

    /**
     * Metodo setNPagine()
     * @param nPagine
     */
    public void setNPagine(int nPagine) {
        this.nPagine = nPagine;
    }
    
    
}
