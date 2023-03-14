/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor20;

/**
 *
 * @author Guizão AK TROVIS
 */

import java.util.Random;

public class Vetor20 {
    public static void main(String[] args) {
        double [] vetor = new double[20];
        double soma = 0;
        
        Random rand = new Random();
        for(int i = 0; i < vetor.length; i++){
            vetor[i] = rand.nextDouble()*100;
            soma += vetor[i];
        }
        
        double media = soma / vetor.length;
        
        System.out.println("Valores menores que a média (" + media + "):");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < media) {
                System.out.println(vetor[i]);
        
            }
        }
    }
}
    

