
package introducaoaaojava;

import java.util.Scanner;

public class Exercicio06 {public static void main(String[] args) {
         Scanner entrada =new Scanner(System.in);
            System.out.println("informe o valor de fabrica do carro");
            double carro =entrada.nextDouble();
            
            double valorImposto = carro * 0.45;
            double valorDistribuidor = carro * 0.28;
            
            double total = carro + valorImposto + valorDistribuidor;
            System.out.println("O valor final do carro é"+ total);
         
    }
    
}
