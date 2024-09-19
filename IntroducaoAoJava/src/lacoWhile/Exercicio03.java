package lacoWhile;

public class Exercicio03 {

    public static void main(String[] args) {

        int a = 0;
        int b = 1;
        int c = 0;
        System.out.print(a+ " ");
        System.out.print(b+ " ");
        
        while (c < 500) {
            c = a + b;
            a = b;
            b = c;

            System.out.print(c+ " ");
        }
    }
}
