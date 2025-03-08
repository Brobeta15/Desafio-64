
package Lista_Desafio;

import java.util.Random;
import java.util.Scanner;

public class Desafio_50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Random aleatorio = new Random();
  
        int numero = aleatorio.nextInt(101);
        int n;
        int cont = 0;
        
        do {            
            System.out.println("Qual e o numero? ");
            n = sc.nextInt();
            
            cont++;
            if(n>numero){
                System.out.println("O numero sortiado e menor que "+n);
            }
            else{
                    System.out.println("O numero sortiado e maior que "+n);
            }
            
        } while(n!=numero);
        
        System.out.println("A quantidade de tentativas feitas: "+cont);
        
        sc.close();
    }
}
