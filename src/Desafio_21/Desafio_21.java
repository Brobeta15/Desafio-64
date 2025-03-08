
package Lista_Desafio;

import java.util.Scanner;

public class Desafio_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Caso desejar sair digite 0\n");
        System.out.println("Informe um valor: ");
        int valor = sc.nextInt();
        
        while(valor!=0){
            
            if(valor<0){
                System.out.println("Negativo\n");
            }
            else{
                System.out.println("Positivo\n");
            }
            System.out.println("Informe um valor: ");
            valor=sc.nextInt();         
        }
        sc.close();
    }
}
