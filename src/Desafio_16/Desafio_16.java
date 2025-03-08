
package Lista_Desafio;

import java.util.Scanner;

public class Desafio_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe um numero: ");
        double n1 = sc.nextDouble();
        
        System.out.println("Informe um segundo numero: ");
        double n2 = sc.nextDouble();
        
        if (n1>n2){
            
            System.out.println("O maior e: "+n1);
            System.out.println("O menor e: "+n2);
        }
        else if(n2>n1){
            
            System.out.println("O maior e: "+n2);
            System.out.println("O menor e: "+n1);
        }
        else{
            
            System.out.println("Ambos sao iguais");
        }
        sc.close();  
    }
}
