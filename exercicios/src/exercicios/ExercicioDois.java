/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;

import java.util.Scanner;

public class ExercicioDois {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    double area, raio;
    double p = 3.14159;
    
        System.out.print("Digite o valor do raio: ");
        raio = sc.nextDouble();
        
        double r = Math.pow(raio, 2);
        
        area = p * r;
        
        System.out.printf("A=%.4f%n", area);
    }
}

/* import java.util.Scanner;

public class ExercicioDois {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double area, raio;
        double p = 3.14159;

        System.out.print("Digite o valor do raio: ");
        raio = sc.nextDouble();

        double r = Math.pow(raio, 2);

        area = p * r;

        System.out.printf("A=%.4f%n", area);
    }
}*/