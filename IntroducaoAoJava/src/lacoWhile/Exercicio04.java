package lacoWhile;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //pessoa mais alta 
        int codigopessoamaisalta=0;
        double alturapessoamaisalta = 0;
        double pessoamaisalta = 0;
        //pessoa mais baixa
        int codigopessoamaisbaixa=0;
        double alturapessoamaisbaixa = 15;
        double pessoamaisbaixa = 0;
        //pessoa mais gorda
        int codigopessoamaisgorda=0;
        double pesopessoamaisgorda = 0;
        double pessoamaisgorda = 0;
        //pessoa mais magra
        int codigopessoamaismagra=0;
        double pesopessoamaismagra = 1000;
        double pessoamaismagra = 0;

        double pesototal = 0;
        double alturatotal = 0;
        int cont = 0;

        int cod = -1;
        while (cod != 0) {
            System.out.println("Informe o código do cliente:");
            int codigo = entrada.nextInt();
            System.out.println("Informe a altura do cliente:");
            double altura = entrada.nextDouble();
            System.out.println("Informe o peso do cliente:");
            double peso = entrada.nextDouble();

            if (altura > alturapessoamaisalta) {
                codigopessoamaisalta = cod;
                alturapessoamaisalta = altura;
                pessoamaisalta = peso;
            }

            if (altura < alturapessoamaisbaixa) {
                codigopessoamaisbaixa = codigo;
                alturapessoamaisbaixa = altura;
                pessoamaisbaixa = peso;
            }

            if (peso < pessoamaismagra) {
                codigopessoamaisgorda = codigo;
                pesopessoamaismagra = peso;
                pessoamaismagra = altura;
            }

            if (peso > pesopessoamaisgorda) {
                codigopessoamaisgorda = codigo;
                pesopessoamaisgorda = peso;
                pessoamaisgorda = altura;
            }
            pesototal += peso;
            alturatotal += altura;
            cont++;
            
            System.out.println("Opções: "
                    + "\n0 - para sair "
                    + "\n1 - para um novo cadastro");
            cod = entrada.nextInt();
            }
        
        System.out.println("pessoa mais alta: "
                + "\nCodigo "+ codigopessoamaisalta+ ""
                + "\nPeso: "+ pessoamaisalta+ ""
                + "\nAltura"+alturapessoamaisalta);
        
        System.out.println("pessoa mais baixa: "
                + "\nCodigo "+ codigopessoamaisbaixa+ ""
                + "\nPeso: "+ alturapessoamaisbaixa+ ""
                + "\nAltura"+ pessoamaisbaixa);
        
        System.out.println("pessoa mais gorda: "
                + "\nCodigo "+ codigopessoamaisgorda+ ""
                + "\nPeso: "+ pesopessoamaisgorda+ ""
                + "\nAltura"+ pessoamaisgorda);
        
        System.out.println("pessoa mais magro: "
                + "\nCodigo "+ codigopessoamaismagra+ ""
                + "\nPeso: "+ pesopessoamaismagra+ ""
                + "\nAltura"+ pessoamaismagra);
        
        System.out.println("media de altura"+ (alturatotal / cont));
        System.out.println("media de peso"+ (pesototal / cont));
        
    }
    

}
