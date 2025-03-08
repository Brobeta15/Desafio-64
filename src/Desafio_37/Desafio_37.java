
package Lista_Desafio;

import java.util.Scanner;

public class Desafio_37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char voltar = 'S';
        
        do{
            System.out.println("Escolha uma das opcoes: ");
            System.out.println("1-adicao, 2-subtracao, 3-multiplicacao e 4-divisao ");
            System.out.println("Digite o numero de sua escolha: ");
            int opcao = sc.nextInt();
        
            System.out.println("Digite o primeiro numero: ");
            int n1 = sc.nextInt();
            System.out.println("Digite o segundo numero: ");
            int n2 = sc.nextInt();
        
            switch (opcao) {
                case 1:
                        System.out.println("O resultado da Adicao e "+(n1+n2));
                        System.out.println("\n");
                    break;
                case 2:
                        System.out.println("O resultado da subtracao e "+(n1-n2));
                        System.out.println("\n");
                    break;
                case 3:
                        System.out.println("O resultador da multiplicacao e: "+(n1*n2));
                        System.out.println("\n");
                    break;
                case 4:
                        System.out.println("O resultado da divisao :"+(n1/n2));
                        System.out.println("\n");
                        if(n2==0){ 
                            System.out.println("Nao existe divisao por 0");
                            System.out.println("\n");
                        }
                    break;
                default: System.out.println("Opcao invalida");
                    throw new AssertionError();
            }
            sc.nextLine();
            
            System.out.println("Deseja voltar ao menu principal (Sim ou Nao): ");
            voltar = sc.nextLine().charAt(0);
            
        }while(voltar=='S' || voltar=='s');
        
        sc.close();
    }
}
