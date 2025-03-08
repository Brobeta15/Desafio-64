
package Lista_Desafio;

import java.util.Scanner;

public class Desafio_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
    
        System.out.println("Digite um valor: ");
        int v1=sc.nextInt();
        System.out.println("Digite um segundo valor: ");
        int v2=sc.nextInt();
        System.out.println("Digite um terceiro valor: ");
        int v3=sc.nextInt();
        System.out.println("Digite um quarto valor: ");
        int v4 = sc.nextInt();
        
        int soma = (v1+v2)+(v1+v3)+(v1+v4)+(v2+v3)+(v2+v4)+(v3+v4);
        System.out.println("A soma dos valores sera: "+soma);
        
        int multiplicacao = (v1*v2)*(v1*v3)*(v1*v4)*(v2*v3)*(v2*v4)*(v3*v4);
        System.out.println("O resultado da multiplicacao sera: "+multiplicacao);
        
        sc.close();
    }
}
