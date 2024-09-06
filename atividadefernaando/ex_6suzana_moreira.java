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
public class ex_6suzana_moreira {
    public static void main(String args[]){
        
    double num1;
        Scanner s = new Scanner(System.in);
        System.out.print("Informe num1:");
        num1 = s.nextInt();
    
        System.out.println("elevado a 2:");
        System.out.print(Math.pow(num1, 2));
        
        System.out.println("\nelevado a 4:");
        System.out.print(Math.pow(num1, 4));
        
        System.out.println("\nelevado a 6:");
        System.out.print(Math.pow(num1, 6));
        
        System.out.println("\nelevado a 8:");
        System.out.print(Math.pow(num1, 8));
        
        System.out.println("\nelevado a 10:");
        System.out.print(Math.pow(num1, 10));
}
}
