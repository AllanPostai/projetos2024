
package desvioscondicionais;

import java.util.Scanner;

public class Exercicio02 {public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
            System.out.println("Informe um numero qualquer");
            double numero =entrada.nextDouble();
            
           if(numero %2==0){
            System.out.println("É par");
           }
           else{
               System.out.println("É impar");
           }
            
           
    }
    
}
