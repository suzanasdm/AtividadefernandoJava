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
public class Ex7_suzana_moreira 
    {public static void main(String args[]){
    int num1,num2;
        Scanner s = new Scanner(System.in);
        System.out.print("Informe num1:");
        num1 = s.nextInt();
        System.out.print("Informe num2:");
        num2 =s.nextInt();
        
       System.out.println();
       System.out.println("num1 é maior ou igual:" +(num1>= num2));
       
       System.out.println();
       System.out.println("num1 é maior:" +(num1> num2));
       
       System.out.println(":");
       System.out.println("num1 é menor:" +(num1 < num2));
       
       System.out.println();
       System.out.println("num1 é menor ou igual:" +(num1<= num2));
       
       System.out.println();
       System.out.println("num1 é igual:" +(num1 != num2));
       
       
       
    }      
}
