package Lacodowhile;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int totalDePedidos = 0;
        double totalaSerPago = 0;
        double totalDeCalorias = 0;

        String opcao = "";
        do {
            exibirMenu();
            int prato = entrada.nextInt();
            switch (prato) {
                case 1:
                    totalaSerPago += 25;
                    totalDeCalorias += 800;
                    break;
            
              
             }
             System.out.println("Quer escolher mais algum prato"
                     + "\nS - Sim"
                     + "\nN - Não");
             opcao = entrada.next();
             }while (opcao.equalsIgnoreCase("S"));

    }

    public static void exibirMenu() {
        System.out.println("MENU:"
                + "\nPizza - R$ 25,00 - 800 calorias \n"
                + ". Hamburguer - R$ 20,00 - 600 calorias \n"
                + ". Salada - R$ 15,00 - 200 calorias \n"
                + ". Lasanha - R$ 30,00 - 900 calorias \n"
                + ". Suco - R$ 8,00 - 100 calorias");

        System.out.println("Escolha seu prato!");

    }



}
