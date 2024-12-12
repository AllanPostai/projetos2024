package janelasdedialogo;

import javax.swing.JOptionPane;

public class Exercicio03 {

    String[] cores = {"Amarelo", "Verde", "Vermelho", "Azul"};
    String[] comidas = {"Churrasco", "Pizza", "Macarronada", "Lasanha"};
    String[] esportes = {"Voleibol", "Futebol", "Corrida", "Pker"};
    String[] cursos = {"Computação", "Veterinária", "Medicina", "Matemática"};

    int[] votosCores = new int[4];
    int[] votosComidas = new int[4];
    int[] votosEsportes = new int[4];
    int[] votosCursos = new int[4];

    public static void main(String[] args) {
        Exercicio03 ex = new Exercicio03();

        do {
        int corEscolhida = JOptionPane.showOptionDialog(null,
                "Qual é sua cor preferida?", "Escolha", 0, 3, null, ex.cores, null);
                ex.votosCores[corEscolhida]++;
                int comidaEscolhida = JOptionPane.showOptionDialog(null, "Qual é a sua comida preferida?", "Escolha", 0, 3, null, ex.comidas, null);
                ex.votosCores [comidaEscolhida]++;
                
        }while(JOptionPane.showConfirmDialog(null, "Tem mais alguém pra responder?")==0);
        
    
 
    }
    
    }

