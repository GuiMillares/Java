/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;

import java.util.Scanner;

public class ExercicioCinco {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        
        int cod1, cod2, number1, number2;
        double value1, value2, total;
        
        System.out.print("Digite o codigo da peca 1: ");
        cod1 = sc.nextInt();
        System.out.print("Digite o numero de pecas: ");
        number1 = sc.nextInt();
        System.out.print("Digite o valor da peca: ");
        value1 = sc.nextDouble();
        
        System.out.print("Digite o codigo da peca 2: ");
        cod2 = sc.nextInt();
        System.out.print("Digite o numero de pecas: ");
        number2 = sc.nextInt();
        System.out.print("Digite o valor da peca: ");
        value2 = sc.nextDouble();
        
        total = (number1 * value1)+(number2 * value2);
        
        System.out.printf("\nVALOR TOTAL A PAGAR: R$%.2f%n", total);
        
    }
}
