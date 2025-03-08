
package Lista_Desafio;

import java.util.Scanner;

public class Desafio_47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] numeros = new int[10];
        int contMaior = 0;
        int contMenor = 0;
        int contIgual = 0;
        
        for (int i = 0; i < 10; i++) {
            
            System.out.println("Informe um numero inteiro maior que zero: ");
            numeros[i] = sc.nextInt();
            
            while(numeros[i]<0){
                System.out.println("Informe outro numeros: ");
                numeros[i] = sc.nextInt();
            }
        }
        System.out.println("Informe um numero maior que 0: ");
        int n = sc.nextInt();
        
        while(n<0){
            System.out.println("Informe outro numero: ");
            n = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            
            if(numeros[i]>n){
                contMaior++;
            }
            if(numeros[i]<n){
                contMenor++;
            }
            if(numeros[i]==n){
                contIgual++;
            }
        }
        System.out.println("Quantidade de numeros maiores que "+n+": "+contMaior+"\n");
        System.out.println("Quantidade de numeros menores que "+n+": "+contMenor+"\n");
        System.out.println("Quantidade de numeros iguais que "+n+": "+contIgual);
        
        sc.close();
    }
}
