
package Lista_Desafio;

import java.util.Scanner;

public class Desafio_58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe a quantidade de numeros que devem ser lidos: ");
        int n = sc.nextInt();
        
        int[] numeros = new int[n];
        int soma = 0;
        
        for (int i = 0; i < n; i++) {
            
            System.out.println("Informe um numero: ");
            numeros[i] = sc.nextInt();
            
            while(numeros[i]<0){
                
                System.out.println("Numero Invalido. Informe outro numero: ");
                numeros[i] = sc.nextInt();
            }
            soma+=numeros[i];
        }
        int maiorNumero = numeros[0];
        
        for (int i = 1; i < n; i++) {
             
            if(numeros[i]>maiorNumero){
                maiorNumero = numeros[i];
            }
        }
        System.out.println("A media dos numeros e: "+soma/n);
        System.out.println("O maior numero do vetor e: "+maiorNumero);
        
        sc.close();
    }
}
