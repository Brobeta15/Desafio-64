
package Lista_Desafio;

import java.util.Scanner;

public class Desafio_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe a temperatura em graus fahrenheit: ");
        double f = sc.nextDouble();
        
        double c = (f-32)*5/9;
        
        System.out.println("A temperatura em celsius e: "+c);
        
        sc.close();
    }
}
