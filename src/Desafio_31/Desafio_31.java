
package Lista_Desafio;

import java.util.Scanner;

public class Desafio_31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = 1;
        int somaPar = 0;
        int somaImpar = 0;
                
        while(n>=0){
            
            System.out.println("Informe um numero: ");
            n = sc.nextInt();
            
            if(n>=0){
                if(n%2==0){
                
                    System.out.println("E par!\n");
                    somaPar = somaPar + n;
                }
                else{
                
                    System.out.println("E impar!\n");
                    somaImpar = somaImpar + n;
                }
            }
        }
        System.out.println("A soma dos numero pares : "+somaPar);
        System.out.println("A soma dos numero impares: "+somaImpar);
        
        sc.close();
    }
}
