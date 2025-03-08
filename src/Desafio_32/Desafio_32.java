
package Lista_Desafio;

import java.util.Scanner;

public class Desafio_32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
               
        for (int i = 0; i < 10; i++) {
            System.out.println("Informe um valor para calcular a soma do quadrado: ");
            int n1 = sc.nextInt();
            
            while(n1<0 || n1>10 || n1%2==0){
                System.out.println("Numero invalido! Informe outro numero: ");
                n1 = sc.nextInt();
            }    
            System.out.println("Informe um segundo valor para calcular a soma do quadrado: ");
            int n2 = sc.nextInt();
              
            while(n2<0 || n2>10 || n2%2==0){
                System.out.println("Numero invalido! Informe outro numero: ");
                n2 = sc.nextInt();
            }
            int resultado = (n1*n1) + (2 * n1 * n2) + (n2*n2);
            System.out.println("O resultado do quadrado da soma de "+n1+" e "+n2+" e: "+resultado);
            
            System.out.println("\n");
        }
        sc.close();         
    }
}
