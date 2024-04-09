//Chico tem 1,50 metro e cresce 2 centímetros por ano, enquanto Zé tem 1,10 metro e cresce 3 centímetros por ano.
//Construa um algoritmo que calcule e imprima quantos anos serão necessários para que Zé seja maior que Chico.
package desafio6;

import java.util.Scanner;


public class Desafio6 {

  
    public static void main(String[] args) {
     Scanner ler = new Scanner (System.in);
   int intervalo1 = 0;
        int intervalo2 = 0;
        int intervalo3 = 0;
        int intervalo4 = 0;
        
        System.out.println("Digite uma sequência de números (digite um número negativo para encerrar):");
        
        int numero = ler.nextInt();
        while (numero >= 0) {
            if (numero >= 0 && numero <= 25) {
                intervalo1++;
            } else if (numero >= 26 && numero <= 50) {
                intervalo2++;
            } else if (numero >= 51 && numero <= 75) {
                intervalo3++;
            } else if (numero >= 76 && numero <= 100) {
                intervalo4++;
            }
            numero = ler.nextInt();
        }
        
        System.out.println("Quantidade de números no intervalo [0,25]: " + intervalo1);
        System.out.println("Quantidade de números no intervalo [26,50]: " + intervalo2);
        System.out.println("Quantidade de números no intervalo [51,75]: " + intervalo3);
        System.out.println("Quantidade de números no intervalo [76,100]: " + intervalo4);
    }
}

