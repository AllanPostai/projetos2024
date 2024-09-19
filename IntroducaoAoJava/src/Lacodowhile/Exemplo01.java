package Lacodowhile;

import java.util.Scanner;

public class Exemplo01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String candidato1 = "Allan";
        String candidato2 = "Bruno";
        String candidato3 = "Vitor";
        int votosCandidato1 = 0;
        int votosCandidato2 = 0;
        int votosCandidato3 = 0;
        int nulos = 0;
        String opcao = "";

        do {
            System.out.println("CANDIDATOS:");
            System.out.println("1 - Allan;");
            System.out.println("2 - Bruno;");
            System.out.println("3 - Vitor;");
            System.out.println("Escolha seu candidato:");

            int voto = entrada.nextInt();
            switch (voto) {
                case 1:
                    votosCandidato1++;
                    break;

                case 2:
                    votosCandidato2++;
                    break;

                case 3:
                    votosCandidato3++;
                    break;
            }
            System.out.println("tem mais eleitor?"
                    + "\nS - sim;"
                    + "\nN - não;");
            opcao = entrada.next();
        } while (opcao.equalsIgnoreCase("S"));

        if (votosCandidato1 > votosCandidato2 && votosCandidato1 > votosCandidato3) {
            System.out.println(candidato1 + " foi o vencedor!");
        } else if (votosCandidato2 > votosCandidato1 && votosCandidato2 > votosCandidato3) {
            System.out.println(candidato2 + " foi o vencedor!");
        } else {
            System.out.println(candidato3 + " voi o vencedor!");

        }
        System.out.println(candidato1 + ": " + candidato1);
        System.out.println(candidato2 + ": " + candidato2);
        System.out.println(candidato3 + ": " + candidato3);
    }
}
