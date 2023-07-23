/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade;

import java.util.Scanner;

public class AtividadeDois {
     public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    int a;
    
         System.out.print("Digite um numero: ");
         a = sc.nextInt();
         
         if( a % 2 == 0){
             System.out.println("PAR");
         }else{
             System.out.println("IMPAR");
         }
    
     } 
}
