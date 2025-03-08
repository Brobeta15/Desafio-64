
package Lista_Desafio;

import java.util.Scanner;

public class Desafio_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe um numero inteiro: ");
        int numero = sc.nextInt();
        
        if(numero<=9 && numero>=0){
            
            System.out.println("Valor valido ");
        }
        else{
             
            System.out.println("Valor invalido");
        }
        sc.close();
    }
}
