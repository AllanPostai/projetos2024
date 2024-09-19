package lacoWhile;

import java.util.Scanner;

public class Exercício02 {

    public static void main(String[] args) {
        double paisA = 80000;
        double paisB = 200000;
        int contadordeAnos = 0;

        while (paisA < paisB) {
            paisA = paisA * 1.03;
            paisB = paisB * 1.015;
            contadordeAnos = contadordeAnos + 1;

        }
        System.out.println("Pospulação do país A" + (int) paisA);
        System.out.println("População do país B" + (int) paisB);
        System.out.println(contadordeAnos + "anos");

    }

}
