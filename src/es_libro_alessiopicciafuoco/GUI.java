/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es_libro_alessiopicciafuoco;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author MASSIMO PICCIAFUOCO
 */
public class GUI extends JFrame implements ActionListener{

    private JPanel p;
    private JLabel l1;
    private JLabel l2;
    private JLabel l3;
    private JTextField tf1;
    private JTextField tf2;
    private JTextField tf3;
    private JTextField tf4;
    private JButton b1;
    private JButton b2;
    private JList list;
    private DefaultListModel lm;

    public GUI() {

        this.p = new JPanel();
        this.l1 = new JLabel("Titolo");
        this.l2 = new JLabel("Autore");
        this.l3 = new JLabel("Numero");
        this.tf1 = new JTextField(20);
        this.tf2 = new JTextField(20);
        this.tf3 = new JTextField(20);
        this.tf4 = new JTextField(20);
        this.b1 = new JButton("Aggiungi libro");
        this.b2 = new JButton("Cerca Autore");
        this.lm = new DefaultListModel();
        this.list = new JList(lm);
        
        b1.setActionCommand("add");
        b1.addActionListener(this);
        b2.setActionCommand("search");
        b2.addActionListener(this);
        
        add(p);
        p.add(l1); 
        p.add(tf1);
        p.add(l2);
        p.add(tf2);
        p.add(l3);
        p.add(tf3);
        p.add(tf4);
        p.add(b1);
        p.add(b2);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        switch(ae.getActionCommand()){
            
            case "add":
                int pagine = 0;
                try{
                pagine = Integer.valueOf(tf3.getText());
                }
                catch(Exception e){
                }
                Libreria.libro.add(new Libro(tf1.getText(),tf2.getText(),pagine));
                tf1.setText("");
                tf2.setText("");
                tf3.setText("");
                break;   
                
            case "search":  
                for(Libro l: Libreria.ricerca(tf4.getText())){
                    lm.addElement(l.getTitolo());
                }
                break;
        }
    }
}
