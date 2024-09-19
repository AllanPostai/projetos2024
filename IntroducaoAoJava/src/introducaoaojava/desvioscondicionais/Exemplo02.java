
package desvioscondicionais;

import java.util.Scanner;

public class Exemplo02 {public static void main(String[] args) {
        Scanner entrada =new Scanner(System.in);
            System.out.println("Informe um valor qualquer");
            int valor = entrada.nextInt(); 
            if(valor<0) {
                System.out.println("valor negativo");
            }else{
                System.out.println("valor positivo");
            }

}
    
}
