
package lacoWhile;

import java.util.Scanner;

public class Exemplo03 {public static void main(String[] args) {
        Scanner entrada =new Scanner(System.in);
            System.out.println("Informe o nome");
            String nome = entrada.next();
            while(nome.length() <= 3){
                System.out.println("Informe um nome com mais de 3 caracteres");
                nome = entrada.next();
            }
            //validando idade
            System.out.println("Informe a idade");
            int idade = entrada.nextInt();
            while(idade < 0 || idade > 150){
                System.out.println("Informe uma idade entre 0 a 150 anos");
                idade = entrada.nextInt();
            }
            //validando salario
            System.out.println("Informe um valor");
            double salario = entrada.nextDouble();
            while(salario < 0){
                System.out.println("Informe o salário");
                salario = entrada.nextDouble();
            }
            //validando sexo
            System.out.println("Informe o sexo");
            String sexo = entrada.next();
            while(!sexo.equalsIgnoreCase("f") && !sexo.equalsIgnoreCase("m")){
                System.out.println("Informe o sexo");
                sexo = entrada.next();
            }
            //validandoestado civil
            System.out.println("Informe o estado civil");
            String estado = entrada.next();
            while(!"scvd".contains(estado) && estado.length()>1){
                System.out.println("Informe estado civil (s,c,v,d)");
                estado = entrada.next();
            }
    }
    
}
