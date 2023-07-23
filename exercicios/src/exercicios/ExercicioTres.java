/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;

import java.util.Scanner;

public class ExercicioTres {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        
        int A, B, C, D, diferenca;
        
        System.out.print("Digite o valor de A: ");
        A = sc.nextInt();
        System.out.print("Digite o valor de B: ");
        B = sc.nextInt();
        System.out.print("Digite o valor de C: ");
        C = sc.nextInt();
        System.out.print("Digite o valore de D: ");
        D = sc.nextInt();
        
        diferenca = (A*B-C*D);
        
        System.out.println("DIFERENCA = "+diferenca);
        
    sc.close();    
    }
}
