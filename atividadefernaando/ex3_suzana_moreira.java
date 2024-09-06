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
public class ex3_suzana_moreira {
    public static void main(String args[]){
        
        int num1,num2;
        Scanner s = new Scanner(System.in);
        System.out.print("Informe num1:");
        num1 = s.nextInt();
        System.out.print("Informe num2:");
        num2 =s.nextInt();
        
       System.out.println("Exemplos operadores Aritmeticos:");
       System.out.println("Adicao:" +(num1+num2));
       System.out.println("subtracao:" + (num1 - num2));
        System.out.println("Divis?o:" + (num1 / num2));
         System.out.println("multiplicacao:" + (num1 * num2));
         
          System.out.println("Qual o maior numero:" + (num1 >= num2));
           System.out.println("qual o menor numero:" + (num1 <=num2)); }
    
}
