package Array;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class ArrayExercícioparaprova01 {

    String[] atletas = new String[10];
    boolean[] provaCompletada = new boolean[10];
    double[] tempo = new double[10];
    int[] quantidadedeVoltas = new int[10];
    int quantidadedeAtletas = 0;
    int resultadosRegistrados = 0;

    public static void main(String[] args) {
        ArrayExercícioparaprova01 exp = new ArrayExercícioparaprova01();
        int op = 0;
        do {
            op = exp.mostrarMenu();
            switch (op) {
                case 1:
                    exp.cadastrarAtleta();
                    break;
                case 2:
                    exp.registrarResultado();
                    break;
                case 3:
                    exp.exibirRelatorio();
                    break;
                case 4:
                    exp.exibirRelatorioDeAtletasQueCompletaramAProva();
                    break;
                case 5:
                    exp.exibirRelatorioDeAtletasQueNaoCompletaramAProva();
                    break;
                case 6:
                    exp.atletaComMelhorDesempenho();
                    break;
                case 7:
                    exp.numeroTOtaDeVoltas();
                    break;
            }
        } while (op != 8);
    }

    public int mostrarMenu() {
        return Integer.parseInt(JOptionPane.showInputDialog(null, "Menu de opções:\n"
                + "1 Cadastrar atleta na competição;\n"
                + "2 Registrar resultado de um atleta (completar prova, tempo de conclusão e voltas completadas);\n"
                + "3 Exibir relatório completo dos atletas;\n"
                + "4 Exibir relatório de atletas que completaram a prova;\n"
                + "5 Exibir relatório de atletas que não completaram a prova;\n"
                + "6 Exibir o atleta que concluiu a prova no menor tempo;\n"
                + "7 Exibir o número total de voltas completadas por todos os atletas;\n"
                + "8 Sair da aplicação"));
    }

    public void cadastrarAtleta() {
        atletas[quantidadedeAtletas] = JOptionPane.showInputDialog("Informe o nome do atleta:");
        provaCompletada[quantidadedeAtletas] = false;
        quantidadedeVoltas[quantidadedeAtletas] = 0;
        quantidadedeAtletas++;

    }

    public void registrarResultado() {
        String atleta = JOptionPane.showInputDialog("Informe o nome do atleta:");
        for (int i = 0; i < quantidadedeAtletas; i++) {
            if (atletas[i].equalsIgnoreCase(atleta)) {
                provaCompletada[i] = true;
                tempo[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe o tempo da prova: "));
                quantidadedeVoltas[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de voltas completadas"));
                resultadosRegistrados++;
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Este atleta não está cadastrado!");
    }

    public void exibirRelatorioDeAtletasQueCompletaramAProva() {
        String saida = "RELATÓRIO DE ATLETAS - PROVA COMPLETA\n";
        for (int i = 0; i < quantidadedeAtletas; i++) {
            if (provaCompletada[i]) {
                saida += atletas[i] + "\n";
            }
        }
        JOptionPane.showMessageDialog(null, saida);
    }

    public void exibirRelatorio() {
        String saida = "RELATORIO COMPLETO DE ATLETAS\n";
        for (int i = 0; i < quantidadedeAtletas; i++) {
            saida += atletas[i] + "\n";
        }
        JOptionPane.showMessageDialog(null, saida);
    }

    public void exibirRelatorioDeAtletasQueNaoCompletaramAProva() {
        String saida = "RELATÓRIO DE ATLETAS - PROVA NÃO COMPLETA\n";
        for (int i = 0; i < quantidadedeAtletas; i++) {
            if (!provaCompletada[i]) {
                saida += atletas[i] + "\n";
            }
        }
        JOptionPane.showMessageDialog(null, saida);
    }

    public void numeroTOtaDeVoltas() {
        int total = 0;
        for (int i = 0; i < quantidadedeAtletas; i++) {
            total += quantidadedeVoltas[i];
        }
        JOptionPane.showMessageDialog(null, "Total de voltas completadas por todos os atletas:");

    }

    public void atletaComMelhorDesempenho() {
        if (resultadosRegistrados > 0) {
            double melhorDesempenho = tempo[0];
            for (int i = 0; i < quantidadedeAtletas; i++) {
                if (provaCompletada[i]) {
                    if (melhorDesempenho > tempo[i]) {
                        melhorDesempenho = tempo[i];
                    }
                }
            }
            JOptionPane.showMessageDialog(null, "MELHOR DESEMPENHO: " + melhorDesempenho);

        }
    }
}
