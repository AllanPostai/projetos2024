package Array;

import java.util.Random;

public class Exemplo02 {

    public static void main(String[] args) {
        int[] idade = new int[10000];
        Random aleatorio = new Random();

        for (int i = 0; i < 10000; i++) {
            idade[i] = aleatorio.nextInt(101);
        }
        //Mostre quantas pessoas tem mais de 60 anos;
        int pessoasComMaisDe60 = 0;
        for (int i = 0; i < 10000; i++) {
            if (idade[i] > 60) {
                pessoasComMaisDe60++;
            }
        }
        System.out.println("Total de pessoas com mais de 60:" + pessoasComMaisDe60);

        //Mostre a idade da pessoa mais velha;
        int idadePessoaMaisVelha = 0;
        for (int i = 0; i < 10000; i++) {
            if (idade[i] > idadePessoaMaisVelha) {
                idadePessoaMaisVelha = idade[i];

            }
        }
        System.out.println("Idade de pessoa mais velha:" + idadePessoaMaisVelha);

//Mostre quantas pessoas são menores de idade;
        int quantidadeDeMenores = 0;
        for (int i = 0; i < 10000; i++) {
            if (idade[i] < 18) {
                quantidadeDeMenores++;
            }
        }
        System.out.println("Quantidade de menores: " + quantidadeDeMenores);

        //Mostre a média de idade de todas as pessoas;
        double totalIdades = 0;
        for (int i = 0; i < 10000; i++) {
            totalIdades = totalIdades + idade[i];
        }
        System.out.println("Média de idades: " + (totalIdades / 10000));
    }
}
