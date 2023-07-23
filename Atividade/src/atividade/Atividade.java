/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade;

import java.util.Scanner;

public class Atividade {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int a;
        
        System.out.print("Digite um numero: ");
        a = sc.nextInt();
       
        if(a > 0 ){
            System.out.println("POSITIVO");
        }else{
            System.out.println("NEGATIVO");
        }
    }
    
}
