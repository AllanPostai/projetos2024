package Array;

import java.util.Scanner;

public class Exercicio08 {

    Scanner entrada = new Scanner(System.in);
    String produtos[] = new String[10];
    double preco[] = new double[10];
    int estoque[] = new int[10];
    int quantidadeDeProdutos = 0;
    double faturamento[] = new double[10];

    public static void main(String[] args) {
        Exercicio08 minhaClasse = new Exercicio08();
        minhaClasse.preencherListas();
        int opcao = 0;
        do {
            opcao = minhaClasse.mostrarMenu();
            switch (opcao) {
                case 0:
                    minhaClasse.motrarRelatorioDeProdutos();
                    break;
                case 1:
                    minhaClasse.cadastrarProduto();
                    break;
                case 2:
                    minhaClasse.realizacaoDeVendas();
                    break;
                case 3:
                    minhaClasse.exibirFatoramentoTotal();
                    break;
                case 4:
                    minhaClasse.produtoMaisVendido();
                    break;
                case 5:
                    minhaClasse.ProdutoComMaiorFaturamento();
                    break;
                case 6:
                    minhaClasse.exibirListaDeEstoqueBaixo();
                    break;
            }
        } while (opcao != 7);
    }

    public int mostrarMenu() {
        System.out.println("1. Cadastrar Produto \n"
                + "2. Realizar Venda \n"
                + "3. Exibir Faturamento Total \n"
                + "4. Exibir Produto mais Vendido \n"
                + "5. Exibir Produto com Maior Faturamento \n"
                + "6. Relatório de Estoque Baixo \n"
                + "7. Sair do Programa \n"
                + "Escolha uma opção (1-7):");
        int opcaoEscolhida = entrada.nextInt();
        return opcaoEscolhida;
    }

    public void cadastrarProduto() {
        System.out.println("Informe o nome do produto");
        produtos[quantidadeDeProdutos] = entrada.next();
        System.out.println("Informe o preço do produto");
        preco[quantidadeDeProdutos] = entrada.nextDouble();
        System.out.println("Informe o estoque do produto");
        estoque[quantidadeDeProdutos] = entrada.nextInt();
        quantidadeDeProdutos++;
    }

    public void realizacaoDeVendas() {
        System.out.println("Informe o nome do produto vendido!");
        String nome = entrada.next();
        System.out.println("Solicite a quantidade vendida!");
        int quantidade = entrada.nextInt();
        for (int i = 0; i < quantidadeDeProdutos; i++) {
            if (nome.equalsIgnoreCase(produtos[i])) {
                if (quantidade <= estoque[i]) {
                    estoque[i] = estoque[i] - quantidade;
                    faturamento[i] += quantidade * preco[i];
                    System.out.println("Produto vendido com sucesso!");
                } else {
                    System.out.println("Quantidade insuficiente para fazer a venda!");
                    return;
                }
            }
        }
        System.out.println("Esse produto não foi encontrado!");
    }

    public void exibirFatoramentoTotal() {
        System.out.println("Fatoramento total");
        for (int i = 0; i < quantidadeDeProdutos; i++) {
            System.out.println(produtos[i] + ":" + faturamento[i]);
        }
    }

    public void produtoMaisVendido() {
        System.out.println("Produto mais vendido");
        double campeaoDeVendas = 0;
        int indice = 0;
        for (int i = 0; i < quantidadeDeProdutos; i++) {
            if (campeaoDeVendas < (faturamento[i] / preco[i])) {
                campeaoDeVendas = faturamento[i] / preco[i];
                indice = i;
            }

        }
        System.out.println(produtos[indice] + " foi o produto mais vendido com "
                + "" + campeaoDeVendas + " unidades ");
    }

    public void ProdutoComMaiorFaturamento() {
        System.out.println("Produto com maior faturamento");
        double maiorFaturamento = 0;
        int indice = 0;
        for (int i = 0; i < quantidadeDeProdutos; i++) {
            if (maiorFaturamento < faturamento[i]) {
                maiorFaturamento = faturamento[i];
                indice = i;
            }
        }
        System.out.println(produtos[indice] + " foi o produto com maior faturamento ");
    }

    public void exibirListaDeEstoqueBaixo() {
        for (int i = 0; i < quantidadeDeProdutos; i++) {
            if (estoque[i] < 10) {
                System.out.println(produtos[i] + ":" + estoque[i]);
            }
        }
    }

    public void motrarRelatorioDeProdutos() {
        System.out.println(
                formatarSaida("Nome", 20)
                + formatarSaida("Preço", 10)
                + formatarSaida("Estoque", 10));
        for (int i = 0; i < quantidadeDeProdutos; i++) {
            System.out.println(formatarSaida(produtos[i], 20)
                    + formatarSaida("R$ " + preco[i], 10)
                    + formatarSaida("" + estoque[i], 10));
        }
    }

    public String formatarSaida(String texto, int tamanho) {
        while (texto.length() < tamanho) {
            texto = " " + texto;
        }
        return texto;
    }

    public void preencherListas() {
        produtos[0] = "Arroz";
        produtos[1] = "Feijão";
        produtos[2] = "Erva";
        preco[0] = 12.05;
        preco[1] = 16.55;
        preco[2] = 11.12;
        estoque[0] = 10;
        estoque[1] = 20;
        estoque[2] = 30;
        quantidadeDeProdutos = 3;
    }
}
