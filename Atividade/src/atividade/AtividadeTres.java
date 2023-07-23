/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade;

import java.util.Scanner;

public class AtividadeTres {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        
        int a, b;
    
        System.out.print("Digite o primeiro numero: ");
        a = sc.nextInt();
        System.out.print("Digite o segundo numero: ");
        b = sc.nextInt();
        
        if(a % b == 0 || b % a == 0){
            System.out.println("Sao Multiplos");
        }else{
            System.out.println("Nao Sao Multiplos");
        }
        
    }
}
