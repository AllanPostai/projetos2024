package Array;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[] nReais = new double[8];
        double media = 0;
        double soma = 0;

        for (int i = 0; i < 8; i++) {
            System.out.println("Informe um número real!");
            nReais[i] = entrada.nextDouble();
            soma += nReais[i];
        }
        media = soma / 8;
        System.out.println("Essa é a média");
        System.out.println(media);
        System.out.print("Valores acima da média: ");
        for (int i = 0; i < 8; i++) {
            if (nReais[i] > media) {
                System.out.print(nReais[i]+" ");

            }
        }
    }
}
