/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicios2;

import java.util.Scanner;

/**
 *
 * @author Guizão AK TROVIS
 */
public class Exercicios2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here        
        Scanner entrada = new Scanner(System.in);
        int n = 10;
        int v[] = new int[n];
        int i;
        
        for (i=0;i<n;i++){
            System.out.println("Informe o %2do. Valor de %d", (i+1),n);
        
            v[i]=entrada.nextInt();
        }
        for (int n=0;n<v.count;++i);
        System.out.println(v[i]+"");
        System.out.println();
    }
    
}
