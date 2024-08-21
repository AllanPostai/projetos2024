
package introducaoaaojava;

import java.util.Scanner;

public class Exercicio10 {public static void main(String[] args) {
        Scanner entrada =new Scanner(System.in);
            System.out.println("Informe o valor da parede 1");
            double parede1 = entrada.nextDouble();
            System.out.println("Informe o valor da parede 2");
            double parede2 = entrada.nextDouble();
            
            double resultado = Math.sqrt(Math.pow (parede1,2)+ Math.pow (parede2,2));
            System.out.println(resultado);
    }
    
}
