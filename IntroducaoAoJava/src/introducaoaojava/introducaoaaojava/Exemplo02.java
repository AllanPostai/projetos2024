
package introducaoaaojava;

import java.util.Scanner;


public class Exemplo02 {
    public static void main(String[] args) {
            System.out.println("Vamos calcular o peso ideal");
            System.out.println("informe a sua altura");
            Scanner entrada =new Scanner(System.in);
            double altura = entrada.nextDouble();
            double pesoIdeal = (72.7 * altura) - 58;
            System.out.println("o seu peso ideal é"+ pesoIdeal);
}}
