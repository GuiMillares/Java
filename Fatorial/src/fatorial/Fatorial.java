/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fatorial;

/**
 *
 * @author Guizão AK TROVIS
 */

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite um numero: ");
        int num = input.nextInt();
        
        int fatorial = 1;
        for (int i = 1; i <= num; i++) {
            fatorial *= i;
        }
        System.out.printf("%d! e %d\n", num, fatorial);
    }
    
}
