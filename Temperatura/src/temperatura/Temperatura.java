/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package temperatura;

/**
 *
 * @author Guizão AK TROVIS
 */

import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double somaTemperaturas = 0;

        for (int dia = 1; dia <= 365; dia++) {
            System.out.printf("Informe a temperatura máxima do dia %d: ", dia);
            double temperatura = input.nextDouble();
            somaTemperaturas += temperatura;
        }

        double temperaturaMediaAnual = somaTemperaturas / 365;
        System.out.printf("A temperatura média anual foi de %.2f°C\n", temperaturaMediaAnual);
    }
}

    

