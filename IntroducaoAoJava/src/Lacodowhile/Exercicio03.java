package Lacodowhile;

import java.util.Random;
import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random aleatorio = new Random();
        int valorChutado = 0;
        int valorSorteado = aleatorio.nextInt(10) + 1;
        int cont=0;
        
        System.out.println("Jogo da senha");
        System.out.println("Foi sorteado um valor de 1 a 10: Adivinhe:");
        do {
            valorChutado = entrada.nextInt();
            if (valorChutado < valorSorteado){
                System.out.println("Você errou. Tente um valor maior:");
            }else if (valorChutado > valorSorteado){
                System.out.println("Você errou. Tente um valor menor:");
            }
        } while(valorSorteado != valorChutado);
        
        if(cont<3){
            System.out.println("Parabéns!");
        }else if(cont > 5){
            System.out.println("você foi muito mal!");
        }else {
            System.out.println("você pode melhorar!");
            
        }
    
    }

}
