
package introducaoaojava.Lacofor;

import java.util.Scanner;

public class Exercicio01 {public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
            System.out.println("Informe um valor qualquer");
            int numero = entrada.nextInt();
            
            for (int i = 1; i <= 1000000; i++) {
                System.out.println(i+" x "+ numero+ " = "+ i*numero);
            }
    }
    
}
