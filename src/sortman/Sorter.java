/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortman;

import sortman.Graphics.MainGraph1;
/**
 *
 * @author goov
 */
public class Sorter {
public  Number[]  Numbers;
  public MainGraph1 SendGui;
  public PaintOut P;
  public Sorter(MainGraph1 H,PaintOut p){
      P = p;
      SendGui = H;
 
      
      

     // this.Numbers=Create(1000);
  
         // num1.Comp(num2);
  // this will return true if num1 is greater then num2

  
  }
 
  public  Number[] getSum(){
          return Numbers;
          
      }
  public void DrawShoot(int pos1, int pos2){
  
      
  }
  public void exch(int pos1, int pos2) throws InterruptedException{
      SendExchRequestP(pos1, pos2);
      
  Number num1 = Numbers[pos1];
  Number num2 = Numbers[pos2];
  DrawShoot(pos1,pos2);
 
 int tx = num2.getMyBlock().x;
 num2.ChangeX(num1.getMyBlock().x);
 num1.ChangeX(tx);
  Numbers[pos1] = num2;
  Numbers[pos2] = num1;

     SendExchRequestAfter(pos1, pos2);
 
  
  }
  
    public void AddMe() throws InterruptedException{
        P.DrawIt(Numbers);
    }
  public void SortMe() throws InterruptedException{
     {
     int j;                     // the number of items sorted so far
     int key;                // the item to be inserted
     int i;  

     for (j = 1; j < Numbers.length; j++)    // Start with 1 (not 0)
    {
           key = Numbers[ j ].id;
           for(i = j - 1; (i >= 0) && (Numbers[ i ].id < key); i--)   // Smaller values are moving up
          {
              exch(i+1, i);
                
          }
     
}
  }
     
  }
  
  public void shitSort() throws InterruptedException{
      boolean done = false; 
      int start =0; 
      int count = 0; 
      while(done == false){
          if(start < Numbers.length-1){
             // System.out.println("Here1");
              if(Numbers[start].Comp(Numbers[start+1])){
             // System.out.println("Here");
            
             exch(start,(start+1));
                  
              start = start+1;
              count++;
          }
              else {
              
               start = start+1;   
              }
      }
          else if (count == 0){
              done = true; 
             
          }
          else{
            // System.out.print("fafaaf");
              start = 0; 
             // done = true;
              count = 0; 
          }
          
      }
      
      for(Number f : Numbers){
          System.out.println(f.id);
      }
      
      
  }
     public  void SendExchRequestP(int pos1, int pos2) throws InterruptedException{
       
         P.ExchRequstPre(Numbers, pos1,pos2);
        
    }
       public  void SendExchRequestAfter(int pos1, int pos2) throws InterruptedException{
       
         P.ExchRequestPost(Numbers,pos1,pos2);
        
    }
  
  
  public Number[] Create (int n){
     Number[] nums = new Number[n];
     //System.out.println("Making");
      for (int x =0; x < n; x++){
        
       double randomNum = 0.0 + (int)(Math.random() * 40.0); 
      // System.out.println();
      
       Number d = new Number(x,randomNum);
         
          nums[x] = d; 
      }
   Numbers = nums;
      return Numbers;
  }
    

 public  void shellsort(  ) throws InterruptedException
  {
    int j;
    for( int gap = Numbers.length / 2; gap > 0; gap /= 2 )
    {
      for( int i = gap; i <  Numbers.length; i++ )
      {
         Number tmp;
          tmp =  Numbers[ i ];
         for( j = i; j >= gap && tmp.compareTo( Numbers[ j - gap ] ) < 0; j -= gap )
         {
             exch(j,j-gap);
         // a[ j ] = a[ j - gap ];
         }
         Numbers[ j ] = tmp;
      }
    }
  }
}

