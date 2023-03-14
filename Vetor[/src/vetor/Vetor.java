/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor;

/**
 *
 * @author Guizão AK TROVIS
 */

import java.util.Random;
        
public class Vetor {
    public static void main(String[] args) {
        int[] vetor = new int[10];

        Random rand = new Random();
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = rand.nextInt(100);
        }

        System.out.println("Vetor original:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }

        System.out.println("\nVetor invertido:");
        for (int i = vetor.length - 1; i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }
    }
}

