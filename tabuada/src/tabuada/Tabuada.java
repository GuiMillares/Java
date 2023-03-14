/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tabuada;

import java.util.Scanner;

/**
 *
 * @author Guizão AK TROVIS
 */
public class Tabuada {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
      int num1;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um numero: ");
        num1 = scanner.nextInt();
        for(int i = 0; i<=10;i++){
            System.out.println(num1 +" * " + i + " = " + (num1*i));
        }
      }

    static String fibo(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    }

    
