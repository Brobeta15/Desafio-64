
package Lista_Desafio;

import java.util.Scanner;

public class Desafio_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe um numero: ");
        double n1 = sc.nextDouble();
        
        System.out.println("Informe um segundo numero: ");
        double n2 = sc.nextDouble(); 
        
        System.out.println("Informe o que voce deseja: 1-adicao,2-subtracao,3-multiplicacao,4-divisao ");
        int opcao = sc.nextInt();
        
        switch (opcao){
            case 1:
                System.out.println("O resultado da adicao: "+(n1+n2));
                break;
                
            case 2:
                System.out.println("O resultado da adicao: "+(n1-n2));
                break;
                
            case 3:
                System.out.println("O resultado da adicao: "+(n1*n2));
                break;
                
            case 4:
                if(n2!=0){
                    System.out.println("O resultado da adicao: "+(n1/n2));
                }
                else{
                    System.out.println("Nao é possivel divisao por 0");
                }
                break;
            default:
                System.out.println("Opcao invalida");
                throw new AssertionError();
        }
        sc.close();
    }
}
