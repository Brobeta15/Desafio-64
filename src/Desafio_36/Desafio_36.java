
package Lista_Desafio;

import java.util.Scanner;

public class Desafio_36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int contador = 0;
        int soma = 0;
        
        System.out.println("Informe um numero: ");
        int n = sc.nextInt();
        
        int maior = n;
        int menor = n;
        
        while(contador<10){
            
            soma=soma+n;
            contador++;
                   
           if(n>maior){
               maior=n;
           }
           else if(n<menor){
               menor=n;
           }
           
           if(contador<10){
                System.out.println("Informe um numero: ");
                n = sc.nextInt();   
           } 
        }
        System.out.println("O maior numero: "+maior);
        System.out.println("O menor numero: "+menor);
        double media = soma/contador;
        System.out.println("A media de todos os numeros: "+media);
        
        sc.close();
    }
}
