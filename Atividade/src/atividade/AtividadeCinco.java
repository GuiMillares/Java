/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade;

import java.util.Scanner;

public class AtividadeCinco {
     public static void main(String[] args) {
     
        double[] precos = {4.00, 4.50, 5.00, 2.00, 1.50};

        // Tabela de especificações
        String[] especificacoes = {
            "Cachorro Quente",
            "X-Salada",
            "X-Bacon",
            "Torrada Simples",
            "Refrigerante"
        };

        // Leitura do código e quantidade do item
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o codigo do item: ");
        int codigo = scanner.nextInt();
        System.out.print("Digite a quantidade: ");
        int quantidade = scanner.nextInt();
        scanner.close();

        // Verifica se o código é válido
        if (codigo >= 1 && codigo <= precos.length) {
            // Subtrai 1 do código para obter o índice correto no array
            int indice = codigo - 1;
            double precoUnitario = precos[indice];
            String especificacao = especificacoes[indice];

            // Cálculo do valor da conta
            double valorConta = precoUnitario * quantidade;

            // Exibe o resultado
           /* System.out.println("Especificacao: " + especificacao);
            System.out.println("Preço unitario: R$" + precoUnitario);
            System.out.println("Quantidade: " + quantidade);*/
            System.out.printf("Valor total da conta: R$%.2f%n", valorConta);
        } else {
            System.out.println("Codigo invalido!");
        }
    }
}