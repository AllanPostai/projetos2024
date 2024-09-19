
package introducaoaojava.desvioscondicionais;

import java.util.Scanner;

public class Exercicioextra02 {public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
            System.out.println("Coeficiente a)");
            double a = entrada.nextDouble();
            System.out.println("Coeficiente b)");
            double b = entrada.nextDouble();
            System.out.println("Coeficiente c)");
            double c = entrada.nextDouble();
            
            double delta = Math.pow(b, 2) - (4*a*c);
            
            if (a==0 && b==0){
                System.out.println("equação é degenerada");
            }else {
             if(a==0 && b!=0){
                 System.out.println("X=" + (-c/b));
            }else {
                 if (a!=0 && c==0){
                     System.out.println("X=0");
                     System.out.println("X2=" + (-b/a));
             }else {
                     if (a != 0 && c != 0 && delta >= 0){
                         System.out.println("X1="
                         + ((-b + Math.sqrt(delta))) / (2 * a));
                         System.out.println("X1="
                         + ((-b - Math.sqrt(delta))) / (2 * a));
                     }else{
                         if (a != 0 && c != 0 && delta < 0){
                             System.out.println("As raízes são complexas");
                         }
                     }
                 }
            }
        
    }
    
}

}
