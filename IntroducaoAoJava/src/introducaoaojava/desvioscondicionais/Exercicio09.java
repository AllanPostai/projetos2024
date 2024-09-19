
package desvioscondicionais;

import java.util.Scanner;

public class Exercicio09 {public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
            System.out.println("valor do produto");
            double valor =entrada.nextDouble();
            System.out.println("forma de pagamendo \n"
                    + "a)Pagamento a vista \n"
                    + "b)A vista no cartao de credito \n"
                    + "c)Em duas vezes \n"
                    + "d)Em 10 vezes");
            String formaDePagamento =entrada.next();
            if (formaDePagamento.equals("a")){
                System.out.println("Valor Final ->"+ valor*0.9);
            }else if (formaDePagamento.equals("b")){
                System.out.println("Valor Final ->"+ valor*0.85);
            }else if (formaDePagamento.equals("c")){
                System.out.println("Valor Final ->"+ valor);
            }else if (formaDePagamento.equals("d")){
                System.out.println("Valor Final ->"+ valor*1.1);
            }else {
                System.out.println("Forma de pagamento inválida!");
            }
            
           
            
                    
    }
  
   
    
}
