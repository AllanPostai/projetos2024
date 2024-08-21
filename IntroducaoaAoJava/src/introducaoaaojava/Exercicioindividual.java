
package introducaoaaojava;

import java.util.Scanner;

public class Exercicioindividual {public static void main(String[] args) {
         Scanner entrada =new Scanner(System.in);
            System.out.println("Informe a entrada em graus Farenheit");
            double farenheit = entrada.nextDouble();
            
            double C = ((farenheit -32) * (5 / 9.0));
            System.out.println("A temperatura em celcios é:"+ C);
            
          
    }
    
}
