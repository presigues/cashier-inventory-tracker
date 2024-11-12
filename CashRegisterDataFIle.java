/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.cashregisterdatafile;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author pres2590
 */
public class CashRegisterDataFIle {
    
    public static void uptStock(){
        
        
     
        // STOCK ---------------------
     int astock = 40;
     int bstock = 24;
     int dstock = 80;
     int cstock = 50;
     int gstock = 20;
        // ----------------------------
        
        try {
      FileWriter stockwriter = new FileWriter("stock.txt");
      stockwriter.write("APPLES >> " + astock);
      stockwriter.write("\r\n"); 
       stockwriter.write("BARS >> " + bstock);
      stockwriter.write("\r\n");
       stockwriter.write("DRINKS >> " + dstock);
      stockwriter.write("\r\n");
       stockwriter.write("CHIPS >> " + cstock);
      stockwriter.write("\r\n");
       stockwriter.write("GUM >> " + gstock);
       stockwriter.close();
    
     
     
     System.out.println("Stock Updated Successful");
   } catch (IOException e) {
      System.out.println("An error occurred.");
    e.printStackTrace();
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
    
    public static void readSpecStock(){
          try {
            FileReader stockreader = new FileReader("stock.txt");
            int character;
 
        
            stockreader.close();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    
    
    
    public static void main(String[] args) {
        
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
                        
                        System.out.println("");
                        System.out.println("-------------------- UPDATE STOCK -------------------------");
                        
                        
                        System.out.println("");
                        System.out.println("APPLE - 1");
                        System.out.println("BARS - 2");
                        System.out.println("DRINK - 3");
                        System.out.println("CHIPS - 4");
                        System.out.println("GUM - 5");
                        System.out.println("");
                        System.out.println("WHICH ITEM STOCK TO UPDATE - TYPE ITEM NUMBER");
                        System.out.print(">>");
                        uptstockchoice = scan.nextInt();
                        
                        switch(uptstockchoice){
                            case 1:
                                 System.out.println("");
                                
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                            case 5:
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
                
                }while(stockstat=false);
                
                break;
  
        }
                
                
      }while(exit==false);
        
     
        
        
        
        
       
        
        
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
  

        
        
        
    }
    
 
    
}
