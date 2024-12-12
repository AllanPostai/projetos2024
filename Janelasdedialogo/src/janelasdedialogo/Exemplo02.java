package janelasdedialogo;

import javax.swing.JOptionPane;

public class Exemplo02 {

    public static void main(String[] args) {
        int opcao = JOptionPane.showConfirmDialog(null,
                "Você gosta de programação?",
                "...::: Pergunta :::...",
                JOptionPane.YES_NO_OPTION
        );
        if (opcao == 0) {
            JOptionPane.showConfirmDialog(null,
                    "Gosta de Programação!!! Uhuuuu");

        } else {
            JOptionPane.showMessageDialog(null, "Que pena!");
        }
    }

}
