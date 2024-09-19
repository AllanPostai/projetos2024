
package introducaoaaojava;

import java.util.Scanner;

 
public class IntroducaoaAoJava {

   
    public static void main(String[] args) {
        System.out.println("Olá mundo!!!");
        Scanner entrada =new Scanner(System.in);
        System.out.println("Vamos somar dois números");
        System.out.println("informe o valor para o número 1:");
        int numero1 = entrada.nextInt();
        System.out.println("informe o valor para o número 2:");
        int numero2 = entrada.nextInt();
        int resultado = numero1 + numero2;
        System.out.println("a soma deu "+ resultado);
            
    }
    
}
