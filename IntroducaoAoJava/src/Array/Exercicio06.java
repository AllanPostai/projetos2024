package Array;

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] nomes = new String[6];
        String nomeProcurado = "";
       
        for (int i = 0; i < 6; i++) {
            System.out.println("Informe o nome!");
            nomes[i] = entrada.next();
        }
        System.out.println("Esse nome está na lista!");
        System.out.println("Informe um nome a ser procurado na lista");
        nomeProcurado = entrada.next();
        for (int i = 0; i < 6; i++) {
            if (nomeProcurado.equals(nomes[i])) {
                System.out.println("Achei o nome");

            }
        }

    }

}
