/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;

import java.util.Scanner;

public class ExercicioQuatro {
     public static void main(String[] args) {
     
         Scanner sc = new Scanner(System.in);
         
         int number, hour;
         double  valueHour, salary;
         
         System.out.print("Digite o seu numero: ");
         number = sc.nextInt();
         System.out.print("Digite o numero de horas trabalhadas: ");
         hour = sc.nextInt();
         System.out.print("Digite o valor por hora: ");
         valueHour = sc.nextDouble();
         
         salary = hour * valueHour;
         
         System.out.println("NUMBER = "+number);
         System.out.printf("SALARY: U$%.2f%n", salary);
     }
}
