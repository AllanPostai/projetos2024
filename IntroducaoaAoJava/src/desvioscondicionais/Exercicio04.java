
package desvioscondicionais;

import java.util.Scanner;

public class Exercicio04 {public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
            System.out.println("Informe um valor qualquer");
            int numero =entrada.nextInt();
            
            if(numero>0){
                System.out.println(numero *2);
            }
            if(numero<0) {
                System.out.println(numero *3);
            }
     
          
    }
    
}
