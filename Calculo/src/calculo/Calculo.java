/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculo;

/**
 *
 * @author Guizão AK TROVIS
 */


    import java.util.Scanner;

public class Calculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a altura em metros: ");
        double altura = scanner.nextDouble();

        System.out.print("Digite o sexo (M para masculino ou F para feminino): ");
        String sexo = scanner.next();

        double pesoIdeal;

        if (sexo.equalsIgnoreCase("M")) {
            pesoIdeal = 72.7 * altura - 58;
        } else if (sexo.equalsIgnoreCase("F")) {
            pesoIdeal = 62.1 * altura - 44.7;
        } else {
            System.out.println("Sexo inválido.");
            return;
        }

        System.out.printf("O peso ideal para uma pessoa de %.2fm de altura e sexo %s e %.2fkg.%n", altura, sexo, pesoIdeal);
    }
}
