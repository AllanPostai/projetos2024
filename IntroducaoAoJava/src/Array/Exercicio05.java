package Array;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] vetorA = new int[5];
        int[] vetorB = new int[5];
        int[] vetorC = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Informe o valor" + (i + 1) + "Para valor A");
            vetorA[i] = entrada.nextInt();

        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Informe o valor" + (i + 1) + "Para valor B");
            vetorB[i] = entrada.nextInt();

        }
        for (int i = 0; i < 5; i++) {
            vetorC[i] = vetorA[i] * vetorB[i];
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(vetorA[i] + " * " + vetorB[i] + " = " + vetorC[i]);

        }

    }
}
