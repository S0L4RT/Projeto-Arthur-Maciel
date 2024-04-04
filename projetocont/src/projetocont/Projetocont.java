
package projetocont;

import java.util.Scanner;


public class Projetocont {

    
    public static void main(String[] args) {
    
    }
    Scanner input = new Scanner(System.in);
        int contadorPares = 0;
        int contadorImpares = 0;
        int contadorNulos = 0;

        for (int i = 0; i < 30; i++) {
            System.out.print("Digite um número: ");
            int valor = input.nextInt();

            if (valor == 0) {
                contadorNulos++;
            } else if (valor % 2 == 0) {
                contadorPares++;
            } else {
                contadorImpares++;
            }
        }

        /*System.out.println("Total de números pares: " + contadorPares);*/
        /* System.out.println("Total de números ímpares: " + contadorImpares);*/
        /* System.out.println("Total de números nulos: " + contadorNulos);*/
    }




