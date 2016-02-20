/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortman;

import java.awt.Rectangle;

/**
 *
 * @author goov
 */
public class Number implements Comparable {
    public int id;
    private Double myNumber;
    private boolean Picked = false; 
    public int x; 
    public int xend;
    static int NumberOfNums =1;
    int hight; 
    private Rectangle myBlock;
    
    public Number(int x,Double Mynum){
         myNumber = Mynum;
        
        id = x; 
        NumberOfNums++;
        xend = NumberOfNums+3;
        
        this.x = id*10+3;
        //xend = id*10+20;
      
       hight = (int) (myNumber*10);
      Rectangle f = new Rectangle(x*15,0,10,hight+20);
      this.myBlock = f;
        
    }
    public boolean Comp(Number them){
        
        if(them.getMyNumber() >= this.getMyNumber())return false;
        else return true; 
    }

    /**
     * @return the myNumber
     */
    public Double getMyNumber() {
       
        return myNumber;
    }

    /**
     * @param myNumber the myNumber to set
     */
    public void setMyNumber(Double myNumber) {
        this.myNumber = myNumber;
    }

    /**
     * @return the Picked
     */
    public boolean isPicked() {
        return Picked;
    }

    /**
     * @param Picked the Picked to set
     */
    public void setPicked(boolean Picked) {
        this.Picked = Picked;
    }

    /**
     * @return the myBlock
     */
    public Rectangle getMyBlock() {
        return myBlock;
    }

    /**
     * @param myBlock the myBlock to set
     */
    public void setMyBlock(Rectangle myBlock) {
        this.myBlock = myBlock;
    }
            
    public void ChangeX(int x){
        myBlock.x = x; 
    }

    @Override
    public int compareTo(Object o) {
     Number them =  (Number)o;
        if(them.getMyNumber() > this.getMyNumber())return 1;
        if(them.getMyNumber() == this.getMyNumber())return 0;
        else return -1; 
    }
            
       
    
    
}
