
package desvioscondicionais;

import java.util.Scanner;

public class Exercicio07 {public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
            System.out.println("Informe o sexo");
            String sexo =entrada.next();
            System.out.println("Informe a altura");
            double altura =entrada.nextDouble();
            double pesoIdeal;
            
            if (sexo.equalsIgnoreCase("M")){
                pesoIdeal = 72.7 * altura -58;
                System.out.println("Peso ideal -" + pesoIdeal);
            }else if (sexo.equalsIgnoreCase("F")) {
                pesoIdeal= 62.1 * altura -44.7;
                System.out.println("Peso ideal  " + pesoIdeal);
                
                
            }else{
                System.out.println("Não é possivel calcular o peso ideal,"
                        + "pois o sexo informado não é valido");
            }
    }
    
}
