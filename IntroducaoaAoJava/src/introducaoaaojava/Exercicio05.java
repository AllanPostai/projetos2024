
package introducaoaaojava;

import java.util.Scanner;

public class Exercicio05 {public static void main(String[] args) {
         Scanner entrada =new Scanner(System.in);
            System.out.println("informe o salário mensal atual de um funcionário");
            double salario = entrada.nextDouble();
            System.out.println("informe o reajuste");
            double reajuste =entrada.nextDouble();
            System.out.println(reajuste / 100 * salario + salario);
            
    }
    
}
