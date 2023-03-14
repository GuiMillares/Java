/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mediamaiormenor;

/**
 *
 * @author Guizão AK TROVIS
 */
import java.util.Scanner;

public class MediaMaiorMenor {
    public static void main(String[] args) {
        int[] vetor = new int[20];
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int soma = 0;
        
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o valor " + (i+1) + ": ");
            vetor[i] = sc.nextInt();
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
            soma += vetor[i];
        }
        sc.close();


        double media = (maior + menor) / 2.0;
        System.out.println("Media entre o maior (" + maior + ") e o menor (" + menor + "): " + media);

     
        int qtdMaiores = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > media) {
                qtdMaiores++;
            }
        }
        System.out.println("Quantidade de valores maiores que a media: " + qtdMaiores);
    }
}
