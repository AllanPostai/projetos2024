package lacoWhile;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe a massa em gramas");
        double massa = entrada.nextDouble();
        double massaInicial = massa;

        int tempo = 0;
        while (massa > 0.5) {
            massa = massa / 2;
            tempo += 50;
        }
        System.out.println("Massa inicial:" + massaInicial);
        System.out.println("Massa final" + massa);
        System.out.println("Horas" + 3600);
        System.out.println("Minutos" + tempo % 3600 / 60);
        System.out.println("Segundos" + tempo % 60);

    }
}


