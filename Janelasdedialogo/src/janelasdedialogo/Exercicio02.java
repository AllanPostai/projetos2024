package janelasdedialogo;

import javax.swing.JOptionPane;

public class Exercicio02 {

    public static void main(String[] args) {

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor inteiro"));
        String saida = "TABUADA de " + numero + "\n";
        for (int i = 1; i < 10; i++) {
            saida = saida + (i + " x " + numero + " = " + i * numero + "\n");
        }
        JOptionPane.showMessageDialog(null, saida);
    }

}
