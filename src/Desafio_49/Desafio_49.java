package Lista_Desafio;

import java.util.Scanner;

public class Desafio_49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] v1 = new int[5];
        int[] v2 = new int[5];
        int contIguais = 0;
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Informe um numero para v1: ");
            v1[i] = sc.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um numero para v2: ");
            v2[i] = sc.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            if(v1[i]==v2[i]){
                contIguais++;
            }
        }
        System.out.println("A quantidade de numeros iguais na mesma posicao foi: "+contIguais);
        
        sc.close();
    }
            
}
