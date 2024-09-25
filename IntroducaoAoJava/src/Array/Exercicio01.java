
package Array;

import java.util.Scanner;

public class Exercicio01 {public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
     int[] inteiros = new int[5];
     int soma =0;
     
     //recebendo valores de entrada;
            for (int i = 0; i < 5; i++) {
                System.out.println("Informe um número inteiro");   
                inteiros[i] = entrada.nextInt();
            }
            for (int i = 0; i < 5; i++) {
              soma += inteiros[i]; 
            }
            System.out.println("Soma: "+ soma);
    }
    
}
