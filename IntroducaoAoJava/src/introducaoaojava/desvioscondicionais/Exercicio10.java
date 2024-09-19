
package introducaoaojava.desvioscondicionais;

import java.util.Scanner;

public class Exercicio10 {public static void main(String[] args) {
         Scanner entrada =new Scanner(System.in);
            System.out.println("Numero de identificação");
            int identificacao =entrada.nextInt();
            System.out.println("Informe a nota 1");
            double nota1 =entrada.nextDouble();
            System.out.println("Informe a nota 2");
            double nota2 =entrada.nextDouble();
            System.out.println("Informe a note 3");
            double nota3 =entrada.nextDouble();
            System.out.println("Informe a média dos exercícios");
            double media =entrada.nextDouble();
            
            double ma = (nota1 + nota2 * 2 + nota3 * 3 + media)/7;
            if (ma>=90){
                System.out.println("Aluno" + identificacao + "Foi aprovado com conceito a");
            }else if(ma >=75){
                 System.out.println("Aluno" + identificacao + "Foi aprovado com conceito b");
            }else if(ma >=60){
                System.out.println("Aluno" + identificacao + "Foi aprovado com conceito c");
            }else if(ma >=40){
                 System.out.println("Aluno" + identificacao + "Foi reprovado com conceito d");
            }else{
                System.out.println("Aluno" + identificacao + "Foi reprovado com conceito e");
            }
            
               
          
          }
    
}
