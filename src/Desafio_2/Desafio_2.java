
package Lista_Desafio;

import java.util.Scanner;

public class Desafio_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe a cotacao do dolar: ");
        double cotacao = sc.nextDouble();
        
        System.out.println("Informe um valor em dolar: ");
        double dolar = sc.nextDouble();
        
        double convercao = dolar*cotacao;
        
        System.out.println("O resulta em real: "+convercao);
        
        sc.close();
    }
}
