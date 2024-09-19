package introducaoaojava.desvioscondicionais;

import java.util.Scanner;

public class Exercicioextra01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //Descrição de valores iniciais
        String usuario = "Allan";
        String senha = "matheusyt00";
        double saldo = 100000.0;
        String numeroConta = "1234";

        //Fazer login
        System.out.println("Acessando conta");
        System.out.println("usuario: ");
        String loginUsuario = entrada.next();
        System.out.println("senha: ");
        String loginSenha = entrada.next();

        String extrato = "      Extrato     "
                + "\n*****************************"
                + "\nNOME: " + usuario + ""
                + "\nNº Conta " + numeroConta + "\n"
                + "\nSaldo Anterior " + saldo;

        //Verificar acesso 
        if (loginUsuario.equals(usuario) && (loginSenha.equals(senha))) {
            System.out.println("ACESSO LIBERADO");
            System.out.println("Informe o que dezeja fazer"
                    + "\nS - Saque"
                    + "\nD - Deposito");
            String operacao = entrada.next();

            switch (operacao) {
                case "S":
                    System.out.println("Informe o valor a sacar");
                    double valorSaque = entrada.nextDouble();
                    saldo = saldo - valorSaque;
                    extrato = extrato + "\nSaque" + valorSaque;
                    break;
                case "D":
                    System.out.println("Informe o valor a depositar");
                    double valorDeposito = entrada.nextDouble();
                    saldo = saldo + valorDeposito;
                    extrato = extrato + "\nDeposito" + valorDeposito;
                    break;
                default:
                    System.out.println("Operação Inválida!");
                    break;
            }
            extrato = extrato + "\nSaldo atual" + saldo + "\n"
                    + "*************************";
            System.out.println(extrato);

        } else {
            System.out.println("Usuário ou senha inválidos");

        }

    }

}
