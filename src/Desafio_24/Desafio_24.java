
package Lista_Desafio;

import java.util.Scanner;

public class Desafio_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe um numero: ");
        int n1 = sc.nextInt();
        
        System.out.println("Informe um segundo numero: ");
        int n2 = sc.nextInt();
        
        System.out.println("\n");
        System.out.println("O que voce deseja fazer um esses numero?");
        System.out.println("1-Verificar se um dos numeros lidos e ou nao multiplo do outro");
        System.out.println("2 – Verificar se os dois numeros lidos sao pares");
        System.out.println("3 – Verificar se a media dos dois numeros e maior ou igual a 7");
        System.out.println("4 – Sair");
        int opcao = sc.nextInt();
        
        switch (opcao) {
            case 1:
                System.out.println("Ambos sao multiplos. Resultado da Multiplicacao :"+n1*n2);
                break;
            case 2:
                int par1 = n1%2;
                int par2 = n2%2;
                
                if(par1==0 && par2==0){
                    System.out.println("Ambos sao pares");
                }
                else if(par1!=0 && par2==0){
                    System.out.println("O primeiro numero e impar e o segundo par");
                }
                else{
                    System.out.println("O primeiro numero e par e o segundo impar");
                }
                break;
            case 3:
                int media = (n1+n2)/2;
                
                if(media>=7){
                    System.out.println("A media e maior ou igual a 7");
                }
                else{
                    System.out.println("Media e menor que 7");
                }
                break;
            case 4:
                System.out.println("Obrigado(a) pela sua atencao!");
                break;    
            default:
                System.out.println("Opcao invalida");
                throw new AssertionError();
        }
        sc.close();
    }
}
