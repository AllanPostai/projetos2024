
package switchCase;

import java.util.Scanner;


public class Exemplo01 {
public static void main(String[] args) {
        Scanner entrada =new Scanner(System.in);
            System.out.println("Calculadora...");
            System.out.println("Infore o valor 1");
            double valor1 = entrada.nextDouble();
            
            System.out.println("Informe a operação");
            String operacao = entrada.next();
            
            System.out.println("Infore o valor 2");
            double valor2 = entrada.nextDouble();
            switch (operacao){
                case "+":
                    System.out.println("resultado =" + (valor1 + valor2));
                    break;
                case "-":
             System.out.println("resultado =" + (valor1 - valor2));  
             break;
              case "*":
               System.out.println("resultado =" + (valor1 * valor2));  
             break;    
               case "/": 
               System.out.println("resultado =" + (valor1 / valor2)); 
               break;
               default:
                   System.out.println("Operação nao suportada"); 
                   break;
                           
           }
            
    }
    
}
