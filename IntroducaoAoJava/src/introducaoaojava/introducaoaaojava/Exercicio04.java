
package introducaoaaojava;

import java.util.Scanner;


public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada =new Scanner(System.in);
         System.out.println("informe o valor total de eleitores de um município:");
         int eleitores =entrada.nextInt();
         System.out.println("informe o número de votos brancos:");
         int brancos =entrada.nextInt();
         System.out.println("informe a quantidade de votos válidos:");
         int validos =entrada.nextInt();
         System.out.println("informe a quantidade de votos nulos:");
         int nulos =entrada.nextInt();
         System.out.println("nulos -" + (nulos * 100 / eleitores) +" %");
         System.out.println("brancos -" + (brancos * 100 / eleitores) +" %");
         System.out.println("validos -" + (validos * 100 / eleitores) +" %");
    }
    
}
