/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortman.Graphics;

/**
 *
 * @author goov
 */
 import java.awt.*;
  import javax.swing.*;
  
  public class Ja
  {
     public static void main(String[] args) throws InterruptedException
     {
        JFrame f = new JFrame("My First GUI");
        f.setSize(1000, 1000);
        f.setBackground(Color.white);
        MainGraph1 g = new MainGraph1();
         
        g.createValues();
       
        f.setVisible(true);
        f.setDefaultCloseOperation(0);
   
        
        
         f.add(g);
         f.update(g.getGraphics());
            g.Sort.AddMe();
        g.Sort.shellsort();
       System.out.println(g.Sort.NotSorted());     
     }
  }