
package Lista_Desafio;

import java.util.Scanner;

public class Desafio_56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] numeros = new int[50];
        int cont = 0;
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Informe um numero: ");
            numeros[i] = sc.nextInt();
            
            if(numeros[i]%2==0 && numeros[i]%5==0){
                
                cont++;
            }
        }
        System.out.println("A quantidade de numeros pares e multiplos de 5 e: "+cont);
        
        sc.close();
    }        
}
