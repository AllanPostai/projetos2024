package switchCase;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o valor");
        int valor = entrada.nextInt();

        int um = valor /1000;
        int cen = valor %1000/100;
        int dez = valor % 100/10;
        int un = valor % 10;
        String ext = "";

        switch (um) {
            case 1:
                ext = ext + "um mil ";
                break;
            case 2:
                ext = ext + "dois mil ";
                break;
            case 3:
                ext = ext + "três mil ";
                break;
            case 4:
                ext = ext + "quatro mil ";
                break;
            case 5:
                ext = ext + "cinco mil ";
                break;
            case 6:
                ext = ext + "seis mil ";
                break;
            case 7:
                ext = ext + "sete mil ";
                break;
            case 8:
                ext = ext + "oito mil ";
                break;
            case 9:
                ext = ext + "nove mil ";
                break;
        }
        switch (cen) {
            case 1:
                ext = ext + "cem ";
                break;
            case 2:
                ext = ext + "duzentos ";
                break;
            case 3:
                ext = ext + "trezentos ";
                break;
            case 4:
                ext = ext + "quatrocentos ";
                break;
            case 5:
                ext = ext + "quinhentos ";
                break;
            case 6:
                ext = ext + "seicentos ";
                break;
            case 7:
                ext = ext + "setecentos ";
                break;
            case 8:
                ext = ext + "oitocentos ";
                break;
            case 9:
                ext = ext + "novecentos ";
                break;
        }

        switch (dez) {
            case 1:
                ext = ext + "dez ";
                break;
            case 2:
                ext = ext + "vinte ";
                break;
            case 3:
                ext = ext + "trinta ";
                break;
            case 4:
                ext = ext + "quarenta ";
                break;
            case 5:
                ext = ext + "cinquenta ";
                break;
            case 6:
                ext = ext + "sessenta ";
                break;
            case 7:
                ext = ext + "setenta ";
                break;
            case 8:
                ext = ext + "oitenta ";
                break;
            case 9:
                ext = ext + "noventa ";
                break;
        }
        switch (um) {
            case 1:
                ext = ext + "um ";
                break;
            case 2:
                ext = ext + "dois ";
                break;
            case 3:
                ext = ext + "três ";
                break;
            case 4:
                ext = ext + "quatro ";
                break;
            case 5:
                ext = ext + "cinco ";
                break;
            case 6:
                ext = ext + "seis ";
                break;
            case 7:
                ext = ext + "sete ";
                break;
            case 8:
                ext = ext + "oito ";
                break;
            case 9:
                ext = ext + "nove ";
                break;

        }
        System.out.println(ext);
    }

}
