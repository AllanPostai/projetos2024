package Array;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] nomes = new String[5];
        String maiorNome = "";

        for (int i = 0; i < 5; i++) {
            System.out.println("Informe um nome");
            nomes[i] = entrada.nextLine();
        }
        for (int i = 0; i < 5; i++) {
            if (nomes[i].length() > maiorNome.length()) {
                maiorNome = nomes[i];
            }
        }
        System.out.println(maiorNome);
        System.out.println("Esse é o vencedor!");

    }

}
