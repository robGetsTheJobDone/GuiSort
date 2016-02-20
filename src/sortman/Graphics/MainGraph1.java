/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortman.Graphics;

import java.awt.Frame;

import java.awt.Color;
import java.awt.Component;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.JPanel;
import sortman.PaintOut;

import sortman.Sorter;

/*
/**
 *
 * @author goov
 */
public  class MainGraph1 extends JPanel {
    
     
       public   PaintOut  PaintMan;
       public  Sorter Sort;
       public int NumberOfItems; 
       public int UpperLimit;
       public int Xspacer;
      
   

    public MainGraph1() {
   
        
       
        
    

    }
    public  void AddComponet(Component d ){
        this.add(d);
    }
    public void createValues(){
       this.setBackground(Color.white);
          
       
       
            PaintMan  = new PaintOut(this);
       
         Sort = new Sorter(this,PaintMan);
        Sort.Create(60);
      
        NumberOfItems = 40; 
        UpperLimit = 10*2;
        Xspacer = 2; 
        PaintMan.inti(this,Sort.Numbers);
       
        
    }
 
    public  void AddStart(){
         // Graphics g = this.getGraphics();
     //Sort.AddMe();
    
       
           
     
    }
    
    public void DrawRectangle(Graphics g, int x,  int y, int w, int h){
        g.drawRect(x, y, w, h);
    
    }
    public void SetColor(Graphics g,Color c){
        g.setColor(Color.red);
    }
    public Graphics Get(Graphics g){
        return g;
    }

       @Override
    public void paint(Graphics g) {
         Graphics2D gg = (Graphics2D)g;
         for(sortman.Number n : Sort.Numbers ){
             gg.fill(n.getMyBlock());
         }
     
     //   PaintMan.DrawIt();
     //   g.drawRect(0, 22, 55, 455);
     
    }
    @Override
    public void update(Graphics g){
        //  g.drawRect(300, 22, 55, 455);
        Graphics2D gg = (Graphics2D)g;
         for(sortman.Number n : Sort.Numbers ){
             gg.fill(n.getMyBlock());
         }
    }
      @Override public void paintComponent(Graphics g) { // <-- HERE!
        //TODO draw stuff
    
   Graphics2D g2 = (Graphics2D) g;
   // assuming that this holds the Rectangle object
   //...
}
      public void paintComponentShade(Graphics g,Rectangle myRectangle) {
  
   Graphics2D g2 = (Graphics2D) g;
   g2.draw(myRectangle); 
   g2.fill(myRectangle);// assuming that this holds the Rectangle object
   //...
}
}
