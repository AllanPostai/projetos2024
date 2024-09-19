
package desvioscondicionais;

import java.util.Scanner;

public class Exercicio03 {public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
            System.out.println("Informe o valor A");
            int valorA =entrada.nextInt();
            System.out.println("Informe o valor B");
            int valorB =entrada.nextInt();
            
            if(valorA == valorB){
                System.out.println(valorA + valorB);
            }else{
                System.out.println(valorA * valorB);
            }
       
            
    }
    
}
