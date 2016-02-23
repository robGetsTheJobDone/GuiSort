/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortman;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import javax.swing.JComponent;
import javax.swing.JPanel;
import sortman.Graphics.MainGraph1;

/**
 *
 * @author goov
 */

public class PaintOut   {
   static MainGraph1 Tes;
 
  //   Graphics GR; 
public PaintOut(MainGraph1 t){
  
  


  
    
}
 public void inti(MainGraph1 t,Number[] f){
        Tes =t;
        
  }
 
    public  void ExchRequstPre(Number[] H,int pos1, int pos2) throws InterruptedException {
  // System.out.println("HEAHWSJHDASJDHKJASHDKJASK");
  Graphics2D GR = (Graphics2D) Tes.getGraphics();
  Number xPos1 = H[pos1];
   Number xPos2 = H[pos2];
  Rectangle x1 = xPos1.getMyBlock();
  Rectangle x2 = xPos2.getMyBlock();
 GR.setColor(Color.red);

 GR.fill(x1);
  GR.fill(x2);
 
 Thread.sleep(5);
 GR.setColor(Color.WHITE);
  
 GR.fill(x1);
  GR.fill(x2);
 
   
   GR.setColor(Color.BLACK);
   


    
  
  
     
   
          // g2.setColor(Color.black);
     
      
      //  GR.drawRect(xa,0,20,dd.hight+20);
        //GR.fillRect(xa,0,20,dd.hight+20);
        
    
     
       //  g2.drawRect(x, x, x, x);
         //H.DrawRectangle(GR,dd.x,0,10,dd.hight);
      //H.paint(g2);
//      xa+= 30;
   
   
   
        
        
     //  H.paintRe(H.getGraphics(),2,3,3);
    }
    public void ExchRequestPost(Number[] H,int pos1, int pos2){
        Graphics2D GR = (Graphics2D) Tes.getGraphics();
        GR.setColor(Color.BLACK);
         Number xPos1 = H[pos1];
         Number xPos2 = H[pos2];
      
 GR.fill(xPos1.getMyBlock());
  GR.fill(xPos2.getMyBlock());
 

    }
    public  void DrawIt(Number[] H) throws InterruptedException {
           Graphics2D GR = (Graphics2D) Tes.getGraphics();
   //  System.out.println(H);
     // System.out.println("HERE");
        Number[] d = H;
     GR.setColor(Color.green);
      for(int x = 0; x < d.length; x++){
        Number dd = d[x];
      //   System.out.println("HERE");
       
      
    GR.fill(dd.getMyBlock());
   
     
    } 
       
        
     //   H.paintRe(H.getGraphics(),2,3,3);
    }
  
    
    
    
    
}
