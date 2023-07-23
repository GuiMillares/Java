/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicios;

import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        
        int a, b, resultado;
        
        System.out.print("Digite o primeiro valor: ");
        a = sc.nextInt();
        System.out.print("Digite o segundo valor: ");
        b = sc.nextInt();
        
        resultado = a + b;
        
        System.out.println("SOMA: "+ resultado);
    }
    
}
