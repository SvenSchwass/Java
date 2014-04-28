/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package einpaarbilder;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JPanel;

/**
 *
 * @author Sven
 */

//Klasse von JPanel ableiten => eigenes Panel mit mehr Funktionalität
public class MyPanel extends JPanel{
    private boolean[] visible; //Welche Bilder sollen angezeigt werden
    private Image image;

    public MyPanel() {
        super();
        image=Toolkit.getDefaultToolkit().createImage("bild.png");
        this.visible=new boolean[5];
        for(int i=0;i<5;i++){ //zu Beginn soll kein BIld gezeichnet werden
            this.visible[i]=false;
        }
    }
    
    
    
    /**
     * Paint Methode des JPanels überschreiben, damit nicht nur das Panel, sondern auch 
     * der Inhalt immer sichbar ist. (Die Methode wird immer aufgerufen, wenn das
     * Panel neu gezeichnet werden muss, z.B. weil man das Fenster verschoben hat)
    **/
    @Override
    public void paint(Graphics g){
        super.paint(g); //führt alles aus was paint normalerweise macht
        
        //Bilder zeichnen
        for(int i=0;i<5;i++){
            if(this.visible[i]) //prüfen ob Bild gezeichnet werden soll
                g.drawImage(image, 16*i, 0, this); //zeichnen
        }
        
    }
    
    //Funktionen um Bilder an und aus zu schalten
    public boolean getV(int i){
        return this.visible[i];
    }
    
    public void setV(int i, boolean b){
        this.visible[i]=b;
    }
}
