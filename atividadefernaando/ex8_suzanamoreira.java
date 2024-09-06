/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividadefernaando;

import java.util.Scanner;

/**
 *
 * @author suzana
 */
public class ex8_suzanamoreira {
     
    public static void main(String args[])
    { 
        int agua1 , agua30, suzana;
        
        
                Scanner s =  new Scanner(System.in);
                
                System.out.print(" Consumo de agua dia 1:");
                agua1 = s.nextInt();
                 System.out.print(" Consumo de agua dia 30 :");
                agua30 = s.nextInt();
               suzana = agua1 + (agua30 * 30);  
                System.out.print("\nconsumo total de agua:" + suzana);
               
               
                 
                System.out.println("\nmedia do consumo de agua:" +(suzana / 30));
                
                
    }
}

