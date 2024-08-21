
package introducaoaaojava;

import java.util.Scanner;

public class Exercicio08 {public static void main(String[] args) {
        Scanner entrada =new Scanner(System.in);
            System.out.println("Informe a base");
            int base = entrada.nextInt();
            System.out.println("Informe o expoente");
            int expoente = entrada.nextInt();
            
            double resultado = Math.pow(base, expoente);
            System.out.println("Reasultado =" + resultado);
                
                
    }
    
}
