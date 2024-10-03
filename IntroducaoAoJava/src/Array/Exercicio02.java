package Array;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] inteiros = new int[10];
        int cont = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Informe um valor inteiro");
            inteiros[i] = entrada.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            if (inteiros[i] < 0) {
                cont++;
            }
        }
        System.out.println("foram digitados " + cont + " números negativos");

    }

}
