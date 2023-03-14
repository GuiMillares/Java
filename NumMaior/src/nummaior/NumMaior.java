/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nummaior;

/**
 *
 * @author Guizão AK TROVIS
 */

import java.util.Scanner;

public class NumMaior {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         
         System.out.print("Digite um numero: ");
         int num1 = scanner.nextInt();
         
         System.out.print("Digite outro numero: ");
         int num2 = scanner.nextInt();
         
         if(num1 > num2){
             System.out.println("O maior numero e " +num1);
         }else{
             System.out.println("O mairo numero e " +num2);
         }
    }
    
}
