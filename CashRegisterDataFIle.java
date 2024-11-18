/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.cashregisterdatafile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 *
 * @author pres2590
 */
public class CashRegisterDataFIle {
    
  
    
     // STOCK ---------------------
     static String astockread;
     static String bstockread;
     static String dstockread;
     static String cstockread;
     static String gstockread;
        // ----------------------------
     
     static int astockmin = 0;
     static int bstockmin = 0;
     static int dstockmin = 0;
     static int cstockmin = 0;
     static int gstockmin  = 0;
     
     static int astockadd  = 0;
     static int bstockadd  = 0;
     static int dstockadd  = 0;
     static int cstockadd  = 0;
     static int gstockadd  = 0;
     
     static int astock;
     static int bstock;
     static int dstock;
     static int cstock;
     static int gstock;
        
    
     
    public static void uptStock() throws IOException{
            
        
        try {
      FileWriter stockwriter = new FileWriter("stock.txt");
      stockwriter.write(astock);
      stockwriter.write("\r\n"); 
       stockwriter.write(bstock);
      stockwriter.write("\r\n");
       stockwriter.write(dstock);
      stockwriter.write("\r\n");
       stockwriter.write(cstock);
      stockwriter.write("\r\n");
       stockwriter.write(gstock);
       stockwriter.close();
    
    
     
     System.out.println("Stock Updated Successful");
   } catch (IOException e) {
      System.out.println("An error occurred.");
    e.printStackTrace();
}  
        
        
    BufferedReader sg = new BufferedReader( new FileReader("stock.txt"));     
    
        Stream<String> lines;
      
   astockread = sg.readLine(); 
   lines = sg.lines().skip(1);
   bstockread = sg.readLine(); 
   lines = sg.lines().skip(2);
   dstockread = sg.readLine(); 
   lines = sg.lines().skip(3);
   cstockread = sg.readLine(); 
   lines = sg.lines().skip(4);
   gstockread = sg.readLine(); 
   
   try {
   
   astock = Integer.parseInt(astockread) - astockmin + astockadd;
   bstock = Integer.parseInt(astockread) - bstockmin + bstockadd;
   dstock = Integer.parseInt(astockread) - dstockmin + dstockadd;
   cstock = Integer.parseInt(astockread) - cstockmin + cstockadd;
   gstock = Integer.parseInt(astockread) - gstockmin + gstockadd;
   
   }catch(NumberFormatException e){
       System.out.println("NUMBER FORMAT ERROR");
   }
     
} 
    
