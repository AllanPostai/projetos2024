
package introducaoaaojava;

import java.util.Scanner;

public class Exercicio07 {public static void main(String[] args) {
        Scanner entrada =new Scanner(System.in);
            System.out.println("Calculo de media de notas");
            System.out.println("Informe a nota 1");
            double nota1 = entrada.nextDouble();
            System.out.println("Informe nota 2");
            double nota2 = entrada.nextDouble();
            System.out.println("Informe nota 3");
            double nota3 = entrada.nextDouble();
            
            System.out.println((nota1 * 2 + nota2 * 3 + nota3 * 5 )/ 10);
            
            
            
            
    }
    
}
