
package Lista_Desafio;

import java.util.Scanner;

public class Desafio_42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe um numero: ");
        int n = sc.nextInt();
        
        int maior = n;
        int menor = n;
        
        while(n!=0){
            
            if(n!=0){
                
                if(n>maior){
                    maior = n;
                }
                else if(n<menor){
                    menor=n;
                }
                
                System.out.println("Informe um numero: ");
                n = sc.nextInt();
            }
        }
        System.out.println("O maior numero "+maior+"\n");
        System.out.println("O menor numero "+menor);
        
        sc.close();
    }
}
