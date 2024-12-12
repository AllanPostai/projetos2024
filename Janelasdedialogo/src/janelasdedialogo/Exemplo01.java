
package janelasdedialogo;

import javax.swing.JOptionPane;

public class Exemplo01 {public static void main(String[] args) {
        String primeiroNome = JOptionPane.showInternalInputDialog(null, "Informe o seu primeiro nome");
        String nomeDoMeio = JOptionPane.showInputDialog(null, "Informe seu nome do meio");
        String sobreNome = JOptionPane.showInputDialog(null, "Informe o seu sobrenome");
        String nomeCompleto = primeiroNome+" "+nomeDoMeio+" "+sobreNome;
        JOptionPane.showInputDialog(null, "nomeCompleto", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
 