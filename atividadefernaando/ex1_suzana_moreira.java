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
public class ex1_suzana_moreira {
     public static void main(String[] args) {
        double nota1 , nota2 , media;
        String resultado ="";
        Scanner Scan = new Scanner(System.in);
         
        System.out.println("programa de calcular Resultado:");
        System.out.print("informe nota 1:");
        nota1 = Scan.nextDouble();
         System.out.print("informe nota 2:");
        nota2 = Scan.nextDouble();
        
        media = (nota1 + nota2) / 2;
        
        if(media >= 6){
        resultado = "Aprovado!";
        
        }
        else if (media >= 4){
            resultado = "Prova Substitutiva!";
        }
        else{
            resultado = "reprovado!";
        }
        System.out.printf("media:%.1f" , media);
        System.out.println("-resultado:" + resultado);
        
                
        
    }
        
    


    
}
