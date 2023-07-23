/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;

import java.util.Scanner;

public class ExercicioSeis {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        
        double A, B, C, triangle, circle, trapezoid, square, rectangle;
        double p = 3.14159;
        
        System.out.print("Digite o valor de A: ");
        A = sc.nextDouble();
        System.out.print("Digite o valor de B: ");
        B = sc.nextDouble();
        System.out.print("Digite o valor de C: ");
        C = sc.nextDouble();
        
        double c = Math.pow(C, 2);
        
        triangle = (A * C)/2;
        circle = p * c;
        trapezoid = ((A + B)* C)/2;
        square = B * B;
        rectangle = A * B;
        
        System.out.printf("\nTRIANGULO: %.3f%n", triangle);
        System.out.printf("CIRCULO: %.3f%n", circle);
        System.out.printf("TRAPEZIO: %.3f%n", trapezoid);
        System.out.printf("QUADRADO: %.3f%n", square);
        System.out.printf("RETANGULO: %.3f%n", rectangle);
        
    }
}
