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
public class Libro {
    
    private String titolo;
    private String autore; 
    private int nPagine; 
            
    public Libro(String titolo, String autore, int nPagine){
        
        this.titolo = titolo;
        this.autore = autore;
        this.nPagine = nPagine;
        
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public int getnPagine() {
        return nPagine;
    }

    public void setnPagine(int nPagine) {
        this.nPagine = nPagine;
    }
    
    
}