    public static void getStock(){
         try {
            FileReader stockreader = new FileReader("stock.txt");
            int character;
 
            while ((character = stockreader.read()) != -1) {
                System.out.print((char) character);
            }
            stockreader.close();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
  
    
    public static void main(String[] args) throws IOException {
        
        int stockchoice;
        int choice;
        
        boolean exit = false;
        Scanner scan = new Scanner(System.in);
        uptStock();
        
        
        
      do{  
        
        System.out.println("WELCOME - PRESS 1 TO OPEN CASHIER PANEL - PRESS 2 TO OPEN INVENTORY PANEL - PRESS 3 TO EXIT");
        System.out.print(">> ");
        choice = scan.nextInt();
        
        
        
        switch(choice){
            case 1:
                System.out.println("-------------------CASHIER PANEL-----------------------");
                break;
           
            case 2:
                
                boolean stockstat = false;
                
               
                
                System.out.println("-------------------INVENTORY PANEL-----------------------");
                System.out.println("CURRENT STOCK --------->");
                System.out.println("");
                getStock();
                System.out.println("");
                
                 do{
                     
                 
                System.out.println("PRESS 1 TO UPDATE STOCK - PRESS 2 TO RETURN - PRESS 3 TO EXIT");   
                System.out.print(">> ");
                stockchoice = scan.nextInt();
                
                switch(stockchoice){
                    case 1: // UPDATE STOCK
                        
                        int uptstockchoice;
                        int addor;
                        
                        System.out.println("");
                        System.out.println("-------------------- UPDATE STOCK -------------------------");
                        
                        
                        System.out.println("");
                        getStock();
                        System.out.println("");
                        System.out.println("WHICH ITEM STOCK TO UPDATE - TYPE ITEM NUMBER");
                        System.out.print(">>");
                        uptstockchoice = scan.nextInt();
                        
                           switch(uptstockchoice){
                              case 1:
                                 System.out.println("");
                                 System.out.println("ADD (1) OR REMOVE (2)");
                                 System.out.print(">> ");
                                 addor = scan.nextInt();
                                 
                                 if(addor==1){
                                  System.out.println("");
                                  System.out.println("ADD HOW MUCH?");
                                  System.out.print(">> ");
                                  astockadd = scan.nextInt(); 
                                  uptStock();
                                  getStock();
                                  System.out.println("");
                                 }
                                 else if(addor==2){
                                 System.out.println("");
                                 System.out.println("REMOVE HOW MUCH?");
                                 System.out.print(">> ");
                                 astockmin = scan.nextInt(); 
                                  uptStock();
                                  getStock();
                                  System.out.println("");
                                 }
                                
                                break;
                                
                            case 2: // bar stock update
                                  System.out.println("");
                                 System.out.println("ADD (1) OR REMOVE (2)");
                                 System.out.print(">> ");
                                 addor = scan.nextInt();
                                 
                                 if(addor==1){
                                  System.out.println("");
                                  System.out.println("ADD HOW MUCH?");
                                  System.out.print(">> ");
                                  bstockadd = scan.nextInt(); 
                                  uptStock();
                                  getStock();
                                  System.out.println("");
                                 }
                                 else if(addor==2){
                                System.out.println("");
                                System.out.println("REMOVE HOW MUCH?");
                                System.out.print(">> ");
                                 bstockmin = scan.nextInt(); 
                                  uptStock();
                                  getStock();
                                  System.out.println("");
                                 }
                                break;
                                
                            case 3: // drink stock update
                              System.out.println("");
                                 System.out.println("ADD (1) OR REMOVE (2)");
                                 System.out.print(">> ");
                                 addor = scan.nextInt();
                                 
                                 if(addor==1){
                                  System.out.println("");
                                  System.out.println("ADD HOW MUCH?");
                                  System.out.print(">> ");
                                  dstockadd = scan.nextInt(); 
                                  uptStock();
                                  getStock();
                                  System.out.println("");
                                 }
                                 else if(addor==2){
                                System.out.println("");
                                System.out.println("REMOVE HOW MUCH?");
                                System.out.print(">> ");
                                 dstockmin = scan.nextInt(); 
                                  uptStock();
                                  getStock();
                                  System.out.println("");
                                 }
                                break;
                                
                             case 4: // chips stock update
                              System.out.println("");
                                 System.out.println("ADD (1) OR REMOVE (2)");
                                 System.out.print(">> ");
                                 addor = scan.nextInt();
                                 
                                 if(addor==1){
                                  System.out.println("");
                                  System.out.println("ADD HOW MUCH?");
                                  System.out.print(">> ");
                                  cstockadd = scan.nextInt(); 
                                  uptStock();
                                  getStock();
                                  System.out.println("");
                                 }
                                 
                                 else if(addor==2){
                                System.out.println("");
                                System.out.println("REMOVE HOW MUCH?");
                                System.out.print(">> ");
                                 cstockmin = scan.nextInt(); 
                                  uptStock();
                                  getStock();
                                  System.out.println("");
                                 }
                                break;
                                
                            case 5: // 
                              System.out.println("");
                                 System.out.println("ADD (1) OR REMOVE (2)");
                                 System.out.print(">> ");
                                 addor = scan.nextInt();
                                 
                                 if(addor==1){
                                  System.out.println("");
                                  System.out.println("ADD HOW MUCH?");
                                  System.out.print(">> ");
                                  gstockadd = scan.nextInt(); 
                                  uptStock();
                                  getStock();
                                  System.out.println("");
                                 }
                                 
                                 else if(addor==2){
                                System.out.println("");
                                System.out.println("REMOVE HOW MUCH?");
                                System.out.print(">> ");
                                 gstockmin = scan.nextInt(); 
                                  uptStock();
                                  getStock();
                                  System.out.println("");
                                 }
                                 
                                break;
                                
                        }
                                 
                        
                    break;
                        
           case 2: // RETURN TO MENU
                        System.out.println("");
                        System.out.println("-------------------------------------------------------");
                        System.out.println("");
                        stockstat = true;
             break;
                    
           case 3:
                        exit = true;
                    break;
                    
                   }
               }while(stockstat==false);
                
                break;
  
         }
                                 
                
                
    }while(exit==false);
        
     
        
        }
                 }
       
     
      

      
      
        
        
       
        
        
      /*  try {
      File myObj = new File("reciept.txt");
      if (myObj.createNewFile()) {
        System.out.println("File created: " + myObj.getName());
      } else {
        System.out.println("File already exists.");
      }
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }*/
  

        
        
        
    
    
 
    

