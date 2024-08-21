
package introducaoaaojava;

import java.util.Scanner;

public class Exercicio12 {public static void main(String[] args) {
         Scanner entrada =new Scanner(System.in);
            System.out.println("Informe a quantidade de notas de 2");
            int nota2 = entrada.nextInt();
            System.out.println("Informe a quantidade de notas de 5");
            int nota5 = entrada.nextInt();
            System.out.println("Informe a quantidade de notas de 10");
            int nota10 = entrada.nextInt();
            System.out.println("Informe a quantidade de notas de 20");
            int nota20 = entrada.nextInt();
            System.out.println("Informe a quantidade de notas de 100");
            int nota100 = entrada.nextInt();
            System.out.println("Informe a quantidade de notas de 200");
            int nota200 = entrada.nextInt();
            
            int total = (nota2*2+nota5*5+nota10*10+nota20*20+nota100*100+nota200*200);
            
            System.out.println(total);
            
    }
    
}
