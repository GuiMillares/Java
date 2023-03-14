/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgwhile;

/**
 *
 * @author Guizão AK TROVIS
 */


import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soma = 0;
        int contador = 0;

        while (true) {
            System.out.print("Digite um valor natural (ou 0 para sair): ");
            int valor = scanner.nextInt();

            if (valor == 0) {
                break;
            }

            soma += valor;
            contador++;
        }

        if (contador > 0) {
            double media = (double) soma / contador;
            System.out.println("Média aritmética dos valores informados: " + media);
        } else {
            System.out.println("Nenhum valor informado.");
        }

        scanner.close();
    }
}
