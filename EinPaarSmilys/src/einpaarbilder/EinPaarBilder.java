/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package einpaarbilder;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Sven
 */
public class EinPaarBilder {

    /**
     * @param args the command line arguments
     */
    static MyPanel myPanel;
    
    public static void main(String[] args) {
        System.out.println("Irgendeine Ausgabe");
        System.out.println("Irgendeine Ausgabe");
        System.out.println("Irgendeine Ausgabe");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(EinPaarBilder.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Irgendeine Ausgabe");
        System.out.println("Irgendeine Ausgabe");
        System.out.println("Irgendeine Ausgabe");
        JButton button_1,button_2,button_3,button_4,button_5;
        JFrame f=new JFrame("Ein paar Smilys");
        
        f.setLayout(new GridLayout(6,1));

        
        //ein selbst geschriebenes Panel
        myPanel=new MyPanel();
        
        
        //BUttons erstellen und Action Listener hinzufügen
        //Langweilig, kennst du ja schon ---------------------------------------
        button_1=new JButton("");
        button_1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                change(0);
            }
        });
        button_2=new JButton("");
        button_2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                change(1);
            }
        });
        button_3=new JButton("");
        button_3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                change(2);
            }
        });
        button_4=new JButton("");
        button_4.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                change(3);
            }
        });
        button_5=new JButton("");
        button_5.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                change(4);
            }
        });
        f.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        //Ende des uninteressanten Teils----------------------------------------
        
        
        //alle Elemente ans Frame binden
        f.add(myPanel); 
        f.add(button_1);
        f.add(button_2);
        f.add(button_3);
        f.add(button_4);
        f.add(button_5);
        f.pack();
        f.setSize(80, 200);
        f.setVisible(true);
        
    }
    
    /**
     * Da der Actionlistener in der Form nur statische Methoden mag, gibt es hier
     * eine statische Methode, die den Zustand eines Smilys umschaltet
     * @param i Nummer des Smilys 0..4
     */
    public static void change(int i){
       myPanel.setV(i, !myPanel.getV(i));
       myPanel.repaint();
    }
    
}
