package introducaoaojava.Lacofor;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double total = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Informe o valor" + (i + 1));
            double valor = entrada.nextDouble();
            total = total + valor;
        }
        System.out.println("Total");
        System.out.println("Media"+ total / 5);

    }
}
