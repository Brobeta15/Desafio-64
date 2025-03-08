
package Lista_Desafio;

import java.util.Scanner;

public class Desafio_39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char sair = 'N';
        
        do{
            System.out.println("Informe um numero: ");
            int numero = sc.nextInt();
            
            sc.nextLine();
            
            if(numero>0){
                
                System.out.println(numero+" e positivo");
            }
            else if(numero<0){
                
                System.out.println(numero+" e negativo");
            }
            else{
                System.out.println("0 nao possuie sinal.");
            }
            if(numero%2==0){
                
                System.out.println("e par");
            }
            else{
                System.out.println("e impar");
            }
            
            System.out.println("Deseja sair (Digite s para sim ou n para nao?");
            sair = sc.nextLine().toUpperCase().charAt(0);
            
        }while(sair=='N');
        
        sc.close();
    }
}
