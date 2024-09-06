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
public class Ex9_suzana_moreira {
    

    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
            
            System.out.print("Digite um número inteiro: ");
            int numero = scanner.nextInt();
            
            double resultado;
            
            
            if (numero > 10 && numero < 100) {
               
                resultado = Math.pow(numero, 2);
                System.out.printf("O número elevado a 2 é: %.5f%n", resultado);
            } else {
                
                resultado = Math.sqrt(numero);
                System.out.printf("A raiz quadrada do número é: %.5f%n", resultado);
            }
        }
    }
}
