package temp;

import javax.swing.JOptionPane;

class AtividadeComplementar {

    String[] atletas = new String[10];
    boolean[] provaCompletada = new boolean[10];
    double[] tempo = new double[10];
    int quantidadeDeAtletas = 0;
    int[] quantidadeDeVoltas = new int[10];
    int resultadosRegistrados = 0;

    public static void main(String[] args) {
        AtividadeComplementar ac = new AtividadeComplementar();
        int op = 0;
        do {
            op = ac.mostrarMenu();
            switch (op) {
                case 1:
                    ac.cadastrarAtleta();
                    break;
                case 2:
                    ac.registrarResultado();
                    break;
                case 3:
                    ac.exibirRelatorio();
                    break;
                case 4:
                    ac.exibirRelatorioDeAtletasQueCompletaramAProva();
                    break;
                case 5:
                    ac.exibirRelatorioDeAtletasQueNaoCompletaramAProva();
                    break;
                case 6:
                    ac.exibirAtletaComMelhorDesempenho();
                    break;
                case 7:
                    ac.numeroDeVoltas();
                    break;
            }
        } while (op != 8);

    }

    public int mostrarMenu() {
        return Integer.parseInt(JOptionPane.showInputDialog(null, "MENU"
                + "\n1. Cadastrar atleta na competição;"
                + "\n2. Registrar resultado de um atleta (completar prova, tempode conclusão e voltas completadas"
                + "\n3. Exibir relatório completo dos atletas)"
                + "\n4. Exibir relat´rio de atletas que completaram a prova;"
                + "\n5. Exibir relatório de atletas que não completaram a prova;"
                + "\n6. Exibir o atleta que concluiu a prova em menos tempo;"
                + "\n7. Exibir o número total de voltas completadas por todos os atletas;"
                + "\n8. Sair da aplicação"));
    }

    public void cadastrarAtleta() {
        atletas[quantidadeDeAtletas] = JOptionPane.showInputDialog(null, "Informe o nome do atleta: ");
        provaCompletada[quantidadeDeAtletas] = false;
        quantidadeDeVoltas[quantidadeDeAtletas] = 0;
        quantidadeDeAtletas++;

    }

    public void registrarResultado() {
        String atleta = JOptionPane.showInputDialog("Informe o nome do atleta");
        for (int i = 0; i < quantidadeDeAtletas; i++) {
            if (atletas[i].equalsIgnoreCase(atleta)) {
                provaCompletada[i] = true;
                tempo[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe o tempo levado para completar a prova: "));
                quantidadeDeVoltas[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de voltas:"));
                resultadosRegistrados++;
                return;
            }
            JOptionPane.showMessageDialog(null, "Esse atleta não está cadastrado!");
        }
    }

    public void exibirRelatorio() {
        String saida = "Exibir relatório completo:\n";
        for (int i = 0; i < quantidadeDeAtletas; i++) {
            saida += atletas[i] + "\n";
        }
        JOptionPane.showInputDialog(null, saida);
    }

    public void exibirRelatorioDeAtletasQueCompletaramAProva() {
        String saida = "Relatório completo - prova completa: \n";
        for (int i = 0; i < quantidadeDeAtletas; i++) {
            if (provaCompletada[i]) {
                saida += atletas[i] + "\n";
            }
        }
        JOptionPane.showMessageDialog(null, saida);
    }

    public void exibirRelatorioDeAtletasQueNaoCompletaramAProva() {
        String saida = "Relatório completo - Prova não completada:\n";
        for (int i = 0; i < quantidadeDeAtletas; i++) {
            if (!provaCompletada[i]) {
                saida += atletas[i] + "\n";
            }
        }
        JOptionPane.showMessageDialog(null, saida);

    }

    public void exibirAtletaComMelhorDesempenho() {
        if (resultadosRegistrados > 0) {
            double melhorDesempenho = tempo[0];
            for (int i = 0; i < quantidadeDeAtletas; i++) {
                if (provaCompletada[i]) {
                    if (melhorDesempenho > tempo[i]) {
                        melhorDesempenho = tempo[i];
                    }
                }
                
            }
          

        }
    }

    public void numeroDeVoltas() {
        int total = 0;
        for (int i = 0; i < quantidadeDeAtletas; i++) {
            total += quantidadeDeVoltas[i];

        }
        JOptionPane.showMessageDialog(null, "quantidade totalde voltas completas:" + total);
    }

}
