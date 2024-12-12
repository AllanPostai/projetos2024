package janelasdedialogo;

import javax.swing.JOptionPane;

public class Exercicio01 {

    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Informe um valor inteiro!"));
        String divisores = "";
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                divisores += i + "; ";
            }
        }
        JOptionPane.showMessageDialog(null, "São divisores de " + numero + ":"
                + "\n" + divisores);
    }

}
