package Array;

import java.util.Scanner;

public class Exercicio07 {

    Scanner entrada = new Scanner(System.in);
    String[] alunos = new String[10];
    double[] notasProgramacao = new double[10];
    double[] notasRedes = new double[10];
    double[] notasManutencao = new double[10];
    double[] notasDados = new double[10];
    double[] medias = new double[10];
    int quantidadeDeAlunosCadastrados = 0;
    int quantidadeDeNotasCadastradas = 0;

    public static void main(String[] args) {
        Exercicio07 minhaClasse = new Exercicio07();
        int opcao = 0;
        do {
            opcao = minhaClasse.mostrarMenu();
            switch (opcao) {
                case 0:
                    minhaClasse.mostrarRelatorioDeAlunos();
                    break;
                case 1:
                    minhaClasse.cadastroAluno();
                    break;
                case 2:
                    minhaClasse.cadastrarNotas();
                    break;
                case 3:
                    minhaClasse.calcularMedias();
                    break;
                case 4:
                    minhaClasse.mostrarRelatorioDeAlunos();
                    break;
                case 5:
                    minhaClasse.exibirAlunoComMaiorMedeia();
                    break;
                     case 6:
                    minhaClasse.exibirAlunoComMaiorNotaPorDisciplina();
                    break;
                    case 7:
                    minhaClasse.mostrarResultadoFinal();
                    break;
                case 8:
                    break;
                default:
                    System.out.println("Opção válida!!!");
                    break;
            }

        } while (opcao != 8);

    }

    public int mostrarMenu() {
        System.out.println("=== Menu de Opções === \n"
                + "0. Mostrar relatório \n"
                + "1. Cadastrar Alunos \n"
                + "2. Cadastrar Notas \n"
                + "3. Calcular Médias \n"
                + "4. Exibir Médias \n"
                + "5. Exibir Aluno com Maior Média \n"
                + "6. Exibir Aluno com Maior Nota em determinada Disciplina \n"
                + "7. Exibir lista de alunos com o resultado final (aprovado ou reprovado) \n"
                + "8. Sair do Programa \n"
                + "Escolha uma opção (1-8):");
        int opcaoEscolhida = entrada.nextInt();
        return opcaoEscolhida;
    }

    public void cadastroAluno() {
        System.out.println("Informe o nome do aluno: ");
        alunos[quantidadeDeAlunosCadastrados] = entrada.next();
        quantidadeDeAlunosCadastrados++;
    }

    public void cadastrarNotas() {
        System.out.println("Informe a nota da diciplina de programação: ");
        notasProgramacao[quantidadeDeNotasCadastradas] = entrada.nextDouble();

        System.out.println("Informe a nota da diciplina de redes: ");
        notasRedes[quantidadeDeNotasCadastradas] = entrada.nextDouble();

        System.out.println("Informe a nota da diciplina de manutenção: ");
        notasManutencao[quantidadeDeNotasCadastradas] = entrada.nextDouble();

        System.out.println("Informe a nota da diciplina de dados: ");
        notasDados[quantidadeDeNotasCadastradas] = entrada.nextDouble();

        quantidadeDeNotasCadastradas++;
    }

    public void mostrarRelatorioDeAlunos() {
        for (int i = 0; i < quantidadeDeAlunosCadastrados; i++) {
            System.out.println(alunos[i] + ": "
                    + notasProgramacao[i] + ";"
                    + notasManutencao[i] + ","
                    + notasDados[i] + ","
                    + notasRedes[i] + " - média = "
                    + medias[i]);

        }
    }

    public void calcularMedias() {
        for (int i = 0; i < quantidadeDeNotasCadastradas; i++) {
            medias[i] = (notasDados[i] + notasManutencao[i] + notasProgramacao[i] + notasRedes[i]) / 4;

        }

    }

    public void exibirAlunoComMaiorMedeia() {
        double maiorMedia = 0;
        int indice = 0;
        for (int i = 0; i < quantidadeDeAlunosCadastrados; i++) {
            if (maiorMedia < medias[i]) {
                maiorMedia = medias[i];
                indice = i;
            }

        }
        System.out.println(alunos[indice]
                + "ficou com a maior médeia geral. Media: " + medias[indice]);
    }

    public void exibirAlunoComMaiorNotaPorDisciplina() {
        double maiorNota = 0;
        int indice = 0;
        System.out.println("Informe a diciplina que deseja consultar");
        String disciplina = entrada.next();
        switch (disciplina) {
            case "programacao":
                for (int i = 0; i < quantidadeDeAlunosCadastrados; i++) {
                    if (maiorNota < notasProgramacao[i]) {
                        maiorNota = notasProgramacao[i];
                        indice = i;
                    }
                }
                break;
            case "redes":
                for (int i = 0; i < quantidadeDeAlunosCadastrados; i++) {
                    if (maiorNota < notasRedes[i]) {
                        maiorNota = notasRedes[i];
                        indice = i;
                    }
                }
                break;
            case "manutencao":
                for (int i = 0; i < quantidadeDeAlunosCadastrados; i++) {
                    if (maiorNota < notasManutencao[i]) {
                        maiorNota = notasManutencao[i];
                        indice = i;
                    }
                }
                break;
            case "dados":
                for (int i = 0; i < quantidadeDeAlunosCadastrados; i++) {
                    if (maiorNota < notasDados[i]) {
                        maiorNota = notasDados[i];
                        indice = i;

                    }
                }
                break;
            default:
                System.out.println("Essa disciplina não existe no curso!");
                break;
        }
        System.out.println(alunos[indice]
                + "Ficou com a maior nota na disciplina de " + disciplina + ":"+maiorNota);
    }

    public void mostrarResultadoFinal() {
        for (int i = 0; i < quantidadeDeAlunosCadastrados; i++) {
            if (medias[i] >= 60) {
                System.out.println(alunos[i] + ": Aprovado!");
            } else {
                System.out.println(alunos[i] + ": Reprovado!");
            }
        }
        
    }
}
