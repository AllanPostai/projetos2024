
package desvioscondicionais;

import java.util.Scanner;


public class Exercicio08 {public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
            System.out.println("Informe o peso");
            double peso =entrada.nextDouble();
            System.out.println("Informe altura");
            double altura =entrada.nextDouble();
            double IMC =peso/Math.pow(altura,2);
            
            if (IMC<18.5) {
                System.out.println("abaixo do peso");
                
            }else if (IMC<25) {
                System.out.println("peso normal");
                
            }else if (IMC<30) {
                System.out.println("acima do peso");
                
            }else{
                System.out.println("obeso");
            }
    
}
}
