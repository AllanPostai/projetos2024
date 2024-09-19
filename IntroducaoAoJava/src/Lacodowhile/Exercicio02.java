package Lacodowhile;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String opcao = "";
        int quantidadeTotalIngressos = 0;
        int quantidadeTotalLanches = 0;
        double valorTotalIngressos = 0;
        double valorTotalLanches = 0;
        
//Ingressos
        do {
            System.out.println("1. Aventura Espacial - R$ 20,00 \n"
                    + "2. Comédia Romântica - R$ 18,00 \n"
                    + "3. Terror na Floresta - R$ 22,00 \n"
                    + "4. Documentário Animal - R$ 15,00 \n"
                    + "5. Filme de Ação - R$ 25,00 ");

            int filmeEscolhido = entrada.nextInt();
            switch (filmeEscolhido) {
                case 1:
                    quantidadeTotalIngressos++;
                    valorTotalIngressos += 20;
                    break;
                case 2:
                    quantidadeTotalIngressos++;
                    valorTotalIngressos += 18;
                    break;
                case 3:
                    quantidadeTotalIngressos++;
                    valorTotalIngressos += 22;
                    break;
                case 4:
                    quantidadeTotalIngressos++;
                    valorTotalIngressos += 15;
                    break;
                case 5:
                    quantidadeTotalIngressos++;
                    valorTotalIngressos += 25;
                    break;
            }
            System.out.println("Quer escolher mais algum filme?"
                    + "\nS Sim"
                    + "\nN Não");
            opcao = entrada.next();
        } while (opcao.equalsIgnoreCase("S"));
        System.out.println(quantidadeTotalIngressos + "\n"
                + valorTotalIngressos);
        //Lanches
        do {
            System.out.println("1. Pipoca Média - R$ 10,00 \n"
                    + "2. Refrigerante - R$ 8,00 \n"
                    + "3. Nachos - R$ 12,00 \n"
                    + "4. Balde de Pipoca Grande - R$ 15,00 \n"
                    + "5. Chocolate - R$ 5,00");

            int lancheEscolhido = entrada.nextInt();
            switch (lancheEscolhido) {
                case 1:
                    quantidadeTotalLanches++;
                    valorTotalLanches += 10;
                    break;
                case 2:
                    quantidadeTotalLanches++;
                    valorTotalLanches += 8;
                    break;
                case 3:
                    quantidadeTotalLanches++;
                    valorTotalLanches += 12;
                    break;
                case 4:
                    quantidadeTotalLanches++;
                    valorTotalLanches += 15;
                    break;
                case 5:
                    quantidadeTotalLanches++;
                    valorTotalLanches += 25;
                    break;

            }
            System.out.println("Quer escolher mais algum prato?"
                    + "\nS Sim"
                    + "\nN Não");
            opcao = entrada.next();
        } while (opcao.equalsIgnoreCase("S"));
        
        System.out.println("Você comprou "+ quantidadeTotalLanches +" lanches e "+ quantidadeTotalIngressos+ " ingressos");
        System.out.println("Valor total de ingressos "+ valorTotalIngressos);
        System.out.println("Valor total de lanches "+ valorTotalLanches);
        System.out.println("Valor total da compra"+ (valorTotalIngressos + valorTotalLanches));
        
    }
}
