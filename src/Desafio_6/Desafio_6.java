
package Lista_Desafio;

import java.util.Scanner;

public class Desafio_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe a temperatura em graus celsius: ");
        double celsius = sc.nextDouble();
        
        double F = (9*celsius+160)/5;
        
        System.out.println("A temperatura em graus em Fahrenheit: "+F);
        
        sc.close();
    }
}
