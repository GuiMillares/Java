/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tabuada;


/**
 *
 * @author Guizão AK TROVIS
 */
class Fibonacci {
        static long fibo(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }

    public static void main(String[] args) {

	// teste do programa. Imprime os 30 primeiros termos
	for (int i = 0; i < 30; i++) {
            System.out.println( + Tabuada.fibo(i) + "\t");
        }

    }

}
