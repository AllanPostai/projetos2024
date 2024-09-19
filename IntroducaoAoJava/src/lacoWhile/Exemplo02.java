package lacoWhile;

import java.util.Scanner;

public class Exemplo02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o usuário");
        String usuario = entrada.next();
        System.out.println("Informe a senha");
        String senha = entrada.next();

        int contador = 1;

        while (usuario.equals(senha) && contador < 3) {
            System.out.println("Informe o usuário");
            usuario = entrada.next();
            System.out.println("Informe a senha");
            senha = entrada.next();
            contador = contador + 1;
        }
        if (contador == 3 && usuario.equals(senha)) {
            System.out.println("login incorreto!");
        } else {
            System.out.println("Acesso permitido"); 
        }
    }
}