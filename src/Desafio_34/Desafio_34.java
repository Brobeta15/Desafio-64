
package Lista_Desafio;

import java.util.Scanner;

public class Desafio_34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe um numero positivo: ");
        int numero = sc.nextInt();
      
        int maior = numero;
        int menor = numero;
         
        while(numero>=0){
            
            if(numero>=0){
                
                if(numero>maior){
                    
                    maior=numero;
                }
                else if(numero<menor){
                    
                    menor=maior;
                }
                System.out.println("Informe um outro numero positivo: ");
                numero = sc.nextInt();
            }
        }
        if(maior>=0 && menor>=0){
            System.out.println("O maior e: "+maior);
            System.out.println("O menor e: "+menor);
        }
        else{
            System.out.println("Nenhum numero positivo informando");
        }
        sc.close();
    }
}
