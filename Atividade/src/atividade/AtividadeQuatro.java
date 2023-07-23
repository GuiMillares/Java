/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade;

import java.util.Scanner;

public class AtividadeQuatro {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite a hora inicial do jogo: ");
        int horaInicial = sc.nextInt();
        System.out.print("Digite a hora final do jogo: ");
        int horaFinal = sc.nextInt();

        int duracao;
        
        if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
        } else {
            duracao = 24 - horaInicial + horaFinal;
        }

        if (duracao >= 1 && duracao <= 24) {
            System.out.println("A duracao do jogo e de " + duracao + " hora(s).");
        } else {
            System.out.println("Horarios invalidos! A duracao do jogo deve ser de no minimo 1 hora e no maximo 24 horas.");
        }
        
    }
}
