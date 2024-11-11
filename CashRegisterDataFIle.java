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
     int astock = 30;
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
    
    
    
    
    public static void main(String[] args) {
        
        int stockchoice;
        int choice;
        Scanner scan = new Scanner(System.in);
        uptStock();
        
        
        
        
        
        System.out.print("Welcome -- press 1 to for cashier panel -- press 2 for inventory panel >> ");
        choice = scan.nextInt();
        
        
        switch(choice){
            case 1:
                System.out.println("-------------------CASHIER PANEL-----------------------");
                break;
            case 2:
                
                
                System.out.println("-------------------INVENTORY PANEL-----------------------");
                System.out.println("CURRENT STOCK --------->");
                System.out.println("");
                getStock();
                System.out.println("");
                System.out.print("PRESS 1 TO UPDATE STOCK - PRESS 2 TO EXIT ---------> ");      
                stockchoice = scan.nextInt();
                
                break;
            default:
                System.out.println("Welcome -- press 1 to for cashier panel -- press 2 for inventory panel");
                choice = scan.nextInt();
                break;
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
  

        
        
        
    }
    
 
    
}
